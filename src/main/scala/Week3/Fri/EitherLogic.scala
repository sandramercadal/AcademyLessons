/**

package Week3.Fri

import Week3.Fri.EitherLetter.{InvalidNameError, Letter, Name, Postcode}
//do we need to import it ??

case class Name (value: String) //Q1

object EitherLogic extends App {

  //Q7. Now, since you defined a value, you can actually refine the above values to be:
  //• `val letter: Right [Nothing, Letter]`
  //• `val invalidLetter: Left [InvalidNameError, Nothing]`
  //• These are still valid types!

  val letter: Right[Nothing, Letter] =
    Right(Letter(Name("Sandra Mercadal"), Postcode ("SE219DA")))

  val invalidLetter: Left[InvalidNameError, Nothing] =
    Left(InvalidNameError ("The details are invalid"))



  case class Postcode (value: String)
  object Postcode {

    def postcodeOrError (maybePostCode: String): Either [InvalidPostcodeError, Postcode] = {




    }

  }
 }


*/


