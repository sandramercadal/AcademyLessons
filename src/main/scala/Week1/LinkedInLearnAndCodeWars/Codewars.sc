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


/** Q4 You will need a rental car in order for you to get around in your vacation. Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
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

/** Q5 Parse nice int from char problem - "How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
 * Write a program that returns the girl's age (0-9) as an integer. Assume the test input string is always a valid string. For example, the test input may be "1 year old" o  * */




/** Q6 - welcome visitors to the site in their own language. Luckily you already use an API that detects the user's location, so this is an easy win.
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


/** Q) Simple multiplication  */
/**Beginner - Lost Without a Map - Given an array of integers, return a new array with each value doubled.
 For example:
 [1, 2, 3] --> [2, 4, 6]*/





/** Q) Create a class Ball. Ball objects should accept one argument for "ball type" when instantiated.
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


/**We need a function that can transform a string into a number. What ways of achieving this do you know?
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



/** Super Duper Easy ;
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


/** Q) Remove all exclamation marks from the end of sentence. e.g.
 "Hi!"     ---> "Hi"
 "Hi!!!"   ---> "Hi"
 "Hi"      ---> "Hi" */
def remove(string: String): String = {
  string.replaceAll("!+$", "") ///without the + may work also
}
println(remove("Hi!!!!")) //Hi
println(remove("Hi")) //Hi
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

/**Remove ! from wherever it is "!Hi!"    ---> "Hi!" and add a single exclamation mark at the end**/
def remove2(string: String): String = {
  string.replaceAll("!", "") + "!"
}
println(remove2("!HI!!")) //HI!
//("!", "") is "replace all occurrences of exclamation marks with nothing,"

/** Q) Remove string spaces
//Write a function that removes the spaces from the string, then return the resultant string e.g."8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
**/

def removeStringSpace (string: String): String = {
  string.replaceAll(" ", "")
}
println(removeStringSpace("8 j 8   mBliB8g  imjB8B8  jl  B"))//8j8mBliB8gimjB8B8jlB



/**Two players - "black" and "white" are playing a game. The game consists of several rounds. If a player wins in a round, he is to move again during the next round. If a player loses a round, it's the other player who moves on the next round. Given whose turn it was on the previous round and whether he won, determine whose turn it is on the next round.
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

/**Set the alarm - Write a function named setAlarm which receives two parameters. The first parameter, employed, is true whenever you are employed and the second parameter, vacation is true whenever you are on vacation.
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
  string.replaceAll("\\d", "")  // Regex \\d
}
println(stringClean("1Mary12345")) //Mary
//also
// string.filterNot(_.isDigit)

/**Q - Palindrome detector eg madam, kayak, taco cats, step on no pets */





/** Debug Greeting - greet everyone as they come aboard. It is your job to fix the code and get the program working again!
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
  if ((a.isUpper && b.isUpper) || (a.isLower && b.isLower)) {
    return 1
  }



}




//
//if ((a.isUpper && b.isLower) || (a.isLower && b.isUpper)) {
//  return -1
//  else 0
def sameCase(a: Char, b: Char): Int = {

  // Check if both characters are the same case = 1
  if ((a.isUpper && b.isUpper) || (a.isLower && b.isLower)) {
    return 1
  }
  // Check if both characters are letters = -1
  //If either are not, return -1
  if (!a.isLetter || !b.isLetter) {
    return -1
  }
  // Both characters are letters but not the same case =0
  0
}


