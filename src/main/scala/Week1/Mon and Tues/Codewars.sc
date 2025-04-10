/**Q1 you received a whatsup message from an unknown number. Could it be from that girl/boy with a foreign accent you met yesterday evening?

Write a simple function to check if the string contains the word hallo in different languages.
  These are the languages of the possible people you met the night before:
  hello - english
ciao - italian
salut - french
hallo - german
hola - spanish
ahoj - czech republic
  czesc - polish */

def containsGreeting(message: String): Boolean = {
  val greetings = List("hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc")
  greetings.exists(message.toLowerCase.contains)
  //OR greetings.exists(greeting => message.toLowerCase.contains(greeting))
  //OR greetings.map(message.toLowerCase.contains).contains(true)
}
println(containsGreeting("hello")) //true


//Q2
 /**Create a function finalGrade, which calculates the final grade of a student depending on two parameters: an exam grade & number of completed projects.
  This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);
  This function should return a number (final grade). There are four types of final grades:
  100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
  90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
  75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
  0, in other cases

Create a function finalGrade, which calculates the final grade of a student depending on two parameters: a grade for the exam and a number of completed projects.

This function should take two arguments: exam - grade for exam (from 0 to 100); projects - number of completed projects (from 0 and above);

This function should return a number (final grade). There are four types of final grades:

  100, if a grade for the exam is more than 90 or if a number of completed projects more than 10.
90, if a grade for the exam is more than 75 and if a number of completed projects is minimum 5.
75, if a grade for the exam is more than 50 and if a number of completed projects is minimum 2.
0, in other cases
Examples(Inputs-->Output):
  100, 12 --> 100
99, 0 --> 100
10, 15 --> 100
85, 5 --> 90
55, 3 --> 75
55, 0 --> 0
20, 2 --> 0 */

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
println(finalGrade(99, 0))   // 100
println(finalGrade(85, 5))   // 90
println(finalGrade(55, 3))   // 75
println(finalGrade(55, 0))   // 0
println(finalGrade(20, 2))   // 0

//Someone elses code with match case
//def finalGrade(exam: Int, projects: Int): Int = (exam, projects) match
//case (e, p) if e > 90 || p > 10 => 100
//case (e, p) if e > 75 && p >= 5 => 90
//case (e, p) if e > 50 && p >= 2 => 75
//case _                          => 0

/**Q3 Write a function which converts the input string to uppercase.**/
 def makeUpperCase(string: String): String = string.toUpperCase
println(makeUpperCase("hello, sandra")) //HELLO, SANDRA
println(makeUpperCase("hello")) //HELLO

/**Q4 Is the string uppercase?
 Create a method to see whether the string is ALL CAPS.

 Examples (input -> output)
 "c" -> False
 "C" -> True
 "hello I AM DONALD" -> False
 "HELLO I AM DONALD" -> True
 "ACSKLDFJSgSKLDFJSKLDFJ" -> False
 "ACSKLDFJSGSKLDFJSKLDFJ" -> True **/

def isUpperCase(input: String): Boolean = {
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

/**Q4 You will need a rental car in order for you to get around in your vacation. Every day you rent the car costs $40. If you rent the car for 7 or more days, you get $50 off your total. Alternatively, if you rent the car for 3 or more days, you get $20 off your total.
 Write a code that gives out the total amount for different days(d).**/
//I was trying to reassign totalCOst val after declaring it as a val!
//def cost(days: Int): Int = {
//  val dailyCarRental = 40
//  val totalCost = dailyCarRental * days
//
//  if (days >= 7) {
//    totalCost = totalCost - 50
//
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
    } else if (days >=3) {
      initialCost - 20
    }
    else
      initialCost
  }
}
println(Rental.cost(7)) //230 (7 x 40 - 50 discount = 230)

/**Q5 Parse nice int from char problem - "How old are you?" She always says, "x years old", where x is a random number between 0 and 9.
 Write a program that returns the girl's age (0-9) as an integer. Assume the test input string is always a valid string. For example, the test input may be "1 year old" o  **/

