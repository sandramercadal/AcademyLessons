package Week4.Tues

object MPVwk4dy2 extends App {
  /** H O F
   * ### P A S S I N G  A  F U N C T I O N   as an  A R G U M E N T :
   * Question 1 Create a function called `intDoubler` that takes an input of type `Int` and returns an `Int`.
   * This method will return the input `Int` doubled.
   */
  def intDoubler(x: Int): Int = {
    x * 2
  }

  //val printTheResult = intDoubler(5)
println(intDoubler(5))
  /** Q1b. Create a second function called `applyTwice` that takes two parameters.
   * //i. The first parameter is an `input:Int`.
   * //ii. The second parameter is a function called `f` that takes an `Int` and returns an `Int`. (Having this as a parameter makes the `applyTwice` method a higher order function.)
   * //iii. The `applyTwice` function must apply `f` twice in succession to the `input`.
   //Call the `applyTwice` function passing in the `intDoubler` as your `f`.
   //(E.g. `applyTwice(4, intDoubler)` should equal 16)  */
def applyTwice (input: Int, f: Int => Int): Int = {
f(f(input))
}
println(applyTwice(4, intDoubler)) //16

  /**
   * 2.
   * a. Create 4 functions (addition, multiplication, division, subtraction), each take two
   * doubles as inputs and return a Double as the result.

   */

  def addition(a: Double, b: Double): Double = {
    a + b
  }
  println(addition(4,8)) //4 + 8 = 12


def multiplication(a: Double, b: Double): Double = {
    a * b
  }
  println(multiplication(4,8)) //4 x 8 = 32


  def division(a: Double, b: Double): Double = a/b

  /**This one didnt work
  {
    a / b // this returns 40 when 20  /  2
    */

  println(division(20,2)) // 10


  def subtraction(a: Double, b: Double): Double = {
    a - b
  }
  println(subtraction(8,4)) //8 - 4 = 4

  /**
   b. Create a function called 'IntManipulator' that takes in two doubles, and a
   * mathematical operation (as made above) as a function and returns the result as a
   * double. */

def IntManipulator (a: Double, b:Double, equation: (Double, Double) => Double): Double = {
  equation(a, b)
}

//My Vals - what is a & b ?

val a = 20.0
val b = 10.0

val additionEquation = IntManipulator (a,b, subtraction)
  println (s" The total is $additionEquation")


  /** ### R E T U R N I N G  A  F U N C T I O N
   * The function is the return type :
   *
   * 3. a. Create a function called `convertToUpperCase` that take any string input and
   * returns that string as uppercase.
   * b. Create a function called `convertToLowerCase` that take any string input and
   * returns that string as lowercase.
   * c. Create a third function called `stringConverter` that takes a Boolean input with
   * parameter name `makeStringUpperCase`. If the input is 'true' return the upperCase
   * method, if false return the lowerCase method.
   * d. Copy `val testString = “cOnVeRtMe”` and apply your convertString method to your
   * testString and print the result when the input is ‘true’ and when it is ‘false’.
  */

  def convertToUpperCase: String => String = (stringInput: String) => {
    stringInput.toUpperCase
  }

  def convertToLowerCase: String => String = (stringInput: String) => {
    stringInput.toLowerCase
  }

  //BOOLEAN INPUT
 //def stringConverter (makeStringUpperCase: Boolean): String => String = {
   // if makeStringUpperCase
   // else





val myString = "cOnVeRTMe"
println (myString)
}
