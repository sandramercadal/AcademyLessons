package Week4.Mon

import scala.annotation.tailrec

object MPVday1WK4 extends App {

  //RECURSION
  //1) Start by looking up the teams that played in the 2024 Euros.
  //a) Create an object called Euro2024 that extends Enumeration. Provide all the
  //teams who participated in the 2024 Euros.
  //notice the use of "Value" here

  object Euro2024 extends Enumeration {
    val albania = Value("Albania")
    val austria = Value("Austria")
    val belgium = Value("Belgium")
    val czechia = Value("Czechia")
    val croatia = Value("Croatia")
    val denmark = Value("Denmark")
    val england = Value("England")
    val france = Value("France")
    val georgia = Value("Georgia")
    val germany = Value("Germany")
    val hungary = Value("Hungary")
    val italy = Value("Italy")
    val netherlands = Value("Netherlands")
    val poland = Value("Poland")
    val portugal = Value("Portugal")
    val romania = Value("Romania")
    val scotland = Value("Scotland")
    val serbia = Value("Serbia")
    val slovakia = Value("Slovakia")
    val slovenia = Value("Slovenia")
    val spain = Value("Spain")
    val switzerland = Value("Switzerland")
    val turkey = Value("Turkey")
    val ukraine = Value("Ukraine")

  }
  //Instead of writing "value" every time it could be
  //object euro2024Teams extends Enumeration {
  //val Spain, England, France = value
//}


  println(Euro2024)
  println(Euro2024.england) //returns England

  //Tail recursive method to print all the teams:
  //IF/ELSE
  //IF/ELSE
  def euroListToString(fullEuroEnums: List[Euro2024.ValueSet]): String = {
    @tailrec
    def euroListToStringRec(euroEnums: List[Euro2024.ValueSet], acc: String): String = {
      if (euroEnums.isEmpty) acc // Base case: empty list
      else {
        val head = euroEnums.head
        val tail = euroEnums.tail
        val makeNiceToRead = if (acc.isEmpty) "" else ", "
        euroListToStringRec(tail, acc + makeNiceToRead + head.toString)
      }
    }

    euroListToStringRec(fullEuroEnums, "")
  }
  println("Q1 using if/else:")
  println(euroListToString(List(Euro2024.values)))
  //MATCH
  def euroListToStringMatch(fullEuroEnums: List[Euro2024.ValueSet]): String = {
    @tailrec
    def euroListToStringRec(euroEnums: List[Euro2024.ValueSet], acc: String): String = {
      euroEnums match {
        case Nil => acc
        case head :: tail =>
          val makeNiceToRead = if (acc.isEmpty) "" else ", "
          euroListToStringRec(tail, acc + makeNiceToRead + head.toString)
      }
    }

    euroListToStringRec(fullEuroEnums, "")
  }
  println("Q1 using Match case:")
  println(euroListToStringMatch(List(Euro2024.values)))

  /** 2) Duplicate MVP Q1 but instead of using Enumeration, implement it using case
   objects.
   a) Make a sealed class of Team which has a constructor parameter ‘name’ which
   is type string and a companion object with the same name.
   b) Enter the case objects inside the companion object. What do you notice about
   accessing the values? */
  sealed class Team(val name: String) //Val in the class params to make it accessible.

  object Team {
    case object albania extends Team("Albania")

    case object austria extends Team("Austria")

    case object belgium extends Team("Belgium")

    case object czechia extends Team("Czechia")

    case object croatia extends Team("Croatia")

    case object denmark extends Team("Denmark")

    case object england extends Team("England")

    case object france extends Team("France")

    case object georgia extends Team("Georgia")

    case object germany extends Team("Germany")

    case object hungary extends Team("Hungary")

    case object italy extends Team("Italy")

    case object netherlands extends Team("Netherlands")

    case object poland extends Team("Poland")

    case object portugal extends Team("Portugal")

    case object romania extends Team("Romania")

    case object scotland extends Team("Scotland")

    case object serbia extends Team("Serbia")

    case object slovakia extends Team("Slovakia")

    case object slovenia extends Team("Slovenia")

    case object spain extends Team("Spain")

    case object switzerland extends Team("Switzerland")

    case object turkey extends Team("Turkey")

    case object ukraine extends Team("Ukraine")
  }

  //There are too many to write out...
  val teamList = List(Team.albania, Team.austria, Team.belgium, Team.czechia, Team.croatia)


  //ADDED Collegues example:
  //sealed class Team (name: String)
  //Object Team {
    //Part b
    //case object Spain
    //case object England
    //case object France

  //val teamList: List [Object] = List(Team.Spain, Team.England, Team.France)
 // println (printableList(teamList))
  //Takes long to access



  //If/else
  def teamNamesToString(teams: List[Team]): String = {
    @tailrec
    def teamNamesToStringRec(remaining: List[Team], acc: String): String = {
      if (remaining.isEmpty) acc // Base case: empty list
      else {
        val head = remaining.head
        val tail = remaining.tail
        val makeNiceToRead = if (acc.isEmpty) "" else ", "
        teamNamesToStringRec(tail, acc + makeNiceToRead + head.name)
      }
    }

    teamNamesToStringRec(teams, "")
  }
  println("Q2 using if/else:")
  println(teamNamesToString(teamList))

  //Match
  def teamNamesToStringMatch(teams: List[Team]): String = {
    @tailrec
    def teamNamesToStringRec(remaining: List[Team], acc: String): String = {
      remaining match {
        case Nil => acc
        case ::(head, tail) =>
          val makeNiceToRead = if (acc.isEmpty) "" else ", "
          teamNamesToStringRec(tail, acc + makeNiceToRead + head.name)
      }
    }

    teamNamesToStringRec(teams, "")
  }
  println("Q2 using Match case:")
  println(teamNamesToStringMatch(teamList))
  //No simple method to access the full list, like we could with enums.



  //Q3
  //Create a method that has an input of a positive Int. This method will return the sum
  //of all numbers between 0 and the input Int.
  //EG The sum of 5 is 15  so 5+4+3+2+1 = 15.
  //This is similar to the Factorial method but uses addition instead of multiplication.

  //I didn't use a val in this example.
  //To find the factorial of a number n! is n * (n-1) * (n-2) * (n-3) * (n-4)

  def factorialAddition(n: Int): Int = {
    if (n <= 0) { //Is n less than or equal to 0?
      0 //base case - return 0 if so. We only want positive numbers.
    } else {
      return n + factorialAddition(n - 1) //What is the current value of n & what is the sum of this value and the results of adding al integers from 1 to n-1
      //add print lines

    }
  }

  println(factorialAddition(5)) // 15 (5+4+3+2+1 = 15)
  //Up the ladder:  n = 5 : factorialAddition 5 =  5+ 4, factorialAddition 4 = 4+ 3,
  // factorialAddition 3 = 3+3, factorialAddition 2 = 2+2, 1+ 1, 0=0
  //back up the ladder: 1+0 =2  2+1 = 3, 3+ 3=6, 4+6 = 10, 5+10 = 15


  //PM case from dorothea
  //def addNumbers1 (N: Int) : Int =
    //n match {
      //case x if x <=
    //}


  //If/else
  def additionCalculator(upperNumber: Int): Int = {
    @tailrec
    def calculation(acc: Int, number: Int): Int = {
      if (number == 0) acc
      else calculation(acc + number, number - 1)
    }

    calculation(0, upperNumber)
  }
  println(additionCalculator(5))

  //Match
  def additionCalculatorMatch(upperNumber: Int): Int = {
    @tailrec
    def calculation(acc: Int, number: Int): Int = {
      number match {
        case 0 => acc
        case _ => calculation(acc + number, number - 1)
      }
    }

    calculation(0, upperNumber)
  }
  println(additionCalculatorMatch(5))

  // MVP Exercise 4

  //val numbers: List[Int] = (1 to 20).toList
  val numbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)

  //IF/ELSE
  def isEven(index: Int): Either[String, Boolean] = {
    @tailrec
    def checkEven(numlist: List[Int], index: Int): Either[String, Boolean] = {
      if (index < 0) Left("Index is out of bounds as negative.") // Negative
      else if (numlist.isEmpty) Left("Index is out of bounds.") // Empty list
      else if (index == 0) Right(numlist.head % 2 == 0) // Check if first element is even
      else checkEven(numlist.tail, index - 1) // Keep tail, decrease index by 1
    }

    checkEven(numlist = numbers, index)
  }
  println("\nQ4 using if/else:")
  isEven(index = -23) //left - out of bounds
  isEven(index = 42) //left - out of bounds
  isEven(index = 0) //right - false = odd
  isEven(index = 1) //right - true = even
  isEven(index = 2) //right - false = odd

  //MATCH
  def isEvenMatch(index: Int): Either[String, Boolean] = {
    // the helper method below will recursively move through a list until it reaches the inputted index position.
    def checkEven(numlist: List[Int], index: Int): Either[String, Boolean] = {
      (numlist, index) match {
        // If index is out of bounds, return an error
        case (_, negNum) if negNum < 0 => Left("Index is out of bounds as negative.")
        //Check empty list
        case (Nil, _) => Left("Index is out of bounds.")
        // If index is 0, check the element for even/odd. x represents the head of the list here and _ represents the tail.
        case (x :: _, 0) => Right(x % 2 == 0)
        // Recursively check the next element. _ represents the head and x represents the tail.
        case (_ :: x, i) => checkEven(x, i - 1) //keep the tail, decrease index position by 1.
      }
    }

    checkEven(numlist = numbers, index)
  }
  println("\nQ4 using match:")
  isEvenMatch(index = -23) //left - out of bounds
  isEvenMatch(index = 42) //left - out of bounds
  isEvenMatch(index = 0) //right - false = odd
  isEvenMatch(index = 1) //right - true = even
  isEvenMatch(index = 2) //right - false = odd
  //Broken down for index = 2
  // first call: hits _ :: x --> 1 :: 2,3,4 etc => checkEven(2,3,4 etc, 2(index position)-1)
  // second call: hits _ :: x --> 2 :: 3,4,5 etc => checkEven(3,4,5etc, 1-0)
  // third call: hits x :: _ --> 3 :: 4,5,6 etc => Right(3 % 2 == 0) == false


  /** Research
   * Enums
   * Pros:
   * Easy to define and use.
   * Built-in support for iterating over values and comparing them.
   * Cons:
   * Less type-safe compared to case objects.
   * Limited extensibility and pattern matching capabilities.
   * Enumeration values are not as rich as case objects, lacking custom methods and fields.
   * Case objects:
   * Pros:
   * Strong type-safety: Each case object is a distinct type, making it easier to catch errors at compile time.
   * Extensible: Case objects can implement traits, contain methods, and have additional fields.
   * Powerful pattern matching: Pattern matching with case objects is more powerful and expressive.
   * Better support for recursion: Since you can define methods and fields, you can more easily use them in recursive algorithms.
   * Cons:
   * Slightly more boilerplate code compared to enumerations.
   *
   * Use enums with simpler code, case objects with more complex code. Remember using 'sealed' will help make matches exhaustive.
   * */

}


/**
 * //TASK
 * //Given this, Write a method using enumeration and tail recursion  that will count the number of times a particular fruit appears in the list.
 * //E.g. Count of Apple:
 * //Factorial is used to calculate combinations and permutations.
 *
 * object  fruit extends Enumeration {
 * type Fruit = Value
 * val Apple, Banana, Orange, Grape, Mango = Value
 * }
 * def countFruit (fruits: List [fruit], targetFruit: Fruit): Int = {
 *
 * @tailrec
 * def countFruitRecv (remaining: List[fruit], acc: Int): Int = {
 *
 * }
 *
 * }
 * //  val fruitList = List (Apple, Orange, Banana, Apple, Mango, Apple, Grape, Banana)
 * //val givenFruit = Apple
 */