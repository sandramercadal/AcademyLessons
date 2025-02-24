package Week4.Mon

import scala.annotation.tailrec

object MPVday1WK4 extends App {

  //RECURSION
  //1) Start by looking up the teams that played in the 2024 Euros.
  //a) Create an object called Euro2024 that extends Enumeration. Provide all the
  //teams who participated in the 2024 Euros.

  object euro2024Teams extends Enumeration { //grouping
  //type euro2024Team = String
  val England: String = "England"
  val Spain: String = "Spain"
  val France: String = "France"
}


  //}
//}
  println(euro2024Teams)
  println(euro2024Teams.England.toLowerCase) //returns england in lower case

  //Tail recursive method to print all the teams:
  //TRY THIS

 // def printTheTeams () : unit = {
   // @tailrec
   // def allTheTeamsHelper (  ) : Unit = {
   // if
  //} else {

    //  allTheTeamsHelper(0)








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