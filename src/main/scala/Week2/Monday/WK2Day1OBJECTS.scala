package Week2.Monday

import Week2.Monday.Objects.mathsConcepts.pi

/**See book notes
 * *trait Numbers {
 * val one = 1
 * val two = 2
 * val 3 = three
 *
 * def addOneAndThre: Int = {
 * one + three
 * def addNumAndTwo: (num: Int) : Int = {
 * num + two
 *
 * }
 * }
 * object Subtractions extends Numbers {
 * def SubtractNumFromFour (num: Int) : Int =
 * { addOneAndThree - num } }
 *
 * object Multoiplications { def multiplyNumAndThree (num: Int) : Int {
 * num * Subtractions.three }
 *
 * def multiplyTwoAndThree : Int = {
 * import Subtractions._ two * three
 * }
 * }
 *
 *
 */


/** OBJECTS
 If something needs to be used again and again we make it in a class.
 sometimes we only need one copy of something, in which case we can just make a new object
 */
//add extends App to be able to run it and get a green arrow to the left

//in the typical sense in object-oriented programming, an object consists of a state, behaviour and identity.

object Objects extends App {

  object mathsConcepts { //grouping / identity
    val pi: Double = 3.1415926535 //state
    val e: Double = 2.718 //state
    val goldenRation: Double = 1.6180339 //state
    val euler: Double = 0.57721 //state
  }

  println(mathsConcepts) // returns Week2.Monday.Objects$mathsConcepts$@4e04a765
  println(mathsConcepts.euler) //returns 0.57721

  //If you want to add behavior to this object, an example in Scala:
  // Behavior: method to calculate the circumference of a circle
  def circumference(radius: Double): Double = {
    2 * pi * radius
  }


  object PrimaryColours { //grouping
    val blue: String = "blue"
    val yellow: String = "yellow"
    val red: String = "red"
  }

  //calling the objects
  //start on outer colours so call
  println(PrimaryColours.red) //returns red
  println(PrimaryColours.red.toUpperCase) //returns RED

  /**
   * TASK - Create an object for the days of the week.
   * Populate the object with a value for each day.
   * prove you can access these values by calling them.
//   */
  object daysOfTheWeek { //grouping
    val Monday: String = "Monday"
    val Tuesday: String = "Tuesday"
    val Wednesday: String = "Wednesday"
    val Thursday: String = "Thursday"
    val Friday: String = "Friday"
    val Saturday: String = "Saturday"
    val Sunday: String = "Sunday"
  }

  println(daysOfTheWeek.Tuesday) //returns Tuesday
  println(daysOfTheWeek.Tuesday.toLowerCase) //returns tuesday


  //Create a case class for days of the week and call the days
//  case class DaysOfTheWeek(day: String)
//
//  object DaysOfTheWeek {
//    val Mon = DaysOfTheWeek("Mon")
//    val Tues = DaysOfTheWeek("Tues")
//    val Weds = DaysOfTheWeek("Weds")
//    val Thurs = DaysOfTheWeek("Thurs")
//    val Fri = DaysOfTheWeek("Fri")
//    val Sat = DaysOfTheWeek("Sat")
//    val Sun = DaysOfTheWeek("Sun")
//
//  }
//  val today = DaysOfTheWeek.Mon
//  println(today.day) // Output: Mon


}
