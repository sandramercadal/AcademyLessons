
/**
 Functions, Methods, Referential transparancy, For comprehensions
 IMMUTABLE - Think of this as read - only / cannot be ressaigned
 */
// Method is step by step instructions on how to do something e.g make a cup of Tea
//Functions and methods both define specific steps. Can be reused in multiples places
//Logic is identical so hard to see if it's a method or a function!! Methods contain 'def' or start with 'def'

//Functions:
  //A way to group code that can be executed 0 or more times
//def functionName () : Unit = {
  //do something
//}
//if i type def functions () {} and enter return in the curlies it created the skeleton below:
//def function(): Unit = {
//}

//1 of 4 = ANONYMOUS FUNCTION/LAMBADA
//Use a rocket symbol => when you want it to do something
//number is not declared/has no name/not assigned to anything
(number: Int) => number +1 //Takes a number and makes it bigger

//2 of 4 = NAMED FUNCTION:
//As a val now
// Named Val (addition) as we want to reuse. We cannot override. Immutable.
//Given an int which is called number, I'm taking this Int and adding 1
val addition = (number: Int) => number +1


//3 of 4 METHOD (also a type of function) has "DEF"
//DEF starts with the words def and syntax changes I need to tell it what I want within my name
// Named so can be reused.
def addition (number:Int): Int = number +1

//4 of 4 OVERRIDE METHOD
//override def addition (number:Int): Int = number + 10
//notice no = sign after you name your function

// key word is "override" so start with "override".
//When we say this is an "override method," it usually means this special instruction
// takes the place of another one that was already there before. It’s like saying, "I've got a new, better way to do this!"

//name should be unique def nameOfMethod. To run need to have a parameter: then needs ReturnType
//then { in here is the expressions if multiple } see Task 2 below

//Task 1:
//We never see the last expression a println (). Why?
//clear out this code, not for prod.
//Using println as the last expression does not return a meaningful value since println returns Unit (similar to void in other languages).
//If you put println at the end, the method will effectively return the result of println, which is not useful.

//Task 2: What does the below return??
val aValue = 6<3
def aDifferentValue: Int = {
  if (aValue) 564 else 865
  42
}
  //last expression must match the methods return type
//the expression 6 < 3 is a comparison that evaluates to false, so aValue is assigned the value false.
//In the method aDifferentValue, the if statement checks the value of aValue. Since aValue is false, it will return the value 865 from the else clause.
//However, the last line in the method, which is 42, becomes the actual return value of the method because in Scala, the last expression in a block is what gets returned.
// So, if you call aDifferentValue, it will return 42 despite the if statement.
aValue //false
aDifferentValue //42

  //How to make a cup of coffee
//TIP - If you have an empty parameter there's no need to use {} brackets
//def createAUniqueName : String {
  // " Do this "
  // "Do that "
  // }
def makeACoffee: String = {
  "Add coffee to boiling water"
  "Add sugar or/and milk if required"
  "Stir"
  "Enjoy!" //this is green, recognised as the last one and we will only see 'Enjoy!" returned

}
makeACoffee //will return the last expression do "Enjoy!"



//Now with a parameters. Methods start with Def. Name the parameter when calling the method.
//can create your own parameters for functions, allowing you to pass different values when you call the function eg sugar and splashesOfMilk
def makeATea(sugar:Int, splashesOfMilk: Int): String = {
  s"Add boiling water to your cup with a teabag, add $sugar spoons of sugar and $splashesOfMilk splashes of milk, stir and enjoy!"
}
makeATea(4, 6) //function call of Int & Int
makeATea(sugar = 4, splashesOfMilk = 6) //function call of Int & Int
//Calling it with diff amounts of sugars and splashes of milk

//If I wanted each line to be printed and not just say Enjoy! I could printl each:
def makeACoffee: String = {
  println("Add coffee to boiling water")
  println("Add sugar or/and milk if required")
  println("Stir")
  "Enjoy!" // this will be the returned value
}

//Or I could
def makeACoffee: List[String] = {
  List(
    "Add coffee to boiling water",
    "Add sugar or/and milk if required",
    "Stir",
    "Enjoy!"
  )
}

// Calling the function and storing the result
val steps = makeACoffee

// You can access or display each step as needed
steps.foreach(println)  // This will print each step : Add coffee to boiling water
//Add sugar or/and milk if required
//Stir
//Enjoy!

//Or I could

//def makeACoffee: String = {
//  Seq(
//    "Add coffee to boiling water",
//    "Add sugar or/and milk if required",
//    "Stir",
//    "Enjoy!"
//  ).mkString("\n") // Joins all steps with a newline
//}
//
//// Calling the function
//val instructions = makeACoffee
//println(instructions) // This will print all the steps as a single string
//mkString("\n") creates a single string where each step is separated by a newline character,

//VAT
val vat: Double = 1.2 //times by 1.2 anything we purchase, price of the item *VAT
//Make a method :
//we don't need {} if 1 only parameter
def priceIncVat(priceOfItem: Double): Double =  //returns a Double (indicated after the colon, right before the equals sign and the function body).
  priceOfItem * vat
//run it
priceIncVat(3.99) // Double = 4.788
priceIncVat(59.90) //Double = 71.88

//METHOD WITH 2 x INT THAT RETURNS A STRING
//Task 1 - Make a method called 'getBigVal' with 2 integers called input1 and input2 and return a string
//use "if else" statement inside method and operators within that "else", "else if" too if needed
//Where have I told it where input 1 and input 2 is?? //I ran it and put nothing in the getBIgVal ( , )
//When run see how it returns a string as required

//each potential return value from the method must be a string.
def getBigVal (input1: Int, input2: Int): String = {
  if (input1 > input2){
    "first"
  } else if (input1 < input2) {
    "second"
  } else if (input1 == input2) {
    "same"
  } else {
    "oops we have an issue..."
  }
}
//run it
getBigVal(6,4) // first
getBigVal(2,4) //second
getBigVal(4,4) //same
getBigVal(50,100) //second

//OR the way I coded it, I didn't seem to use " " before the strings or after:
def getBigVal (input1: Int, input2: Int): String = {
  if (input1 > input2) "first"
  else if (input1 < input2) "second"
  else
    "equal"
}
getBigVal(3,7) //second
getBigVal(6,4) //first
getBigVal(100,200) //second

//Task 2 - The other way round
//METHOD WITH 2 x STRINGS THAT RETURNS A INT
//Create a method called ‘nameLength’ that takes in two Strings called firstName and surname and returns an Integer.
//(createAName: String, createAName: String): Int = {
// An int is a primitive data type used to store positive and negative whole numbers without decimals.
//The result of the method should return the length/size of the name (not surname) which is greater.
// If both names are the same length return 0.
//Here is some test data eg First name: Peter Last name: Pan, Result: 5,
// First name: Mickey Last name: Mouse, Result: 6, etc


/**
 * Analyse the length of two strings
 */
def nameLength(firstName: String, surname: String): Int = {

  if(firstName.length > surname.length){
    firstName.length
  } else if (firstName.length < surname.length){
    surname.length
  } else {
    0
  }
}
//The first if checks if length of firstName is greater than the length of surname. If true, it returns the length of firstName.
//The else if checks if length of firstName is less than the length of surname. If true, it returns the length of surname.
//If neither condition is true (meaning both names are of equal length), it returns 0.
nameLength("Peter", "Pan")  //5
nameLength("Mickey", "Mouse")  //6
nameLength("Bigdonald", "Duck") //9
nameLength("Mary", "Duck") //0


//OR coded by colleague:
//uses two vals
def nameLength(firstName: String, surname: String): Int = {
  val firstNameLength: Int = firstName.length
  val surnameLength: Int = surname.length

  if (firstNameLength > surnameLength) firstNameLength

  else if (firstNameLength< surnameLength) surnameLength
  else 0
}
nameLength("Peter", "Pan") //5
nameLength("Mickey", "Mouse") //6
nameLength("Bigdonald", "Duck") //9


/** Referenctial transparancy   */
//simply means a functions returns value is based solely on the inputs
//Is it easier for our brains to read the number or read the method again and again
//We say something has referential transparency when a functions return value is based solely on the inputs
//e.g. addition (1,2) always = 3
  //what is simpler for our brains?
def addTwoInts (x:Int, y:Int): Int = x + y //function addTwoInts that takes two integers x and y and returns their sum.
3 + 3 //6. But, it's just an expression & not assigned to any variable, so it won't be stored or used later.
3 + addTwoInts (1,2) //addTwoInts(1, 2) will be called first, which returns 3. 3+3 =6.
//both 3 + 3 and 3 + addTwoInts(1, 2) are computed but aren't assigned to any variable or utilized in any way.
addTwoInts (1,2) + addTwoInts (1,2) //Calls addTwoInts(1, 2) twice. Each call returns 3, so the expression becomes 3 + 3=6
//just something to think about when writing more complex code. what is simpler for our brains.

//The expressions 3 + 3 and 3 + addTwoInts(1, 2) may have been included in the code snippet for illustrative purposes, but they serve no functional purpose in the given context since they don’t produce any output or result.
