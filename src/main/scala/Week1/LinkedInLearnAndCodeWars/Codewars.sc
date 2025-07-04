/** Q1 you received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met yesterday evening?
 * Write a simple function to check if the string contains the word hallo in different languages.
 * These are the languages of the possible people you met the night before:
 * hello - english
 * ciao - italian
 * salut - french
 * hallo - german
 * hola - spanish
 * ahoj - czech republic
 * czesc - polish */

def containsGreeting(message: String): Boolean = {
  val greetings = List("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc")
  greetings.exists(message.toLowerCase.contains)
  //OR greetings.exists(greeting => message.toLowerCase.contains(greeting))
  //OR greetings.map(message.toLowerCase.contains).contains(true)
}
println(containsGreeting("hello")) //true

//Q2
/**Create a function finalGrade, which calculates the final grade of a student depending on two parameters: a grade for the exam and a number of completed projects.
 * This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);
 * This function should return a number (final grade). There are four types of final grades:
 * 100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
 * 90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
 * 75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
 * 0, in other cases
 * Examples(Inputs-->Output):
 * 100, 12 --> 100
 * 99, 0 --> 100
 * 10, 15 --> 100
 * 85, 5 --> 90
 * 55, 3 --> 75
 * 55, 0 --> 0
 * 20, 2 --> 0 */

def finalGrade(exam: Int, projects: Int): Int = {
  if (exam > 90 || projects > 10) {
    100
  } else if (exam > 75 && projects >= 5) {
    90
  } else if (exam > 50 && projects >= 2) {
    75
  } else {
    0
  }
}
println(finalGrade(100, 12)) // 100
println(finalGrade(99, 0)) // 100
println(finalGrade(85, 5)) // 90
println(finalGrade(55, 3)) // 75
println(finalGrade(55, 0)) // 0
println(finalGrade(20, 2)) // 0

//Someone elses code with match case
//def finalGrade(exam: Int, projects: Int): Int = (exam, projects) match
//case (e, p) if e > 90 || p > 10 => 100
//case (e, p) if e > 75 && p >= 5 => 90
//case (e, p) if e > 50 && p >= 2 => 75
//case _                          => 0


/** Q3 Write a function which converts the input string to uppercase**/
def makeUpperCase(string: String): String =
  string.toUpperCase
println(makeUpperCase("hello, sandra")) //HELLO, SANDRA
println(makeUpperCase("hello")) //HELLO


/** Q4 Is the string uppercase?
 * Create a method to see whether the string is ALL CAPS.
 * Examples (input -> output)
 * "c" -> False
 * "C" -> True
 * "hello I AM DONALD" -> False
 * "HELLO I AM DONALD" -> True
 * "ACSKLDFJSgSKLDFJSKLDFJ" -> False
 * "ACSKLDFJSGSKLDFJSKLDFJ" -> True * */

def isUpperCase(input: String): Boolean = { //notice input here
  input == input.toUpperCase
}

//OR with "forall"
//def isUpperCase(input: String): Boolean = {
// input.forall(_.isUpper)
//}

//Or with an If Statement
//def isUpperCase(input: String): Boolean = {
//  if (input == input.toUpperCase)
//    return true
//  else false
//}
println(isUpperCase("c")) //false
//println(isUpperCase("DONALD")) //true
//println(isUpperCase("DONALd")) //F


/** Q5 You will need a rental car in order for you to get around in your vacation. Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
 * Write a code that gives out the total amount for different days(d).
 * costs £40 to rent a car for the day
 * If you rent for 7 days or more its -£50
 * If you rent for 3 days or more its -£20* */
//I was trying to reassign totalCOst val after declaring it as a val!
//def cost(days: Int): Int = {
//  val dailyCarRental = 40
//  val totalCost = dailyCarRental * days
//  if (days >= 7) {
//    totalCost = totalCost - 50
//  } else if (days >=3) {
//    totalCost = totalCost - 20
//  }
//  totalCost
//}

object Rental {

  def cost(days: Int): Int = {
    val dailyCarRental = 40
    val initialCost = dailyCarRental * days

    if (days >= 7) {
      initialCost - 50
    } else if (days >= 3) {
      initialCost - 20
    }
    else
      initialCost
  }
}
println(Rental.cost(7)) //230 (7 x 40 - 50 discount = 230)

/** Q6 Parse nice int from char problem - "How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
 * Write a program that returns the girl's age (0-9) as an integer. Assume the test input string is always a valid string. For example, the test input may be "1 year old" o  * */







/** Q7 - welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.
 * Think of a way to store the languages as a database. The languages are listed below so you can copy and paste!
 * Write a 'welcome' function that takes a parameter 'language', with a type String, and returns a greeting - if you have it in your database. It should default to English if the language is not in the database, or in the event of an invalid input.
 * The Database : Please modify this as appropriate for your language.
 * [ ("english", "Welcome")
 * , ("czech", "Vitejte")
 * , ("danish", "Velkomst")
 * , ("dutch", "Welkom")
 * , ("estonian", "Tere tulemast")
 * , ("finnish", "Tervetuloa")
 * , ("flemish", "Welgekomen")
 * , ("french", "Bienvenue")
 * , ("german", "Willkommen")
 * , ("irish", "Failte")
 * , ("italian", "Benvenuto")
 * , ("latvian", "Gaidits")
 * , ("lithuanian", "Laukiamas")
 * , ("polish", "Witamy")
 * , ("spanish", "Bienvenido")
 * , ("swedish", "Valkommen")
 * , ("welsh", "Croeso")
 * ]
 */
//def welcome (Language: String) : String = {
//val language = countryLanguage
// if

def welcome(language: String): String = language.toLowerCase
match {
  case "english" => "Welcome"
  case "czech" => "Vitejte"
  case "danish" => "Velkomst"
  case "dutch" => "Welkom"
  case "estonian" => "Tere tulemast"
  case "finnish" => "Tervetuloa"
  case "flemish" => "Welgekomen"
  case "french" => "Bienvenue"
  case "german" => "Willkommen"
  case "irish" => "Failte"
  case "italian" => "Benvenuto"
  case "latvian" => "Gaidits"
  case "lithuanian" => "Laukiamas"
  case "polish" => "Witamy"
  case "spanish" => "Bienvenido"
  case "swedish" => "Valkommen"
  case "welsh" => "Croeso"
  case _ => "Welcome" // Default to English if not found
}
println(welcome("dutch")) // Velkom
println(welcome("Albanian")) // Welcome (default to English)


/** Q8) Simple multiplication  */
/**Beginner - Lost Without a Map - Given an array of integers, return a new array with each value doubled.
 For example:
 [1, 2, 3] --> [2, 4, 6]*/

def maps(xs: List[Int]): List[Int] = {
  xs.map(numb => numb * 2)
}

println(maps(List(1, 2, 3)))
//The map function is called on the list xs. It takes a function as an argument and applies that function to each element of the list.
 //numb => numb * 2: This is an anonymous function (lambda expression):
//  numb is a placeholder variable representing each element of the list as the map function iterates through it.
//The expression numb * 2 defines what happens to each element. It takes the current element (represented by numb), multiplies it by 2, and returns the result.

//OR
object Kata {

  def maps(xs: List[Int]): List[Int] = for {
    x <- xs
  } yield x * 2
}
println(Kata.maps(List(1, 2, 3)))


  def maps(xs: List[Int]): List[Int] =
    xs.map(_ * 2)


/** Q9) Create a class Ball. Ball objects should accept one argument for "ball type" when instantiated.
 If no arguments are given, ball objects should instantiate with a "ball type" of "regular."
 ball1 = new Ball();
 ball2 = new Ball("super");
 ball1.ballType     //=> "regular"
 ball2.ballType     //=> "super" */
class Ball(val ballType: String = "regular")

val ball1 = new Ball()
val ball2 = new Ball("super")

println(ball1.ballType) //"regular"
println(ball2.ballType) //"super"


/**Q10 We need a function that can transform a string into a number. What ways of achieving this do you know?
 Note: Don't worry, all inputs will be strings, and every string is a perfectly valid representation of an integral number.
 Examples
 "1234" --> 1234
 "-7" --> -7 */
def stringToNumber(string: String): Int = {
  string.toInt
}
val num1 = stringToNumber("1234") //Int = 1234
val num2 = stringToNumber("-7") //Int = -7


//This works but doesnt pass the Codewars test (I called it input):
def stringToInt (input2: String): Int = {
  input2.toInt
}
println(stringToInt("12345")) //12345


def stringToNumber(string: String): Int= string.toInt
println(stringToNumber("23"))



/** Q11 Super Duper Easy ;
Make a function that returns the value multiplied by 50 and increased by 6. If the value entered is a string it should return "Error".
 **/
//def valueMultipliedPlus6 (int: Int) :Int {
//int = int x 50 + 6 else "error"
//}
def processValue(value: Any): Any = {
  value match {
    case number: Int => number * 50 + 6
    case _: String => "Error"
    case _ => "Error"  // Handle any other types
  }
}
println(processValue(2))


/** Q12) Remove all exclamation marks from the end of sentence. e.g.
 "Hi!"     ---> "Hi"
 "Hi!!!"   ---> "Hi"
 "Hi"      ---> "Hi" */
def remove(string: String): String = {
  string.replaceAll("!+$", "") ///without the + may work also
}
println(remove("Hi!!!!")) //Hi
println(remove("Hi"))//Hi
//! represents the exclamation mark character that we want to find in the string.
 // + means "one or more" of the preceding element. So, !+ signifies "one or more exclamation marks."
//$ indicates the end of the string. This means we are looking for any series of exclamation marks that occur right at the end of the string.


//def remove(string: String): String = {
//  if (string.endsWith("!")) {
//    string // Keep the exclamation mark
//  } else {
//    string.replaceAll("!$", "")
//  }
}

/**Q13) Remove ! from wherever it is "!Hi!"    ---> "Hi!" and add a single exclamation mark at the end**/
def remove2(string: String): String = {
  string.replaceAll("!", "") + "!"
}
println(remove2("!HI!!")) //HI!
//("!", "") is "replace all occurrences of exclamation marks with nothing,"

/** Q14) Remove string spaces
//Write a function that removes the spaces from the string, then return the resultant string e.g."8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
**/

def removeStringSpace (string: String): String = {
  string.replaceAll(" ", "")
}
println(removeStringSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))//8j8mBliB8gimjB8B8jlB

/**Q15 - Replace all vowel to exclamation mark in the sentence. aeiouAEIOU is vowel.
 * "Hi!" --> "H!!"
 * "!Hi! Hi!" --> "!H!! H!!"
 * "aeiou" --> "!!!!!"
 * "ABCDE" --> "!BCD!" */
def replace(s: String): String = {
  s.replaceAll("[aeiouAEIOU]", "!")
}
//Thought this would pass the test someone else did it but it didn't pass for me:
def replace(s: String): String = s.replaceAll("[a,e,i,o,u,A,E,I,O,U]", "!")


/**Q16) Two players - "black" and "white" are playing a game. The game consists of several rounds. If a player wins in a round, he is to move again during the next round. If a player loses a round, it's the other player who moves on the next round. Given whose turn it was on the previous round and whether he won, determine whose turn it is on the next round.
 Input/Output
 [input] string lastPlayer/$last_player
 "black" or "white" - whose move it was during the previous round.
 [input] boolean win/$win
true if the player who made a move during the previous round won, false otherwise.
 [output] a string
 Return "white" if white is to move on the next round, and "black" otherwise. e.g. For lastPlayer = "black" and win = false, the output should be "white".
 For lastPlayer = "white" and win = true, the output should be "white".
**/
 def whoseMove1(lastPlayer: String, win: Boolean): String = {
  if (win) lastPlayer else if (lastPlayer == "black") "white" else "black"
}
//or
def whoseMove(lastPlayer: String, win: Boolean): String = {
  if (win) {
    lastPlayer
  } else {
    if (lastPlayer == "black") "white" else "black"
  }
}
//whoseMove takes two inputs: lastPlayer (a string that can be "black" or "white") and win (a boolean that indicates if the last player won).
//If win is true (last player won), returns lastPlayer because the same player gets to play again.
//If win is false (the last player lost), it checks who the last player was:
//If lastPlayer "black", it returns "white" (meaning the white player gets to play next).
//If lastPlayer "white", it returns "black" (meaning the black player gets to play next).
println(whoseMove("black", false)) //white
println(whoseMove("white", true))  //white
println(whoseMove("white", false))  //Bl

/**Q17) Set the alarm - Write a function named setAlarm which receives two parameters. The first parameter, employed, is true whenever you are employed and the second parameter, vacation is true whenever you are on vacation.
 The function should return true if you are employed and not on vacation (because these are the circumstances under which you need to set an alarm). It should return false otherwise. Examples:
 employed | vacation
 true     | true     => false
 true     | false    => true
 false    | true     => false
 false    | false    => false **/



//Q - Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
def removeExclamationMarks(string: String): String = {
  string.replaceAll("!", "")
}
println(removeExclamationMarks("Mary!")) //Mary

//Q - remove all the numbers from a list of strings
def stringClean(string: String): String = {
  string.replaceAll("\\d", "")  // Regex \\d numbers 0-9?
}
println(stringClean("1Mary12345")) //Mary
//also
// string.filterNot(_.isDigit)



/**Q18 - Palindrome detector eg madam, kayak, taco cats, step on no pets */





/** Q19) Debug Greeting - greet everyone as they come aboard. It is your job to fix the code and get the program working again!
 E.g: Hello, Mr. Spock or Hello, Liutenant Uhura
 From : def sayHello(name: String): String = "Hello" to */
def sayHello(name: String): String = {
  s"Hello, $name"
}
println(sayHello("Dr Spock")) // Hello, Dr Spock


/** Check same case
 * Write a function that will check if two given characters are the same case.
 * If either of the characters is not a letter, return -1 :
 '0' and '?' -- returns -1 --If either of them are not a letter

 * If both characters are the same case, return 1
 * 'a' and 'g' returns 1
 * * 'A' and 'C' returns 1 --both uppercase or both lowercase return 1

 * If both characters are letters, but not the same case, return 0 */
def sameCase(a: Char, b: Char): Int = {
  if (!a.isLetter || !b.isLetter) {
    return -1
  }
  else if ((a.isUpper && b.isUpper) || (a.isLower && b.isLower)) {
    return 1
  }
  else {
    return 0
  }
}
println(sameCase('U', '9'))


/**Q20) READ the Q properly eg how to calculate the BMI, it says its weight x (height x2)!
 *
 * Write function bmi that calculates body mass index (bmi = weight / height2).
 * if bmi <= 18.5 return "Underweight"
 * if bmi <= 25.0 return "Normal"
 * if bmi <= 30.0 return "Overweight"
 * if bmi > 30 return "Obese"
 */
def bmi(weight: Int, height: Double): String = {
  val bmiTotal = weight / (height * height)

  if (bmiTotal <= 18.5) "Underweight"
  else if (bmiTotal <= 25.0) "Normal"
  else if (bmiTotal <= 30.0) "Overweight"
  else "Obese"
}

println(bmi(50, 1.80)) //underweight
println(bmi(60, 1.56)) //normal


/**Q21 - Hula Hoop
 * If Alex does 10 or more hoops => "Great, now move on to tricks"
 * else "Keep at it until you get it"
**/
 def hoopCount(number: Int): String = {
 if (number >= 10) s"Great, now move on to tricks"
 else s"Keep at it until you get it"
 }
 println(hoopCount(1)) //Keep at it until you get it


/** Q22) Simple multiplication - multiplying a given number by eight if it is an even number
 and by nine otherwise**/

def multiply(n: Int): Int = {
  if (n % 2 == 0) {
    n * 8
  } else {
    n * 9
  }
}
println(multiply(2))

/**Q23) What Kids drink toddy:
 Teens drink coke, Young adults drink beer,Adults drink whisky.
 Make a function that receive age, and return what they drink.
 Rules:
 Children under 14 old.
 Teens under 18 old.
 Young under 21 old.
 Adults have 21 or more.
 Examples: (Input --> Output*/

def peopleWithAgeDrink(age: Int): String = {
  if (age < 14)"drink toddy"
  else if (age < 18 )"drink coke"
  else if (age < 21 )"drink beer"
  else "drink whisky"
}
println(peopleWithAgeDrink(20))

/** Q24 - Create a function that takes 2 integers in form of a string as an input, and outputs the sum (also as a string):
 Example: (Input1, Input2 -->Output)
 "4",  "5" --> "9"
 "34", "5" --> "39"
 "2", "" --> "2"
 "-5", "3" --> "-2"
 Notes: If either input is an empty string, consider it as zero.
 Inputs and the expected output will never exceed the signed 32-bit integer limit (2^31 - 1)
 **/

//Both strings need to be converted to a numb to add them up!

def stringSum(a: String, b: String): String = {
  ((if (a.isEmpty) 0 else a.toInt) + (if (b.isEmpty) 0 else b.toInt)).toString
}
println(stringSum("1", "2"))  //3

//or
def stringSum2(a: String, b: String): String = {
  // Parse both strings to integers, if they are empty default to 0
  val num1 = if (a.isEmpty) 0 else a.toInt
  val num2 = if (b.isEmpty) 0 else b.toInt
  // Calculate sum and return as string
  (num1 + num2).toString
}
println(stringSum2("1", "2")) //3

/** Q25 - When provided with a number between 0-9, return it in words. Note that the input is guaranteed to be within the range of 0-9.
 Input: 1  is Output: "One". */
//Patten Matching
def switchItUp(number: Int): String = {
  number match {
    case 0 => "Zero"
    case 1 => "One"
    case 2 => "Two"
    case 3 => "Three"
    case 4 => "Four"
    case 5 => "Five"
    case 6 => "Six"
    case 7 => "Seven"
    case 8 => "Eight"
    case 9 => "Nine"
  }
}
println(switchItUp(7))
//OR
def switchItUp(number: Int): String = {
  val numberList = Map(
    0 -> "Zero",
    1 -> "One",
    2 -> "Two",
    3 -> "Three",
    4 -> "Four",
    5 -> "Five",
    6 -> "Six",
    7 -> "Seven",
    8 -> "Eight",
    9 -> "Nine")
  numberList(number)
}

println(switchItUp(5)) //Five




/** Q26) Convert boolean values to strings 'Yes' or 'No'. **/

//Uses Pattern Matching
  def boolToWord(boolean: Boolean): String = boolean match {
    case true => "Yes"
    case false => "No"
  }
println(boolToWord(true))//Yes

//or
def boolToWord(boolean: Boolean): String =
  if (boolean) "Yes" else "No"
}
//or
def boolToWord(boolean: Boolean) = if (boolean) "Yes" else "No"
}

/** Q27 - Bob needs a fast way to calculate the volume of a rectangular cuboid with three values: the length, width and height of the cuboid.
 Write a function to help Bob with this calculation. **/
def cuboidVolume(length: Int, width: Int, height: Int): Int = length * width * height
println(cuboidVolume(6,7,8))//336 6x7x8

/** Q28 - Write a function that accepts a non-negative integer n and a string s as parameters, and returns a string of s repeated exactly n times. E.g.
 6, "I"     -> "IIIIII"
 5, "Hello" -> "HelloHelloHelloHelloHello" **/

def repeatStr(times: Int, str: String): String = str * times
println(repeatStr(6, "I")) //IIIIII


/**Q29 Count the monkeys so if 10 = and array of --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] **/
def monkeyCount (n: Int): Array[Int] = {
  (1 to n).toArray
}
val count = monkeyCount(5)
println(count.mkString(", "))//1, 2, 3, 4, 5


/** Q30  Return the day e.g 1 returns "Sunday"  **/
def whatDay(num: Int): String = {
  num match {
    case 1 => "Sunday"
    case 2 =>"Monday"
    case 3 =>"Tuesday"
    case 4 =>"Wednesday"
    case 5 =>"Thursday"
    case 6 =>"Friday"
    case 7  =>"Saturday"
    case _ => "Wrong, please enter a number between 1 and 7"
  }
}

/**Q31 Jenny has written a function that returns a greeting for a user. However, she's in love with Johnny, and would like to greet him slightly different. She added a special case to her function, but she made a mistake.**/
//def greet(name: String): String =
//  if name == "Johnny" then
//    "Hello, my love!"
//  else
//    s"Hello, $name!"


/**Q32 Define a function that removes duplicates from an array of non negative numbers and returns it as a result.
 The order of the sequence has to stay the same.
 Examples:
 Input -> Output
 [1, 1, 2] -> [1, 2]
 [1, 2, 1, 1, 3, 2] -> [1, 2, 3]**/
def distinct(xs: Seq[Int]): Seq[Int] = xs.distinct
// Example usage:
println(distinct(Seq(1, 2, 2, 3)).mkString(", ")) // Output: 1, 2, 3



/** Q33 - In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. If there are no good ideas, as is often the case, return 'Fail!'. */
 def well(x: Seq[String]): String = {

 val goodCount = x.count(_ == "good")
 //count method is called on the collection x
 //_ == "good": is a shorthand syntax for defining an anonymous function (also known as a lambda function). The underscore _ acts as a placeholder for each element in the collection as count iterates over it. So, _ == "good" means "check if the current element is equal to the string 'good'". For each element of x, if the element is "good", it will contribute to the count.

 if (goodCount >= 3) {
 "I smell a series!"
 } else if (goodCount >= 1) {
 "Publish!"
 } else {
 "Fail!"
 }

 }
 println(well(Seq("good", "good", "good")))


/** Q 34) Create a function that takes an int as an argument and returns "Even" for even numbers or "Odd"**/

def evenOrOdd(number: Int): String = {
  if (number % 2 == 0) "Even"
  else "Odd"
}
//OR
def evenOrOdd(number: Int): String = {
  number % 2 match {
    case 0 => "Even"
    case _ => "Odd"
  }
}
println(evenOrOdd(2))

/** Q35)  Given a string str, reverse it and omit all non-alphabetic characters.
E.g. For str = "krishan", the output should be "nahsirk".
 For str = "ultr53o?n", the output should be "nortlu". **/
def reverseLetter(str: String): String = {
  str.filter(_.isLetter).reverse

}
println(reverseLetter("Sandra101"))

/**Q 36)- Refactored Greeting - The following code could use a bit of object-oriented artistry. While it's a simple method and works just fine as it is, in a larger system it's best to organize methods into classes/objects. (Or, at least, something similar depending on your language)
 Refactor the following code so that it belongs to a Person class/object. Each Person instance will have a greet method. The Person instance should be instantiated with a name so that it no longer has to be passed into each greet method call.
 // TODO: This method needs to be called multiple times for the same person (my_name).
 // It would be nice if we didnt have to always pass in my_name every time we needed to great someone.

 case class Person(name: String, age: Int)
 val jack = Person("Jack", 25) // Providing both name and age
 val jill = Person("Jill", 30) // Providing both name and age

 Code would be used for:
 val joe = Person("Joe")
 joe.greet("Kate") // should return "Hello Kate, my name is Joe"
 joe.name          // should == "Joe" **/

case class Person(name: String) {

  def greet(otherName: String): String = {
    s"Hello $otherName, my name is $name"
  }
}
val joe = Person("Joe") //immutable instance. joe is of type person
println(joe.greet("Kate")) //calls the greet method on joe passing 'kate' as the other name



/** Q37) - Make a simple function called greet that returns the most-famous "hello world!".**/
def greet: String = {
  "hello world!"
}


/** Q38) Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
 e.g. XO("ooxx") => true
 XO("xooxx") => false
 XO("ooxXm") => true
 XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 XO("zzoo") => false */

def xo(str: String): Boolean = {
  str.toLowerCase.count(_ == 'x') == str.toLowerCase.count(_ == 'o')
}

//Didn't submit this Kata, kata was not loading??

/** Q39) Capitalization and Mutability
 * "hello" --> "Hello"
 * "Hello" --> "Hello" (the first letter was already capitalized)
 * "a"     --> "A"
 * from -> def capitaliseWord(word: String): String = word.toUpperCase */
//not toUpperCase but capitalize
def capitaliseWord(word: String): String = word.capitalize

//Diff between capitalize and toUpperCase
val str = "hello world"
val capitalized = str.capitalize  // "Hello world"
val upperCased = str.toUpperCase  // "HELLO WORLD"

println(capitalized) // Output: Hello world
println(upperCased)  // Output: HELLO WORLD

/**Q40) Reverse a string and remove all non-alphabetic characters eg "krishan", should be "nahsirk" and
"ultr53o?n" should be "nortlu".*/

def reverseAndRemoveNonAlpha (string: String): String = {
  string.filter(_.isLetter).reverse
}
println(reverseAndRemoveNonAlpha("krishan"))

/**Q41) Welcome to the city
 * Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary.
 * Eg: ['John', 'Smith'], 'Phoenix', 'Arizona' returns the string Hello, John Smith! Welcome to Phoenix, Arizona!
 * or "Franklin", "Delano", "Roosevelt"), "Chicago", "Illinois", returns "Hello, Franklin Delano Roosevelt! Welcome to Chicago, Illinois!"),*/
def sayHello(name: Seq[String], city: String, state: String): String = {
  val fullName = name.mkString(" ") //combines all the names in the name sequence into a single string, separating them with a space using mkString(" ").
  s"Hello, $fullName! Welcome to $city, $state!"
}
println(sayHello(Seq("Peter", "Brown", "Hound"), "Sing", "Aus")) //Hello, Peter Brown Hound! Welcome to Sing, Aus!

/**Q42) Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
 Eg. "This is an example!" ==> "sihT si na !elpmaxe" or "double  spaces" ==> "elbuod  secaps"*/
def reverseWords(text: String): String = {
  text.split(" ").map(_.reverse).mkString(" ")
}
println(reverseWords("World Hello")) //dlroW olleH
//Splitting the String: text.split(" "): This part takes the input string text and splits it into an array of substrings (words) based on spaces.
//e.g. "This is an example!", will become an array: Array("This", "is", "an", "example!").
//Mapping Over the Array: .map(_.reverse): This applies the reverse method to each word in the array. The _ is a placeholder that represents each element in the array as we iterate through it. So, each word in the array gets reversed. Using the earlier example: e.g. "This" becomes "sihT",
//Joining the Reversed Words: .mkString(" "): After the mapping, you have an array of reversed words. The mkString(" ") method takes that array and joins the elements back into a single string, using a space as a separator.

/**Q43) Reverse words so "The greatest victory is that which requires no battle" --> "battle no requires which that is victory greatest The" */
def reverseWords(string: String): String = {
  string.split(" ").reverse.mkString(" ")
}
println(reverseWords("World Hello")) //Hello World

/**Q44) Write reverseList function that simply reverses lists.*/
def reverseList(list: List[Int]): List[Int]  = {
  list.reverse
}
println(reverseList(List(1, 2, 3)))
/**Q45) */
