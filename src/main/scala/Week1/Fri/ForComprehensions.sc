
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

//This example has a classic and a function in front of it
def retrieveNumbers: Seq[Int] = for (number <- 1  to 10) yield number //Seq[Int} wil return a sequence of Ints
retrieveNumbers
//retrieveNumbers is the function
//Seq means a list of things in order and will return an Int
//for (number <- 1  to 10) is the LOOP
//yield number is take each number and add it to our list or
//(1 to 10 ).foreach (number => println (number))
//retrieveNumbers to call it

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



//A STRING of animals made into a METHOD

val animals: List [String] = List ("Moose", "Peacock", "Dog", "Hamster", "Cat")

//Convert a STRING to a METHOD
def animalList (): List [String] = {
  List ("Moose", "Peacock", "Dog", "Hamster", "Cat")
}
//VAl to call
val animals = animalList ()
println (animals)


//manipulate this list using a method (TIP: Methods start with 'def')
//add and 'S' to the end of every animal
//the word map is lower case here not Map
//MAKE A PLURAL LIST OF ANIMALS
def addS (animalList:List [String]): List [String] = animalList.map(animal => animal + "s")
addS (animals)

//Lets lowercase them now
//TIP: Rocket => means we want you to do something
def lowerCaseAnimals (animalList: List [String]): List [String] = animalList.map(animal => animal.toLowerCase)
lowerCaseAnimals(animals)

//What if I want lowercase and add an 'S'?? - full comp allows us to do this
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


//TASK FROM LESSON
//Task 1a - Write a simple method that will take in a list of names and return them all in lowercase
//Step 1 - make a list
// Step 2: Use a method to lowercase it
//TIP: Rocket => means we want you to do something, map in lowercase
val animals: List [String] = List ("Peacock", "Dog", "Hamster", "Cat")

def lowerCaseAnimals (animalList: List [String]): List [String] = animalList.map(animal => animal.toLowerCase)
lowerCaseAnimals(animals)

//Task 1b - Write a simple method that will take in list of names and return them with only the first letter capitalised.
//Run both methods using this list: val names: List [String] = List ("aRia", "BaRT", "ChUCk")
//Step 1 - make a list (already given above)
// Step 2: Use a method to capitalise the first word only.
//TIP: Rocket => means we want you to do something, map in lowercase

val names: List[String] = List("aRIa", "BaRT", "ChUCk")

def lowercaseNames(nameInput: List[String]):List[String] = nameInput.map(name => name.toLowerCase)
def capitaliseNames(nameInput: List[String]):List[String] = nameInput.map(name => name.capitalize)
//result is Aria! Bart! Chuck!
println (names)

val lowercasedNames = lowercaseNames(names)
println (lowercasedNames)

// TASK 2 - NOT CALLING 2 METHODS JUST 1 - FOR COMPREHENSIONS
// I want to be able to do task 1 in a single method, so I don't always have to call 2 methods
//A possible start
//def capitaliseList(nameInput: List[String]): List[String] =

val names: List[String] = List("aRIa", "BaRT", "ChUCk")

def capitaliseList(nameInput: List[String]): List[String] =
  for {
    lower <- lowercaseNames(nameInput) //apply the lower case method
    capital <- capitaliseNames(List(lower)) //apply the capitalize method
  } yield capital

println(capitaliseList(names))

capitaliseList(names).map(name => name + "!").mkString(" ") //String = Aria! Bart! Chuck!

//Write for-comprehension that takes a list of numbers and creates
//a new list containing the squares of the even numbers from that list.
//You'll want to filter for even numbers and then square each of them.

val numbers: List [Int] = List (1,2,3,4,5,6,7,8,9,10)
val squaredEvens: List [Int] =
  for {
  number <- numbers if number % 2 == 0 // Filter for even numbers
} yield number * number // Square each even number

// Print the result
println(squaredEvens) //List(4, 16, 36, 64, 100)

//Write a Scala for-comprehension that takes a list of integers
//filters out the odd numbers, squares the even numbers,
// and then adds 5 to each squared value.
val numbersList: List [Int] = List (1,2,3,4,5,6,7,8,9,10)
val squared: List [Int] =
for {
    number <- numbersList if number % 2 == 0 // Filter for even numbers
  } yield (number * number)+ 5// Square each even number

// Print the result
println(squared) //List(9, 21, 41, 69, 105)

//Write for-comprehension that takes a list of integers
// filters out the numbers that are divisible by 3,
// then double the remaining numbers, and finally subtracts 1 from each of those doubled values.
val sandraNumbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

val result: List[Int] = for {
  number <- sandraNumbers if number % 3 != 0    // Filter out numbers that are divisible by 3
} yield (number * 2) - 1                     // Double the remaining numbers and subtract 1

// Print the result
println(result) //List(1, 3, 7, 9, 13, 15, 19)

//Write a for-comprehension that processes a list of pairs of integers (tuples).
//Filter for pairs where the first number is greater than 3.
//For the remaining pairs, compute the sum of the numbers in each pair.
//Create a new list that consists of tuples where each tuple contains the
// original pair and the sum computed in the previous step.
//Requirements: Use a nested for-comp.

val pairs: List[(Int, Int)] = List((1, 2), (3, 4), (5, 6), (7, 8))
val result : List [((Int, Int), Int)] =
  for {
    (num1, num2) <- pairs if num1 >3
  } yield ((num1, num2), num1 + num2)
println(result) //List(((5,6),11), ((7,8),15))