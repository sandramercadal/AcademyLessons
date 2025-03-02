import scala.io.Codec

/**
 * Functions, Methods, & For comprehensions MPV
 */

//Q1 COMPLETED Write a method to calculate the square of an Int. It should have an input parameter, Int and return type Int.

//Methods have 'def' in them or start with 'def'
  //TIP: Must be given a unique name e.g squareOfAnInt

def squareOfAnInt (number:Int): Int = number * number //: Int: indicates that the function will return an integer.
squareOfAnInt(6)
squareOfAnInt(64)

//Q2 COMPLETED Write a method to check if a number is odd. It should have an input parameter, Int and return type Boolean.

def isOdd (number:Int): Boolean = number % 2 == 1
//solution needs an input parameter
isOdd(7)
isOdd(2)

//Q3 NOT COMPLETED
// Use a For Comparison and the two methods I created above (squareOfAnInt & isOdd) to write a method sumOfOddNumbers.
//TIP: For comparison doesn't work with Int.
// For comparison is a lightweight notation for expression of sequence comprehension/simplified way of writing a function.
//TYPES: Classic, Use operators or Use if guards.
// SYNTAX: Uses backward symbol e.g. for (numbers <- 1 to <-10) yield numbers  - and 2 symbols will appear between 'to'.
          //MPV:
          //It will iterate over a List of Ints
          //Will square each Int in the List
          //WIll filter and keep only the odd squared values
          //Then, return the sum of these odd squared numbers.
          //It needs to have List [Int] and return type INT.

//APRILS CODE Q3
val numbers:List[Int] = List(1,2,3,4,5,6,7,8,9,10)
def sumOfOddNumbers(numbers: List[Int]): Int = {
  val oddSquares = for {
    number <- numbers //iterate over the list
    square = squareOfAnInt(number) //calculate square (each value). Need to use = as the newSquared method returns an Int.
    if isOdd(square) //use an if guard, filter and keep only the odd values of square
  } yield square //collect all the odd squares
  oddSquares.sum //sum filtered odd squares by calling your val
}
sumOfOddNumbers(numbers)

//Q4 COMPLETED Write a Grading system
//Save each method as a Val, each method does one thing.

/**Business process model to produce grade in (UML) Universal Markup Language (swimlane model):
 Only 1 Actor in this process model

CODE STEPS:
Val [subjectname]Result to specify each paper result
Method function studentGradeCalculation to calculate grade - remember to use something that can capture decimals so not an Int
Val studentGradeCalculation to calculate average score. Calculate average first then pass all 3:
 Needs to pass 3 results (science, history & maths).
 Pass all 3 with Val finalStudentScore
Print output
*/
val scienceResult = 50
val mathResult = 85
val historyResult =59

def studentGradeCalculation (averageScore : Double): String = {  //method takes one parameter named averageScore,
  // which is of type Double. This means it is expected to be a decimal number (like 85.5).
 if (averageScore >=90) "Grade A"
 else if (averageScore >=80) "Grade B" //scale is 80-89
 else if (averageScore >=70) "Grade C" //scale is 70-79
 else if (averageScore >=60) "Grade D" //scale is 60-69
 else "Grade E" //scale is 0-59
}

val studentIndividualGrades = (scienceResult + mathResult + historyResult) / 3.0

val finalStudentScore = studentGradeCalculation (studentIndividualGrades)

println (s"Your average score is $studentIndividualGrades and your grade is $finalStudentScore")

//APRILS CODE
val studentScore: List[Int] = List(97, 75, 89) //Contains a list of INTS

def calculateAverage(scores: List[Int]): Double = {
  scores.sum / scores.length  //calculates the total of all the scores in the list, and scores.length gives the number of scores in the list.
  //The method returns the average score as a Double using the formula: total scores / number of scores. However, note that this will perform integer division because both sum and length are integers, so it's better to convert them to Double to avoid losing decimal values.
}

def determineGrade(average: Double): String = {
  if (average >= 90) "A"
  else if (average >=80) "B"
  else if (average >=70) "C"
  else if (average >=60) "D"
  else "E"
}

def studentFinalGrade(scores:List[Int]): String = determineGrade(calculateAverage(scores))

studentFinalGrade(studentScore)



/** Research Pure & Impure
Scala is a functional language so functional programming is a way of writing computer programs as
 the evaluation of mathematical functions, which avoids changing the state or the mutating data.
Functional programming is categorized into 2 groups: Pure or Impure.
A PURE function always gives the same outputs for the same arguments no matter how many times
 it is called. They are easier to test and debug. They have no side effects (i.e it does not modify an
 existing variable,array, list or an object of reads from a file or writes to a file.
e.g
Addition
Subtraction
Division
Multiplication
toUpper
toLower
isEmpty
lenth
 An IMPURE function can give different output every time it is called and the output of the funtion
 is not dependant only on the input parameters.
  */
//APRILS Code

/** Pure and Impure Functions */
//Pure: Given the same input(s) the output will always be the same.
//Impure: Given the same input(s) the output will be different if passed in multiple times.
//Bit of a spot the difference - val/var.

//Pure: Given the same input(s) the output will always be the same.
//Impure: Given the same input(s) the output will be different if passed in multiple times.

///**Example of pure: */
val sentence: String = ""

def append(sentence:String, word: String): String =
  sentence + " " + word.trim()

val a = append(sentence, "Allo") // "Allo"
val b = append(sentence, "Allo") // "Allo"

/** Example of impure: */
var sentence: String = ""

def append(word: String): String = {
  sentence = sentence + " " + word
  sentence.trim()
}

val a = append("Allo") // "Allo"
val b = append("Allo") // "Allo Allo"

////WHY? val and var. Immutable vs mutable.
//// passing in empty string as sentence for the pure.
//// Aim for pure! We want safe code!




