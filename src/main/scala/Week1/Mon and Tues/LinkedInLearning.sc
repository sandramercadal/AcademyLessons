

import javax.swing.plaf.multi.MultiLabelUI

def lightSwitch(switchOn: Boolean): String = if (switchOn) "light on!" else "light off!"
println(lightSwitch(true))//light on!
println(lightSwitch(switchOn=false))//light off!

/**Chapter 2 challenge --Q1 WRite a function called product which takes 2 parameters of type Int & multiplies them together  **/
def product (number1: Int, number2: Int) : Int = number1 * number2
println(product(number1=2, number2=2)) // 2* 2 = 4
println(product(2,2)) // 2* 2 = 4

  /**Chapter 2 challenge --Q2 Write a function called greeting which takes a parameter called Name, of type string and outputs a string, the parameter should have a default value so that an appropriate string is outputted if the function is called without a parameter
   */
def greeting (name: String = "name") : String = s"hi $name!"
println(greeting("sandra")) //hi sandra!
println(greeting()) //hi name!

/**I can have 15 ppl at home for a party.
 * I can have 40 with a tent at home
 */
//From This : val guests: Int = ??
//val partyAtHome: Boolean =
//  if (guests < 15) true
//  else false
/**To**/
//def partyAtHome(guests:Int): Boolean =
//  if (guests > 15) true else false
//println(partyAtHome(10)) //false as 10 guests are less than 15 which is the max!

//adding a tent
def partyAtHomeAgain(guests:Int, tentAvailable: Boolean): Boolean =
  if (guests <= 15) true //T if guests are up to 15 with no tent
  else if (tentAvailable && guests < 41) true
  else false
println(partyAtHomeAgain(40, true)) //true
println(partyAtHomeAgain(45, true)) //F
println(partyAtHomeAgain(10, false)) //T


/**Challenge 2 If Statement  **/
def competition (result: Int) : String = {
  if (result == 1) "gold"
  else if (result == 2) "silver"
  else if (result == 3) "bronze"
  else "well done!"
}
println(competition(1)) //gold

/** Now with Pattern matching - match & case syntax*/
def competition2 (result: Int) : String = {
  result match { //matching against an Int not a string
    case 1 => "You won gold"
    case 2 => "silver"
    case 3 => "bronze"
    case _ => "Well done!"
  }
}
println(competition2(1)) //You won gold
println(competition2(7)) //Well done!
println(competition2(3)) //bronze

/**Your task is to create a function that does four basic mathematical operations.
 The function should take three arguments - operation(string/char), value1(number), value2(number).
 The function should return result of numbers after applying the chosen operation.
 Examples(Operator, value1, value2) --> output
 ('+', 4, 7) --> 11
 ('-', 15, 18) --> -3
 ('*', 5, 5) --> 25
 ('/', 49, 7) --> 7
 */
//with string
def basicOp(op: String, a: Int, b: Int): Int = {
  op match {
    case "+" => a + b
    case "-" => a - b
    case "*" => a * b
    case "/" => a / b
    case _ => throw new Error("Invalid operation")
  }
}
println(basicOp("+", 4, 7))  // 11
println(basicOp("-", 15, 18)) // -3
println(basicOp("*", 5, 5))   // 25
println(basicOp("/", 49, 7))   // 7
println(basicOp("", 49, 7))   // Error

//with Char and ' ' not " "
def basicOp(op: Char, a: Int, b: Int): Int = {
  op match {
    case '+' => a + b
    case '-' => a - b
    case '*' => a * b
    case '/' => a / b
    case _ => throw new Error("Invalid operation")
  }
}

/** OPTIONS */
//val middleName: Option[String] = None
val middleName: Option[String] = Some("Jasmine Rose")
println(middleName.getOrElse("").length) //12
//val middleName: Option[Int] = None
//val middleName: Option[String] = Some(2)

//getOrElse is one of the ways to get the values Jasmine or 2

/**MAP**/
val middleName: Option[String] = Some("Muna")
println(middleName.map(word => word.toUpperCase)) //Some(MUNA)

val middleName: Option[String] = None
println(middleName.map(word => word.toUpperCase)) //None

/**FLAT MAP**/
case class Rating(googleRating: Option[Int])
case class Film(name: String, rating: Option[Rating])

//first film
val mulan = Film("Mulan", Some(Rating(Some(5))))

println(mulan.name) //Mulan
println(Option(mulan)) //Some(Film(Mulan,Some(Rating(Some(5)))))
println(Option(mulan.rating.map(rating => rating.googleRating))) //Some(Some(Some(5)))
// Using map (need to flatten afterwards)
//Option[Option[Rating]] to Option[Rating] properly before applying the map.
println(Option(mulan.rating).flatten.map(rating => rating.googleRating)) //Some(Some(5))

// Using flatMap (more elegant)
println(mulan.rating.flatMap(rating => rating.googleRating)) //Some(5)

/**FOR COMP great to get out the value of options and computing them and chaining dependant steps**/

//val averageRating = for {
//  rating <- mulan.rating
//  googleRating <- rating.googleRating
//  netflixRating <- rating.netflixRating
//  if googleRating > 3
//  averageRating = (googleRating + netflixRating) / 2
//} yield averageRating
//println(averageRating) //2+ 3 /2 = Some(3)
////If Mulan was a none rather than SOme, would return None.

/** Challenge - Options
 * Q1a  Create a val of type Option[Int]
 * b Set it to a Some
 * c Use map function to double it
 * Set your Option to None
 * run same map function again on the none

 **/

val number: Option[Int] = Some(5)
println(number.map(n => n * 2)) //Option[Int] = Some(10)
println(number.map(_ * 2)) //Option[Int] = Some(10) _ instead of arrow
//Now our option Int is a None
val number: Option[Int] = None
//map over it
println(number.map(_ * 2)) /None

/**
 Q2 - Write a case class TicketPrice that takes a standardTicketRPrice of type Int and a firstClassTicketPrice of type Option[Int]
 b. WRite a function called getFirstClassTicketPrice that takes an Option TicketPrice and returns Option[Int]; implement it twice, first with flatMap and then with a for comprehension **/

//Created an object to make it run on a separate worksheet
import Week1.Thurs.TrainTicketsLinkedInLearn.Example.{TicketPrice, getFirstClassTicketPrice}

object test extends App{

//we need to create a ticket price
val londonToParis = TicketPrice (100, Some(250))
println(getFirstClassTicketPrice(Some(londonToParis))) //Some(250)
//val londonToParis = TicketPrice (100, None) //Flatmap will return None
object Example {
  case class TicketPrice(standardTicketPrice: Int, firstClassTicketPrice: Option[Int])

  //b
  def getFirstClassTicketPrice(ticketPrice: Option[TicketPrice]): Option[Int] =
    ticketPrice.flatMap { ticketPrice =>
      ticketPrice.firstClassTicketPrice
    }
}

  //Now slightly shorter syntax
  def getFirstClassTicketPrice(ticketPrice: Option[TicketPrice]): Option[Int] =
    ticketPrice.flatMap(_.firstClassTicketPrice)

/**Now with For Comp see Train Ticket file**/

}






