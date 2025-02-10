/**
 Functions, Methods, & For comprehensions MPV
 */

//Q1 COMPLETED Write a method to calculate the square of an Int. It should have an input parameter, Int and return type Int.

//Methods have 'def' in them or start with 'def'
  //TIP: Must be given a unique name e.g squareOfAnInt

def squareOfAnInt (number:Int): Int = number * number
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
          //It will iterate over a List of Ints
          //Will square each Int in the List
          //WIll filter and keep only the odd squared values
          //Then, return the sum of these odd squared numbers.
          //It needs to have List [Int] and return type INT.
//def squareOfAnInt (number:Int): Int = number * number
//def isOdd (number:Int): Boolean = number % 2 == 1

//def sumOfOddNumbers (List: Int): Int = {
  //numbers
//}

//def useIfGuard: Seq [Int] = for (number <-1 to 10 if number % 2 == 0 ) yield number
//useIfGuard
//runs if the numbers are odd
//def squaredNumbers: Seq[Int] = for (number <- 1 to 5) yield number * number
//squaredNumbers


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

def studentGradeCalculation (averageScore : Double): String = {
 if (averageScore >=90) "Grade A"
 else if (averageScore >=80) "Grade B" //scale is 80-89
 else if (averageScore >=70) "Grade C" //scale is 70-79
 else if (averageScore >=60) "Grade D" //scale is 60-69
 else "Grade E" //scale is 0-59
}

val studentIndividualGrades = (scienceResult + mathResult + historyResult) / 3.0

val finalStudentScore = studentGradeCalculation (studentIndividualGrades)

println (s"Your average score is $studentIndividualGrades and your grade is $grade")

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




