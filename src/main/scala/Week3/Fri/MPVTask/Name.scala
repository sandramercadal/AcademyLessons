package Week3.Fri.MPVTask

/** L E T T E R -- M V P
 * This file defines a domain model for postal addresses with validation logic:
 * Case classes for Name, Postcode, and Letter
 * Companion objects with validation methods that return Either types
 * Error types like InvalidNameError and InvalidPostcodeError
 *
 * The second file (EitherLogic) demonstrates how to use this validation system:
 * It creates various examples of valid and invalid letters
 * It shows how the validation methods handle different error cases
 * It prints the results to demonstrate the behavior
 *
 * The Validation Pattern
 * The code uses the Either type to represent validation results:
 * Right contains successfully validated data
 * Left contains error information when validation fails
 *
 * This pattern allows for composing validations with the for-comprehension you see in the letterOrError method.
 * */
//import Week3.Fri.Name.Postcode.InvalidNameError

object Name {

  //case classes come by default with the apply method already defined which basically allows you to instantiate a Letter for example like this: Letter(add parameters in here )
  // instead of using the "new" keyword e.g. new Letter(add parameters in here)

  case class Name(value: String) //Q1 Create two case classes, `Name` and `Postcode`
  //• Both can take `value: String`


  //Q10. Create companion object to `Name` and inside it:
  //• Create a method called `nameOrError`, with the return type of `Either [InvalidNameError, Name]`
  //• It takes in a `String` called `maybeName`
  //• If the `maybeName` has a number in it, then return an `InvalidNameError`
  //• If the above condition is not satisfied, return a `Name`
  object Name { //Q10
    def nameOrError(maybeName: String): Either[InvalidNameError, Name] =
      if (maybeName.exists(_.isDigit)) //if it contains an int...
        Left(InvalidNameError("Not a valid name"))
      else //if it doesn't...
        Right(Name(maybeName))
  }

  case class Postcode(value: String) //Q1 Create two case classes, `Name` and `Postcode`. Both can take `value: String`

  //9. Create companion object to `PostCode` and inside it:
  //• Create a method called `postcodeOrError` with the return type of `Either [InvalidPostcodeError, Postcode]`
  //• It takes in a `String` called `maybePostCode`
  //• If the `maybePostCode` is two Strings with a whitespace in between them, then return a `Postcode`. (You might need to do a little research here!!)
  //• However, if the above condition is not satisfied, return an `InvalidPostcodeError`
  object Postcode { //Q9
    def postcodeOrError(maybePostCode: String): Either[InvalidPostcodeError, Postcode] = {
      maybePostCode match {
        case postcode if postcode.split(" ").length == 2 => Right(Postcode(maybePostCode))
        case _ => Left(InvalidPostcodeError("Not a valid postcode!!"))
      }
    }
  }

  //2. Create a case class called `Letter` that contains a `name` and `postcode`
  //• The `name` should have the type `Name`
  //• The `postcode` should have the type `Postcode`
  case class Letter(name: Name, postcode: Postcode) //Q2


  //  Q11. Create companion object to `Letter` and inside it:
  //  • Create a method called `letterOrError`
  //  • Pass in two `String`s called `maybeName` and `maybePostCode`
  //  • Using a for comprehension, use the methods `nameOrError` and `postcodeOrError` to
  //  create a `Letter`.
  //  • Carefully consider what the return type of the `letterOrError` method should be!
  object Letter { //Q11
    def letterOrError(maybeName: String, maybePostcode: String): Either[GenericPostageError, Letter] =
      for {
        name <- Name.nameOrError(maybeName)
        postCode <- Postcode.postcodeOrError(maybePostcode)
      } yield {
        Letter(name, postCode)
      }
  }

  //3. Create a trait called `GenericPostageError`
  //•Give it a parameter method `message` with a type `String`
  trait GenericPostageError { //Q3
    def message: String
  }

  //4. Create a case class called `InvalidNameError`
  //• Give it a parameter `message` with a type `String`
  //• Let it be extended by `GenericPostageError`
  case class InvalidNameError(message: String) extends GenericPostageError //Q4

  //5. Create a case class called `InvalidPostcodeError`
  //• Give it a parameter `message` with a type `String`
  //• Let it be extended by `GenericPostageError`
  case class InvalidPostcodeError(message: String) extends GenericPostageError //Q5


}


