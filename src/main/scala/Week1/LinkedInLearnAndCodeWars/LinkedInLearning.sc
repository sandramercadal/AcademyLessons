val favouriteDessert = "bronwie" //inferred val is of type String = bronwie
val favouriteDessert2 : String = "bronwie" //val stated as a String = bronwie
//favouriteDessert /2 // This is a string so cant divide by a string

def sum (n1: Int, n2: Int): Int = n1 +n2
println(sum(2,2)) //4

def lightSwitch(switchOn: Boolean): String = if (switchOn) "light on!" else "light off!"
println(lightSwitch(true))//light on!
println(lightSwitch(switchOn=false))//light off!

/**Chapter 2 challenge --Q1 WRite a function called product which takes 2 parameters of type Int & multiplies them together  **/
def product (number1: Int, number2: Int) : Int = number1 * number2
println(product(number1=2, number2=2)) // 2* 2 = 4  or:
println(product(2,2)) // 2* 2 = 4

  /**Chapter 2 challenge --Q2 Write a function called greeting which takes a parameter called Name, of type string and outputs a string, the parameter should have a default value so that an appropriate string is outputted if the function is called without a parameter
   */
def greeting (name: String = "Mary") : String = s"hi $name!"
println(greeting("sandra")) //hi sandra!
println(greeting()) //hi Mary! defaults to default set in string =

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

//adding a tent - return type is true or false boolean
  //In Scala, return type is after the colon  :

// def functionName(parameter1: Type1, parameter2: Type2): ReturnType = {
// function body
//}
def partyAtHomeAgain(guests:Int, tentAvailable: Boolean): Boolean =
  if (guests <= 15) true //T if guests are up to 15 with no tent
  else if (tentAvailable && guests < 41) true
  else false
println(partyAtHomeAgain(40, tentAvailable = true)) //true
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
    //case 4 || 5 => "XYZ" group cases with or
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
def basicOp2(op: Char, a: Int, b: Int): Int = {
  op match {
    case '+' => a + b
    case '-' => a - b
    case '*' => a * b
    case '/' => a / b
    case _ => throw new Error("Invalid operation")
  }


  case class Person (name: String, age: Int)
val anne: Person = Person ("Anne", 25)
  println(anne.name)
  println(anne.age)

def greeting(person: Person): String = s"hi ${person.name}"
  println(greeting())

}

case class Person (name: String, age: Int)
val anne: Person = Person ("Anne", 25)
println(anne.name) //Anne
println(anne.age) //25

def greeting(person: Person): String = s"hi ${person.name}"
println(greeting(anne)) //hi Anne

val anne1: Person = Person("Anne", 25) // First Anne
val anne2: Person = Person("Anne", 36) // Second Anne


/** ENUMS */
//Enums that take parameters

//Scala 3:
//enum Triathlon (val meters: Int):
//case swim extends Triathlon (meters=400)
//case cycle extends Triathlon (meters=5000)
//case run extends Triathlon (meters=2500)
//def howManyMeters (tri: Triathlon): Int = tri match {
//  case swim @ Swim => swim.meters
//  case cycle @ Cycle => cycle.meters
//  case run @ Run => run.meters

/**WITH SEALED TRAIT AND CASE OBJS **/

sealed abstract class Triathlon(val meters: Int)
case object Swim extends Triathlon(400)
case object Cycle extends Triathlon(5000)
case object Run extends Triathlon(2500)

def howManyMeters(tri: Triathlon): Int = tri match {
  case Swim => Swim.meters
  case Cycle => Cycle.meters
  case Run => Run.meters
}
// Print meters for each event
println(s"Swimming: ${howManyMeters(Swim)} meters") //400
println(s"Cycling: ${howManyMeters(Cycle)} meters")//5000
println(s"Running: ${howManyMeters(Run)} meters")//2500



object Triathlon extends Enumeration {
  sealed abstract class TriathlonVal(val meters: Int) extends Val

  val Swim = new TriathlonVal(400) {}
  val Cycle = new TriathlonVal(5000) {}
  val Run = new TriathlonVal(2500) {}

  type Triathlon = TriathlonVal
}

import Triathlon._

def howManyMeters(tri: Triathlon): Int = tri match {
  case swim @ Swim => swim.meters
  case cycle @ Cycle => cycle.meters
  case run @ Run => run.meters
}
// Print each event individually
println(s"Swimming: ${howManyMeters(Swim)} meters") //400
println(s"Cycling: ${howManyMeters(Cycle)} meters") //5000
println(s"Running: ${howManyMeters(Run)} meters") //2500


// Another approach with more type safety
List(Swim, Cycle, Run).foreach { event =>
  println(s"${event}: ${howManyMeters(event)} meters")
}







