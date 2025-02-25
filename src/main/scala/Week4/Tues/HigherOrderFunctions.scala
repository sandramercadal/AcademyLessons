package Week4.Tues

object HigherOrderFunctions extends App {


  //HOF is what they are called not higher order functions
  //DEF: they are a function that EITHER takes in a function as a parameter or return a function as a result
  //Why do we use therm?
  //1. Modular, reuseable code (often easier to read)
  //2. Reduce repeated code (makes code more concise)
  //What do they actually do? Manipulate collections (e.g. map, filter, fold, reduce...)

  /**
   * //HOF - FUNCTIONS AS PARAMETERS
   * i want to pass in as many funct as long as the types match
   */
  //This method will take a function (that is also INT => Int) and it will apply whatever that is, to the given X
  def firstHigherOrderFunction(x: Int, function: Int => Int): Int = function(x) //function is just a name can be called anything. manipulate to do a funmction

  //Now write functions that can be passed into my HOF - must to INT => INT
  //methods match the retunr type of INT => INT
  def addTwo(number: Int): Int = number + 2 //take the number and add 2
  def square(number: Int): Int = number * number
  def double(number: Int): Int = number * 2

  println(firstHigherOrderFunction(3, addTwo)) //5
  println(firstHigherOrderFunction(3, square)) //9
  println(firstHigherOrderFunction(3, double)) //6

  //This method will process a list[String] (a list of string)
  //Problem is we are in a list, we need to do something to the list . take my list of string and map through it  get to each individual element then map
  //Taking in a function as a parameter type
  //must map through the liost to access single element
  //HOF almost like instructions, then write the method to do the thing
  //all of these are taking in a string and returning a string
  def processTheList(listOfString: List[String], function: String => String): List[String] = listOfString.map(function)

  def toUpper(word: String): String = word.toUpperCase

  def addS(word: String): String = word + "s"

  def toLower(word: String): String = word.toLowerCase

  //Lets make a new list of type string
  val newList: List[String] = List("apple", "orange", "mango", "apple")

  println(processTheList(newList, toUpper)) //List(APPLE, ORANGE, MANGO, APPLE) //newList comma passing to newList to Upper
  println(processTheList(newList, addS)) //List(apples, oranges, mangos, apples)
  println(processTheList(newList, toLower)) //List(apple, orange, mango, apple)

  // .calls another method
  // , process the list is called

  //in prod we wont have printlines we ould have ....

  //FOLD left and FOLD right

  /** FOLD LEFT
   * What does it do? it combines or reduces a collection into a single value
   * process the collection from left to right
   * It will store the intermediate value as an 'acc'  (just like recursion). At the end, once the full collection is checked and reduced, it will return the acc
   * //The acc comes first then the element, has to be the same way in a return (acc, element => acc + elenent
   * */

  val numbersList: List[Int] = List(1, 2, 3, 4, 5)
  //Add all numbers in my list
  println(numbersList.foldLeft(0)((acc, nextInt) => acc + nextInt)) //0 is nit the index its the starting point for acc
  //you call your list and you want it to start at front of the list posiotion 0 and
//folding left acc is B
//numbersList.foldleft (0) (_+) this is the shorthand, worked with fold left well b ut with right not so much?

  //Pseudocode
  //Start with 0 so  0+1 = 1 so (acc = 1)
  //Then, (1,2) start with 1 so  1+2 = 3 so (acc = 3)
  //Then  (3,3) => 3+ 3 = 6 (acc = 6)
//  Then (10,5) => 10 + 5 = 15 (final element in the list- we return the acc = 15) //15


  //fold right is same but you use foldright and spin around acc and element.


  //Write a method that takes a list of "string" and returns them as a "string" (List of words into a sentence)
  //nextWordInTheList is the bname i have given it it can be anything
  val stringList = List ("we", "love", "scala")
  println(stringList.foldLeft("")((acc, nextWordInTheList) => acc + nextWordInTheList)) //welovescala  - can make this look prettier. acc starts at '''' which is empty string.
  println(stringList.foldLeft("")((acc, nextWordInTheList) => acc + " " + nextWordInTheList)) //we love scala  -looks prettier
  println(stringList.foldLeft("")((acc, nextWordInTheList) => acc + " " + nextWordInTheList).trim) //.trim removes any white spaces doesnt work for commas


  //Q1) see below
  //val anotherNumbersList: List[Int] = List(1, 2, 3, 4, 5)
  //multiply all numbers in my list
  //println(anotherNumbersList.foldLeft(1)((acc, nextInt) => acc * nextInt)) //1 is not the index its the starting point for acc
  //you call your list and you want it to start at front of the list position 1 and

  //Q1) Tasking in functions as parameters:
    //Use foldLeft to find the product of a list of Ints.
    println(numbersList.foldLeft(1)((acc, nextNumber) => acc * nextNumber)) //Start from 1 here - don't want to multiply by 0

  //Q2) modulus % 2 == 0
//val evenNumbersList = numbersList.filter (_ % 2 == 0)
  //println (evenNumbersList)  //List (2,4)
//Q2)  // Filter the list for even numbers
  numbersList.filter(x => x % 2 == 0)

  //Q3//Use foldLeft to count the number of characters in a string.
  stringList.foldLeft(0)((accCount, word) => accCount + word.length)

  //Q4//Use the map function to iterate through the list and transform the first letter to a capital. Now concatenate it into a sentence.
  stringList.map(word => word.capitalize).foldLeft("")((acc, nextWord) => acc + " " + nextWord).trim


  //.capitalise.word can be used


/** NOW, HOF where FUNCTION IS THE RETURN TYPE
 * can use PMatch or yhe same with if else statements
 COmmonly seen in PMatching /if else, where we want to choose the function based on given criteria
 * */

  //write a function where given the length of employment the percentage pay rise is different
  //Return the final amount paid per year to a particular employee
//1st need an employee: lets make a case class as its bottom level and then every time ew dont have to use new

  case class Employee (name: String, lengthOfEmployment: Int, salary:Double)
  val Amanda = Employee ("Amanda", 2, 30000.0)

  //a method where her salary is going to be double!
  //for each of these methods we arent doing the calcualtions, we will use these to identify which payrise they will get given the criteria of employment length
  def bigPayRise: Double => Double = salary => salary *2   //HOF here //salary can be any givenName
  def mediumRise: Double => Double = salary => salary *1.3   //HOF here  //30% pay rise
  def smallRise: Double => Double = salary => salary * 1.1   //HOF here  //10% pay rise

  //if they have been at the company for less than3 yeasr they the bigPayRise, 5 medium more than 7 Big

  //lets try PMatch
  // (def getPayRiseCalc) - Look at employment length and decide which one of the 3 above methods they are getting
  //calculator for working out whicj pay rise they get
  //so we wnat to get the length of emplyee and match off that
  def getPayRiseCalc (employee: Employee): Double => Double = {
    employee.lengthOfEmployment match {
      case year if year <= 3 => smallRise
      case year if year <= 5 => mediumRise
      case year if year > 5 => bigPayRise //or case _ => bigPayRise  this is a wildcard that catches everything else. we have used less than or equal to 3.
    }
  }
     //Put everything together - this method will return the new salary for a given employee

     def getFinalSalary (employee: Employee): Double = { //we would like to pass in a full employee and just get the answer
       val applyThePayRise: Double => Double = getPayRiseCalc(employee) //store the pay rise function in applyThePayRise either small, med or large
       applyThePayRise (employee.salary)  //what is returned final calc is it big, med or large
     }
  println(getFinalSalary(Amanda)) //£ 33,000.0 is Amandas rise

//if you change the employment type to 5 years she gets 39,000 etc.


  //Write a function for a store
  //20, 40 or 50 % discount depending on the price of the item
  case class Item (price: Double)
  val pictureFrame = Item (56.00)

  //HOF METHOD
  def lessThanTwentyPounds: Double => Double = price => price * 0.8   //HOF here 20 %
  def TwentyToFiftyPounds: Double => Double = price => price * 0.6   //HOF here  40 %
  def moreThanFiftyPounds: Double => Double = price => price * 0.5   //HOF here  50%

  //IF ELSE CASE
  def getDiscountedItem (item: Item): Double => Double = {
    item.price match {
      case price if price > 0 && price < 20.00 => lessThanTwentyPounds
      case price if price <=  50.00 => TwentyToFiftyPounds
      case price if price >  50.00 => moreThanFiftyPounds
    }
  }

  def finalPrice (item: Item): Double = { //we would like to pass in a full employee and just get the answer
    val applyTheDiscount = getDiscountedItem(item) //store the pay rise function in applyThePayRise either small, med or large
    applyTheDiscount (item.price)  //what is returned final calc is it big, med or large
  }
  println(finalPrice(pictureFrame)) //





}
