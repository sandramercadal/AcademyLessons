
//case classes come by default with the apply method already defined which basically allows you to instantiate a Letter for example like this: Letter(add parameters in here )
// instead of using the "new" keyword e.g. new Letter(add parameters in here)

case class Letter (name: Name, postcode: Postcode)

trait GenericPostageError {
  val message: String
}

case class InvalidNameError (message: String) extends GenericPostageError

case class InvalidPostcodeError (message: String) extends GenericPostageError


object EitherLogic extends App {

  val letter: Right[Nothing, Letter] =
    Right(Letter(Name("Sandra Mercadal"), Postcode ("SE219DA")))

  val invalidLetter: Left[InvalidNameError, Nothing] =
    Left(InvalidNameError ("The details are invalid"))

  println(letter)
  println(invalidLetter)
  println(Postcode.postcodeOrError("SE2199B"))

}

//Create two case classes, `Name` and `Postcode`
  //• Both can take `value: String`

  //case class Postcode (value: String)

  //2. Create a case class called `Letter` that contains a `name` and `postcode`
  //• The `name` should have the type `Name`
  //• The `postcode` should have the type `Postcode`


  //3. Create a trait called `GenericPostageError`
  //• Give it a parameter method `message` with a type `String` (USE VAL)

  //4. Create a case class called `InvalidNameError`
  //• Give it a parameter `message` with a type `String`
  //• Let it be extended by `GenericPostageError`

  //5. Create a case class called `InvalidPostcodeError`
  //• Give it a parameter `message` with a type `String`
  //• Let it be extended by `GenericPostageError`

  //6. Create an object called EitherLogic and extend App to make it runnable.
  // Inside the object, create the following values that have a type `Either [GenericPostageError, Letter]`
  //• `val letter`: A letter constructed using the `.apply` method of `Letter`
  //• `val invalidLetter`: An error constructed using the `.apply` method of
  //  `InvalidNameError`

//App extended on Line 3

 //val letter: Either [GenericPostageError, Letter] = Right(Letter(Name("Sandra Mercadal"), Postcode ("SE219DA")))

  //val invalidLetter: Either[GenericPostageError, Letter] = Left(InvalidNameError ("The details are invalid"))

  //7. Now, since you defined a value, you can actually refine the above values to be:
  //• `val letter: Right [Nothing, Letter]`
  //• `val invalidLetter: Left [InvalidNameError, Nothing]`
  //• These are still valid types!

  // 8. Print the values above, can you see if it's a `Right` or `Left`?

  //To run this need a method like we did with e match ?

 // println(InvalidLetter)


  //9. Create companion object to `PostCode` and inside it:
  //• Create a method called `postcodeOrError` with the return type of `Either
    //[InvalidPostcodeError, Postcode]`
  //It takes in a `String` called `maybePostCode`
  //If the `maybePostCode` is two Strings with a whitespace in between them, then return
  //`Postcode`. (You might need to do a little research here!!)
  //However, if the above condition is not satisfied, return an `InvalidPostcodeError`

  //COMPANION OBJECT to PostCode
//In Scala, a companion object is defined with the same name as the class or a trait and appears in the same file source.
 //The companion object can access the private members of the class and trait and it serves as a factory for creating instances of that class.











