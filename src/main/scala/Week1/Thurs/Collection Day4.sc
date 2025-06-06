/** COLLECTIONS
 * How do we store collections??
 */
// Seq, List, Map

//Immutable - read-only, cannot be re-assigned
//Most common are : Maps, Sequences & Lists (TIP: Again notice the uppercase)

/** SEQUENCES
 * How do we display the Int 1,2,3,4,5 in common forms??
 * We are going to store in a val but we don't necessarily need to:
 * these don't have keys:
 *
 * syntax is val giveItAName: [Int or String] = Seq or List (number,number,number or "string", "String" etc)
 */

val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5) //Seq[Int] =List(1,2,3,4,5)

val firstList: List[Int] = List(1, 2, 3, 4, 5) //List[Int] =List(1,2,3,4,5)
//The index position of above is 1=0, 2=1, 3=2 etc like an array in JScript
//Anything we can do to a List we can do to a Seq!
//What is diff between Seq and List?? They are two diff types of collections
//A list is immutable.

/** TASK 1 */
//1. Create a Seq of the names of everybody on the course
val seqOfMyNames: Seq[String] = Seq("Mary", "Molly", "Milly", "Mandy", "Marie")

/**
 * MAP
 * We can link two things together using MAP
 * syntax is val giveItAName: Map [e.g String, Int] = Map (
 * Key -> Value,   if string will have "" comma
 * TIP:  Notice Map is in capital letters each time
 */

//Map has key value pairs (key -> value) declare both key and value in the parameters
val firstMap: Map[String, Int] = Map(
  //String        //Int
  //Key           //Value
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "Four" -> 4,
  "Five" -> 5
)
//The word "one" is linked to 1, the word "two" is linked to 2 etc.

/** TASK 1 */
//2. Create a Map of 1-“red”, 2-“yellow”, 3-“blue”, 4-“green” and play with accessing the elements
val myColours: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)
//use a rocket => and the previous myColours val we declared
val filteredForColourBlue: Map[Int, String] = myColours.filter(num => num._1 == 3) //_1 is searching in key and gives Blue
val filteredForColourBlueV2: Map[Int, String] = myColours.filter(num => num._2 == "blue") //_2 is searching in Value and gives Blue
//num._1 refers to the first element of the tuple = the key
//num._2 refers to the second element of the tuple = the value

//In Scala, num => num is an example of a function that takes an input (in this case, num) and produces an output. This syntax is called a lambda expression or anonymous function. In your filter method, num represents each key-value pair in the myColours map.



/** HOW DO WE ACCESS THE DATA?
 *
 * Accessing data from within a sequence use firstSeq
 * val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5) //Seq[Int] =List(1,2,3,4,5)
 */
  //Int type is a primitive data type that represents a single integer value not a collection of integers
// When you see Int in the code, it is not wrapped in [].
val getSequenceData: Int = firstSeq(0) //gives the index position of 1
// 1=0, 2=1, etc. Calling the seq firstSeq created earlier
//When you use firstSeq(0), it actually calls the apply method of the Seq class to retrieve the element at index 0. This is similar to a function call, where you're telling Scala to "apply" the method to retrieve a specific item.

//another val
val getSequence2Data: Int = firstSeq(2) //returns 3
//These have different grammar, it is not wrapped in [].?

//Head and Tail use firstSeq.head and firstSeq.tail
val getSequenceHead: Int = firstSeq.head //index position 0 because 1=0
//This one different grammar, maybe because you don't declare Int[Int]?
val getSequenceTail: Seq[Int] = firstSeq.tail //List(2, 3, 4, 5) Gives everything except head which the index position 0

//val getTooMuchData: Int = firstSeq (12)//we don't have any data in the 12th index position
//errors out with IndexOutofbounds exception

/** TASK 1
 * val firstList: List[Int] = List(1, 2, 3, 4, 5)*/
//3. Add 1 to all numbers in a collection of Ints.

val firstList: List[Int] = List(1, 2, 3, 4, 5)  //here is our list
val addOneSeq = firstList.map { number => number + 1 }   //+1 to each number

//Here { number => number + 1 }  is a lambda/anonymous function. lambda functions help you write functions quickly and flexibly without needing to formally define and name them. Allows for short, quick functions on the fly, making code more concise and expressive. Syntax generally looks like (parameters) => expression

//4.Remove all even numbers from a collection.
val oddNumbersOnly = firstList.filter {
  number => number % 2 != 0
}
//could use filterNot == rather than !=
val oddNumbersOnlyFilterNot = firstList.filterNot {
  number => number % 2 == 0
}
//5. Return true if a Seq has a String that contains the letter “r”.
val seqOfMyNames: Seq[String] = Seq("Mary", "Molly", "Milly", "Mandy", "Marie")
val containsLetterR = seqOfMyNames.exists(name => name.contains("r"))
//the part name => name.contains("r") is a lambda expression

/** LISTS
 * val firstList: List[Int] = List(1, 2, 3, 4, 5)
 *
 * Use parentheses () when you are accessing elements from a collection (like firstList(1)) or when you have a method that takes parameters.
 * Omit parentheses when calling methods that don't take parameters (like firstList.tail and firstList.last), making the code cleaner and easier to read.
 * */

val getList1Data: Int = firstList(1)
//Here, firstList(1) uses parentheses because you're calling the apply method on the firstList to get the element at index 1. In Scala, this is the standard way to access elements in collections.

val getListTail: List[Int] = firstList.tail
//n this case, firstList.tail does not use parentheses because tail is a method that does not require parameters. In Scala, it's common to call methods without parentheses when they don't take any arguments, which improves readability and they are often considered "getter" methods.

val getLastInList: Int = firstList.last
//Similar to tail, last is a method without parameters, so it does not use parentheses.

//MAP
val getMapData = firstMap("three") // val getMapData: Int = 3 (three matches to 3)
//String        //Int
//Key           //Value
//"one"          -> 1,
//"two"          -> 2,
//"three"        -> 3,
//"Four"         -> 4,
//"Five"         -> 5

/** Manipulating data - using .map in lowercase and rocket => */
//Mapping though my list called firstList :
val firstList: List [Int] = List (1,2,3,4,5)
val tripledList: List[Int] = firstList.map {
  number => number * 3
}

//Mapping though my sequence called firstSeq:
val firstSeq: Seq [Int] = Seq (1,2,3,4,5)
val tripledSeq: Seq[Int] = firstSeq.map {
  _ * 3
}

/** Manipulating data - using .map */
// name your data type - it is bad practice to not name your data type
//wrap in a case
//key remains the same word as key
val tripledList: List[Int] = firstList.map {
  number => number * 3
}
val tripledSeq: Seq[Int] = firstSeq.map {
  _ * 3
} // bad practice to not name your data type

//Map [String, Int]
//key
val tripledMap: Map[String, Int] = firstMap.map {
  case (key, value) => (key, value * 3)
}
//key.capitalize
val changeKey: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value)
}
//key.capitalize
val changeKeyAndValue: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value * 3)
}


/** Manipulating data - filtering */
//filter
//filterNot (works similar to are !=)

val filteredSeq: Seq[Int] = firstSeq.filter(
  number => number >= 2
)
val filteredList: List[Int] = firstList.filter(
  number => number >= 2
)

filteredSeq == filteredList //returned true despite the val names being the same we are checking
//for the resulting value

//Filter a map - diff to calling it case
val fileteredMap: Map[String, Int] = firstMap.filter(
  number => number._2 >= 2
)
//Extra step to filter maps:
// _1 to access the key
//_2 to access value

//Val Filter not: find everything that is not this
val filterNotList: List[Int] = firstList.filterNot(
  number => number >= 2
)

val filtereredList: List[Int] = firstList.filter((
  number => !(number >= 2)
  ))

//Checking if anything is there
val filterNotAlternativeList: List[Int]
= firstList.filter(
  number => !(number >= 2)
)

/** Manipulating data - check if an element is present
 * Boolean result
 */
//USING EXISTS
//Get a boolean result
//firstSeq.exists, firstList.exists, firstMap.exists

val existsSeq: Boolean = firstSeq.exists(number => number >= 7) //if there is at least one result will get true
val existsList: Boolean = firstList.exists(number => number >= 2)
val existsMap: Boolean = firstMap.exists(number => number._2 >= 2)


//CONTAINS - give it a specific piece of data to look for e.g do you contain a 2 or 7
//we are looking for one thing
//[valNameYouGaveIt.contains]
val containsSeq: Boolean = filteredSeq.contains(2) //true know it contains a 2
val containsList: Boolean = filteredList.contains(7) //false we know it doesn't contain a 7
val containsMap: Boolean = firstMap.contains("two") //checks the keys not the value!
val containsOrSeq: Boolean = filteredSeq.contains(7) || firstSeq.contains(2)
//does it contain a 7 or  2, ONLY One needs ot be true to give true
//Combine the operators you already know that we learnt too.

/** Making additions - prepend (start) or append (end) */
val x: Seq[Int] = Seq[Int]()
x :+ 1
x :+ 2
x //won't work = immutable

val y: Seq[Int] = Seq(3, 4, 5)
// Append (add to end)
val appendY = y :+ 6
// Prepend (add to start)
val prependY = 2 +: appendY
val multipleInts = Seq(0, 1, 2) +: y
val multipleInts = Seq(0, 1, 2) ++ y
//Append Map
val appendMap = firstMap + ("six" -> 6)
//To order use ListMap rather than Map.
/** Deleting */
val removeHead = firstSeq.tail //remove head
val removeLast = firstSeq.init //remove last index position
//Removing Map
val removeValueInMap = firstMap - "three" //call to the key
val removeMultipleValuesInMap = firstMap - ("three", "one") //call to the key


/** TASK 1 APRILS CODE */
//1. Create a Seq of the names of everybody on the course

val names: Seq[String] = Seq("Scooby", "Shaggy", "Fred", "Velma", "Daphne")

val myNames: Seq[String] = Seq("Mr", "Mrs", "Master")

//2. Create a Map of 1-“red”, 2-“yellow”, 3-“blue”, 4-“green” and play with accessing the elements

//APRILS CODE
val colours: Map[Int, String] = Map(1 -> "red", 2 -> "yellow", 3 -> "blue", 4 -> "green")
val filteredForColourBlue: Map[Int, String] = colours.filter(num => num._1 == 3)
val filteredForColourBlueV2: Map[Int, String] = colours.filter(num => num._2 == "blue")
//num._1 gets the first element of the tuple, which is the key (the integer).
//num._2 gets the second element of the tuple, which is the value (the color name).

//3. Add 1 to all numbers in a collection.
val addOneSeq = firstList.map { number => number + 1 }

//4.Remove all even numbers from a collection.
val oddNumbersOnly = firstList.filter {
  number => number % 2 != 0
}
//could use filterNot == rather than !=
val oddNumbersOnlyFilterNot = firstList.filterNot {
  number => number % 2 == 0
}

//5. Return true if a Seq has a String that contains the letter “r” .
val containsLetterR = names.exists(name => name.contains("r"))

/** TASK 2 */
//1.We have looked at the Seq and Map iterables. We haven’t looked at Sets.
// What are they? How are they different?
//HastSet, SortedSet etc. Cannot contain duplicate elements
// (if we had two names the same for our names list, we wouldn't be able to use a set).
//2. flatMap is another cool method we can call on collections. Research what is does and when it could be useful. Write an example.
//Combo of map and flatten method. You can iterate through each item, apply a function and separate them (the inner grouping is removed). This is helpful in cases where you need to access data that is buried e.g. lists within lists.
val flatMapNames: Seq[Char] = names.flatMap(_.toCharArray) //print char
val flatMapNames: Seq[Char] = names.flatMap(_.toUpperCase) //can apply functions to each char
//returns a Seq[char] rather than strings



