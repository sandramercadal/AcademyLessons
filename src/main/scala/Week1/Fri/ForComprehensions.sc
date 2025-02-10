
/**FOR COMPREHENSIONS
 lightweight notation for a sequence of methods in one go
 sometimes we don't want to call 6 methods to get to the end point
 They only work on Collections we learnt on WK1 Day4 e.g monadic types incl. sequences, list, option,
 either, future, etc not on INT or strings or Booleans (workaround is to wrap in an option)

 TIPS:
 1) <- (IMPORTANT SYNTAX) shorthand way for built-in methods / simple way of writing a function.
 2) End with word "yield" (IMPORTANT SYNTAX) "yield" -- is to call the map
 3) With Classic - Key Syntax is always "for"
 4) Syntax is also (flatmap, filter, map, foreach)

 Real life situation:
 Imagine we have to validate a password, there's so many checks we need.
 Does it match xyz, does it have an uppercase etc so lots of methods).
*/

//CLASSIC
//wrap in methods so we can call them. Key word is 'for'

//Simple CLASSIC example
for (numbers <- 1 to 10) yield numbers
//Gives me a list of numbers from 1 to 10

//This example has a classic and a function in front of it??
def retrieveNumbers: Seq[Int] = for (number <- 1  to 10) yield number
retrieveNumbers
//(1 to 10 ).foreach (number => println (number))

//use operators
//Simple USE OPERATORS example
for (numbers <- 1 to 5) yield numbers * numbers

//squaring it
def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number
squaredNumbers

 //if guards
//list of numbers from 1 to 10 but if odd I don't want this printed
//best way is to use modulars of 2
//if statement within the parenthesis.
def useIfGuard: Seq [Int] = for (number <-1 to 10 if number % 2 == 0 ) yield number
useIfGuard
//removing odd ones



//FUN WITH ANIMALS

val animals: List [String] = List ("Peacock", "Dog", "Hamster", "Cat")

//manipulate this list using a method (TIP: Methods start with 'def')
//add and 'S' to the end of every animal
//lower case map here not Map

def addS (animalList:List [String]): List [String] = animalList.map(animal => animal + "s")
addS (animals)

//Lets lowercase them now
//TIP: Rocket => means we want you to do something
def lowerCaseAnimals (animalList: List [String]): List [String] = animalList.map(animal => animal.toLowerCase)
lowerCaseAnimals(animals)

//What if I want lowercase and add an 'S'?? - full comprehensions allows us to do this
//{ if doing a number of things } use curlies
//TIP: need 'for' and 'yield' and <-
def lowerCaseAndAddS (animalList:List [String]): List [String] = for {
  addAnS <- addS (animalList)
  lowerCase <- lowerCaseAnimals (List(addAnS))
} yield lowerCase
lowerCaseAndAddS(animals)

//you just want it as a list of strings you don't want this wrapped anymore
lowerCaseAndAddS(animals) //gives a list
lowerCaseAndAddS(animals).flatten //gives spaces between letters

lowerCaseAnimals(animals).mkString(" ")//change a list to a string

//make into a capital deosn't seem to run
//capitaliseList(animals).map(name => name + "!").mkString(" ")

lowerCaseAnimals(animals)

//Task 1a animal list we already made
//task 1b Use animal list and and return only the first letter capitalise
def upperCaseAnimals (animalList: List [String]): List [String] = animalList.map(animal => animal.capitalize)
//makes the animals lowercase
upperCaseAnimals(animals)


//Task 1a - Write a simple method that will take in a list of names and return them all in lowercase
//Step 1 - make a list, Step 2: Use a method to lowercase it
//TIP: Rocket => means we want you to do something, map in lowercase
val animals: List [String] = List ("Peacock", "Dog", "Hamster", "Cat")

def lowerCaseAnimals (animalList: List [String]): List [String] = animalList.map(animal => animal.toLowerCase)
lowerCaseAnimals(animals)

//Task 1b - Write a simple method that will take in list of names and return them with only the first letter capitalised.
//Run both methods using this list: val names: List [String] = List ("aRia", "BaRT", "ChUCk")
//Step 1 - make a list (already given), Step 2: Use a method to capitalise the first word only.
//TIP: Rocket => means we want you to do something, map in lowercase

val names: List[String] = List("aRIa", "BaRT", "ChUCk")

def lowercaseNames(nameInput: List[String]):List[String] = nameInput.map(name => name.toLowerCase)
def capitaliseNames(nameInput: List[String]):List[String] = nameInput.map(name => name.capitalize)
//result is Aria! Bart! Chuck!


// TASK 2 - NOT CALLING 2 METHODS JUST 1 - FOR COMPREHENSIONS
// I want to be able to do task 1 in a single method, so I don't always have to call 2 methods
//A possible start
//def capitaliseList(nameInput: List[String]): List[String] =

def capitaliseList(nameInput: List[String]): List[String] =
  for {
    lower <- lowercaseNames(nameInput) //apply the lower case method
    capital <- capitaliseNames(List(lower)) //apply the capitalize method
  } yield capital


//capitaliseList(names).map(name => name + "!").mkString(" ")