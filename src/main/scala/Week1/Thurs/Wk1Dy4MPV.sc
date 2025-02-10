//Must remember the capitals letters in Maps, Seq & List when you are matching it to a key or value

//Q1a Make a List of the numbers from 1-5
val numberList: List [Int] = List (
  1,
  2,
  3,
  4,
  5
)

//Q1a part II Make a Seq of the primary colours
val primaryColours : Seq [String] = Seq (
    "red",
    "yellow",
    "blue"
  )

//Q1b Write a function to multiply all the values in your List by 3
val tripleList: List[Int] = numberList.map{
  number => number * 3}

//Q1c Write a function that removes 'blue' from above primaryColours
//blue seems to be the tail
//remove with a tail function or removeLast?
//USe filter or filter not??
val removeLast = primaryColours.init

//APRIL'S CODE FOR Q1c
primaryColours.filter( col => col != "Blue")

//Q1d Write a function that returns true if my 'primaryColours' contains Orange
//First I tried a boolen as I wanted a yes/no answer: something like:
// val existsList: Boolean = primaryColours.exists(string => string "orange")

val containsColourOrange = primaryColours.exists (name => name.contains("orange"))

//OR APRILS CODE FOR Q1d:
primaryColours.contains("Orange")

//Q2 Write a function that maps each value in your List to true or false depending if they are odd.

//Ran out of time for Q2 - had an idea of using modulus but not sure

//APRIL'S CODE for Q2:
numberList.map(num => num % 2 == 1)

//Q3 David has many pets; 2 dogs, 1 fish and 1 cat.
//Q3 a) Make a map which details the key -> value pair of "Name -> "Animal"
//At first I started out with a [String, Int] whereby 1= dog, 2 = fish, 3 = cat

val animalMap: Map[String, String] = Map(
  "Rufus" -> "dog",
  "Honey" -> "dog",
  "Olive" -> "fish",
  "Flossy" -> "cat"
)

//Q3 b) Write a function that returns a list of David's dogs.
//needs to return Rufus and Honey from a MAP[String, String] therefore if the 2nd String matches to "dog" return the 1st string value of "Rufus" and "Honey"

//ATTEMPTS
//val filterNotList: Map[String] = animalMap.filterNot(string => string != "fish" || "cat")
//val filteredDogNames: Map [String, String] = animalMap.filter( name, "dog") => dogNames )
//val filteredAnimalMap: Map[String, String] = animalMap.filter( string => string = "dog")
//val dogNames: Map [String] = animalMap.filter ( )
//val filteredAnimals: Map[String, Int] = animalMap.filter(
  //string => string._2 >= 2
//)
val filteredAnimalMap: Map[String, String] = animalMap.filter( string => string._2 == "dog")

//APRILS ANSWER DIFFERENT TO MINE:
val davidsPets: Map[String, List[String]] = Map(
  "Dog" -> List("Spot", "Marvin"),
  "Fish" -> List("Deborah"),
  "Cat" -> List("Paul")
)
animalMap.filter(pet => pet._1 == "Dog").values.flatten.mkString(", ")//Approach 1
//Use .values to get the List("Spot", "Marvin")
//Use .flatten to get out the List
//Use .mkString to make a string and (", ") does the formatting so , and space between.
animalMap("Dog").mkString(", ")// Approach 2 - simplified

/** EXTENSION APRILS CODE*/

//1. Starting with a Seq(1-9), come up with 2 filters that, when used together, will return Seq(1,2,5,7).
val nums = Seq(1,2,3,4,5,6,7,8,9)
nums.filter(n => n%3 != 0).filter(n => n%4 != 0)

//2. The .head function returns the first element of a list, and the .tail function returns everything except the first element.
// Use head and tail to get the 3rd element of a List.
val a = List(1,2,3,4,5)
val third = a.tail.tail.head


/** RESEARCH APRILS CODE*/

//1. What makes a Set different from a Seq? What should Set(1,2) == Set(2,1,1,1) return?
//1. Answer: A Set only contains unique values, no duplicates. Will return true.
Set(1,2) == Set(2,1,1,1) //overrides duplicates so Set(2,1)

//2. What do you think List(3,4) == Seq(3,4) will return? Why? What about List(5,6) == Set(5,6)?
//2. Answer:
List(3,4) == Seq(3,4)
// Will return true, since scala checks the elements against each other, and they are comparable data types.
List(5,6) == Set(5,6)
// Will return false, since these data types store data in different ways (ordered vs unordered).