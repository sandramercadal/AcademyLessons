package Week3.Fri

import java.time.LocalDate

object EithersLesson extends App {

  //This takes a left (ERROR) and Right [Success] parameter.
  //If we have String & String we don't use this, needs to be 2 diff parameters
  //Tends to favour the right (success) it is right bias
  //main use is error handling

  //write a method to check if something is odd or even
  // if number is odd get success case else return a boolean
  //def isOdd (x: Int): Either [Boolean, String]  = if (x % 2 !=0)  Right (s"$x is odd") else Left (false)
  //println (isOdd(4)) //LEFT 4 is even
  //println (isOdd(7))  //RIGHT 7 is odd
//Helps manage results in a clear way


  //The point of eithers is to get a good error message
  //Let's make it better!
  //yest we made custom errors and made classes and pass our type into a class to be typesafe
  //lets make a class of NewError

  //1. Error handle using extends Exception --> custom errors but have to make sure we use a val to make params reachable
  //by extending exception this should hit our left?

  //a custom exception class (NewError) and a case object (IsOddError) to represent specific error states.
  // The function isOdd provides either a success message or an error message wrapped in an Either type,
  // which makes it clear whether the operation was successful or if an error occurred.
  // When you call isOdd(4), it identifies the input as even and returns the associated error.
  class NewError(val errorCode: Int, val errorMessage: String) extends Exception

  //custom error
  //easiest way to use enums
  //can use case
  case object IsOddError extends NewError(400, "Input is not odd, it is even.") //newError is an int as specified in the class NewError above

  def isOdd(x: Int): Either[NewError, String] = if (x % 2 != 0) Right(s"$x is odd") else Left(IsOddError)

  println(isOdd(4)) //LEFT 4 is an even number not odd so correct so LEFT. Where it was written: Left(Week3.Fri.Eithers$IsOddError$)
  println(isOdd(7)) //RIGHT 7 is an odd number so correct so Right(7 is odd)

  //2nd way
  //2. Error handling using Try/Catch - gives more inbuilt information
  //method called plus one

  //def plusOne (x:Int): Either [String, Int] = {
  //try {
  //Right (x + 1)  //if you can do it get x and plus one
  //}  catch { //if not catch and return a case
  ///case e: Exception => Left (s"Failed due to: $e")  //e or exception. This is our wildcard
  //}
  //}
  //println (plusOne(7)) //expecting this to hit our right. if we are putting an int it will alwasy catch
  //Right(8)

  //No point writing a tri catch if it cant fail

  //cant we convert strings to Int??
  //println ("one".toInt) wont work it doesnt know what "one" is

  def plusOne(x: String): Either[String, Int] = {
    try {
      Right(x.toInt + 1) //if you can do it get x and plus one
    } catch { //if not catch and return a case
      case e: Exception => Left(s"Failed due to: $e") //e or exception. This is our wildcard
    }
  }

  println(plusOne("1")) // Right(2) because 1 + 1 = 2
  println(plusOne("one")) // Left(Failed due to: java.lang.NumberFormatException: For input string: "one")


  //EITHERS WITH FOR COMPREHENSION
  //They fail fast - this means as soon as one condition hits a left, we exist for comprehension.

  //Break up a username example
  // validate a user
  //case class as bottom level
  //This user is going ot try and log into something
  //Condition 1 - the username must be at least 12 characters long
  //Condition 2 - the password must be a mixture of upper and lower case
  //Condition 3 - Dob  - must be 18


  //obj trait class needs a CAPS
  case class User(username: String, password: String, dateOfBirth: LocalDate)

  case class ValidatedUser(username: String, password: String, dateOfBirth: LocalDate) //return type at the end


  case object UsernameError extends NewError(400, "username is less than 12 characters long")

  case object PasswordError extends NewError(400, "password is not a mixture of upper and lower case")

  case object dateOfBirthError extends NewError(400, "not 18 yet")

  //here is my user whose password is incorrect and 2nd user who has right criteria
  val usernameBad = User("user", "Password", LocalDate.of(1960, 6, 5))  //WE want everything to be fine except the username
  val passwordBad = User("validusername", "Password", LocalDate.of(1960, 6, 5)) //WE want everything to be fine except the pswd
  val dateOfBirthBad = User("validusername", "Password", LocalDate.of(2022, 6, 5)) //WE want everything to be fine except the dob

  val validUser = User("validusername", "Password", LocalDate.of(1960, 6, 5)) //everything fine

  //1. we could PM, use if else statement ..if we are happy we will hit our right otherwise left
  //Let's write our first method for username
  // best practise is to hit unhappy case first LEFT then RIGHT
  def validateUsername(username: String): Either[NewError, String] = {
    if (username.length < 12) Left(UsernameError)
    else Right(username)
  }

  println("\nvalidate username (bad - left): " + validateUsername(usernameBad.username))
  println("\nvalidate username (success - right): " + validateUsername(usernameBad.username))
  //validate username (bad - left): Left(Week3.Fri.Eithers$usernameError$)
  //
  //validate username (success - right): Left(Week3.Fri.Eithers$usernameError$)

  //2.
  //Let's write our  method for password
  //password is a mixture of upper and lower case. we will compare it to a list all all upper and all lower


  def validatePassword(password: String): Either[NewError, String] = {
    if (password.toUpperCase == password || password.toLowerCase == password) Left(PasswordError)
    else Right(password)
  }

  //validate the password
  println("\nvalidate username (bad - left): " + validateUsername(passwordBad.password))
  println("\nvalidate username (success - right): " + validateUsername(validUser.password))
  //validate username (bad - left): Left(Week3.Fri.Eithers$UsernameError$)
  //
  //validate username (success - right): Left(Week3.Fri.Eithers$UsernameError$)

  //3
  //Let's write our  method for DOB
  //hitting error case first so LEFT

  def validateAge(dateOfBirth: LocalDate): Either[NewError, LocalDate] = {
  if (dateOfBirth.plusYears(18).isAfter(LocalDate.now)) Left(dateOfBirthError)
  else Right(dateOfBirth)
}

  //if their dob plus 18 years is in the future then they are over 18

  println("\nvalidate Age (bad - left): " + validateAge(dateOfBirthBad.dateOfBirth))
  println("\nvalidate Age (success - right): " + validateAge(validUser.dateOfBirth))
//validate Age (bad - left): Left(Week3.Fri.Eithers$dateOfBirthError$)
  //
  //validate Age (succes - right): Right(1960-06-05)

  //Let's use a for comprehension now to put all the methods together and return the validated user if they are all happy
  ///I want to return my whole user here. My case class is validatedUser

  def validateUser(user:User): Either[NewError, ValidatedUser] = {
    for {
      storedUsername <- validateUsername(user.username) //calling method, if happy (right), store in the val called username. If unhappy (left) - exit for comp.
      storedPassword <- validatePassword(user.password)
      storedDateOfBirth <- validateAge(user.dateOfBirth)
      validatedUser = ValidatedUser(storedUsername, storedPassword, storedDateOfBirth) //make case class using the stored data from the for comp
    } yield validatedUser //final return type
  }

  println("\nValidateUser - bad username: " + validateUser(usernameBad)) //username error
  println("\nValidateUser - bad password: " + validateUser(passwordBad)) // password error
  println("\nValidateUser - bad date of birth: " + validateUser(dateOfBirthBad)) //DOB error
  println("\nValidateUser - everything ok: " + validateUser(validUser)) // Right - ValidatedUser case class

  //Mortgage
  // case class PersonApplyingForMortage (salary: Double,......deposit.....creditScore )
//case class Property (salary: Double,......deposit.....creditScore )
//case class MortageEligibility (salary: Double,......deposit.....creditScore )


}
