package Week3.Fri.MPVTask

import Week3.Fri.MPVTask.Name.{GenericPostageError, InvalidNameError, Letter, Name, Postcode}

object EitherLogic extends App{

  //Q6. Create an object called EitherLogic and extend App to make it runnable. Inside the object, create the following values that have a type `Either [GenericPostageError, Letter]`
  //• `val letter`: A letter constructed using the `.apply` method of `Letter`
  //• `val invalidLetter`: An error constructed using the `.apply` method of
  //`InvalidNameError`

  //  val letter: Right[Nothing, Letter] =
  //    Right(Letter(Name("Sally Smith"), Postcode ("CM123BX"))) //Q6

  //  val invalidLetter: Left[InvalidNameError, Letter] =  //Q6
  //    Left(InvalidNameError ("The details are invalid!!"))

  //Q7. Now, since you defined a value, you can actually refine the above values to be:
  //• `val letter: Right [Nothing, Letter]`
  //• `val invalidLetter: Left [InvalidNameError, Nothing]`
  //• These are still valid types!

  val letter: Right[Nothing, Letter] =
    Right(Letter(Name("Sally Smith"), Postcode("CM123BX"))) //Q7 updated from Q6

  val invalidLetter: Left[InvalidNameError, Nothing] = //Q6 updated from Q6
    Left(InvalidNameError("The details are invalid!!"))

  //Q8. Print the values above, can you see if it's a `Right` or `Left`?
  println("Right of a valid letter: " + letter) //Q8
  println("Left of an invalid letter: " + invalidLetter) //Q8

//Q12. Create the following variables inside the EitherLogic Object, using the `.letterOrError` method
  //you created in Q11.
  //• `val letterWithANumberInName`: A letter constructed with a number in the name
  //• `val letterWithAnInvalidPostcode`: A letter constructed with an invalid postcode
  //• `val letterAllInvalid`: A letter constructed with a number in the name and an invalid
  //postcode
  //• `val letterAllValid`: A letter constructed with a valid name and an valid postcode

  val letterWithANumberInName: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Sally Smith123", maybePostcode = "CM12 3BX") //Q12

  val letterWithAnInvalidPostcode: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Sally Smith", maybePostcode = "CM12 3BX") //Q12

  val letterAllInvalid: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Sally Smith123", maybePostcode = "CM12 3BX") //Q12

  val letterAllValid: Either[GenericPostageError, Letter] =
    Letter.letterOrError(maybeName = "Sally Smith", maybePostcode = "CM12 3BX") //Q12

  println("\nMade using the .letterOrError method:") //Made using the .letterOrError method:

  println("Left of a letter due to having numbers in the name: " + letterWithANumberInName) //Q13 //Left of a letter due to having numbers in the name: Left(InvalidNameError(Not a valid name))

  println("Left of a letter due to having no space in the postcode: " + letterWithAnInvalidPostcode) //Q13 //Left of a letter due to having no space in the postcode: Right(Letter(Name(Sally Smith),Postcode(CM12 3BX)))

  println("Left of a letter due to having invalid name and postcode: " + letterAllInvalid) //Q13 Name error printed as checks that first, finds it invalid and then leaves the for comp.
  //Left of a letter due to having invalid name and postcode: Left(InvalidNameError(Not a valid name))

  println("Right of a valid letter: " + letterAllValid) //Q13//Right of a valid letter: Right(Letter(Name(Sally Smith),Postcode(CM12 3BX)))


}
