package Week3.Thurs

import java.time.LocalDate
import scala.List
import java.time.temporal.ChronoUnit

//Q1
// When given an input of a string, name of a country, you need to return a string of that
//country’s capital city, for example “France” should return “Paris”, “England” should return
//“London” etc.
//You must:
//- Use pattern matching.
//- Think about how you will deal with countries you have not included.
//- Think about what happens when someone has entered a country in all lowercase/
//uppercase or mixed?
//- Think about how you account for unneeded white spaces entered (e.g. " England ")?

object ThursMPV extends App {

  //my method is: def getCapital and use this to call the println
  def getCapital(country: String): String = { //takes a single parameter country, & will return a String representing the capital of the specified country.

    country.trim.toLowerCase match {
      case "france" => "Paris"
      case "spain" => "Madrid"
      case "england" => "London"
      case "italy" => "Rome"
      case "ukraine" => "Kiev"
      case _ => "Unknown capital sorry!"
    }
  }

  println(getCapital("France")) //returns Paris
  println(getCapital("england")) //returns London even though I called it using a lowercase
  println(getCapital("             Italy")) //accounts for blank spaces too :) //returns Rome


  //Q2
  //a) Create a sealed trait called ‘Animal’.
  //b) Create different Animals that extend the Animal trait from 2a. We are going to pattern
  //match in 2c so consider how are going to allow for an exhaustive match.
  //c) Using pattern matching, return a string, which is a fact about the animals from 2b.
  //e.g. case Pig => "Can fly."


  //Sealed case objects
  //Use a singular name not plural to name your sealed case objects eg Animal not Animals
  sealed trait Animal

  case object Pig extends Animal

  case object Sheep extends Animal

  case object Goat extends Animal

  case object Rabbit extends Animal

  case object Donkey extends Animal

  case object Cow extends Animal

  //I'm calling my method aboutAnimal
  //takes a parameter animal of type Animal
  //returns String that will provide info about the given animal.
  def aboutAnimal(animal: Animal): String = animal match {
    case Pig => "I am a pink pig"
    case Sheep => "I am a cute sheep"
    case Goat => "I am a clever goat"
    case Rabbit => "I am a happy bunny"
    case Donkey => "I am a big donkey"
    case Cow => "I am a small cow"
  }

  println(aboutAnimal(Rabbit)) //I am a happy bunny
  println(aboutAnimal(Cow)) //I am a small cow
  println(aboutAnimal(Goat)) //I am a clever goat


  /**
   * E X T E N S I O N
   */
  //1a Add speciesName: String as a parameter

  sealed trait AnimalExtension

  case class Turtle(speciesName: String) extends AnimalExtension

  case class Leopard(speciesName: String) extends AnimalExtension

  case class Whale(speciesName: String) extends AnimalExtension

  case class Sloth(speciesName: String) extends AnimalExtension
  //1b

  val criticallyEndangered: List[String] = List("Box Turtle",
    "Amur Leopard", "Blue Whale", "Pygmy Three-Toed Sloth")

  //1b - the cases
  def aboutTheAnimals(animals: AnimalExtension): List[String] = {
    animals match {

      case Turtle(speciesName) if criticallyEndangered.contains(speciesName) =>
        List(s"A $speciesName is cute and", s"a$speciesName is critically endangered!")

      case Leopard(speciesName) if criticallyEndangered.contains(speciesName) =>
        List(s"A $speciesName is fierce but", s"a$speciesName is critically endangered!")

      case Whale(speciesName) if criticallyEndangered.contains(speciesName) =>
        List(s"A $speciesName is fast and", s"a$speciesName is critically endangered!")

      case Sloth(speciesName) if criticallyEndangered.contains(speciesName) =>
        List(s"A $speciesName is gentle and", s"a$speciesName is critically endangered!")
    }
  }

  println(aboutTheAnimals(Turtle("Box Turtle")))
  println(aboutTheAnimals(Leopard("Amur Leopard")))
  println(aboutTheAnimals(Whale("Blue Whale")))
  println(aboutTheAnimals(Sloth("Pygmy Three-Toed Sloth")))

  //Q3a)
  /** Create a person object from InputPerson object */
  //and add some additional fields in the process eg age, starsign, ageAtDeath
  //Implements Horoscope & LocalDate & ChronoUnit

    case class InputPerson (fullName: String,
                            dateOfBirth: LocalDate, //import LocalDate here and in dateOfDeath
                            occupation: Option[String],
                            lastCountryLivedIn: String,
                            dateOfDeath: Option[LocalDate],//whether they are alive or deceased, if exists calculates age as years between birth and death otherwise year between birth and current date
                           )

    case class Person(fullName: String,
                      dateOfBirth: LocalDate,
                      occupation: Option[String],
                      lastCountryLivedIn: String,
                      dateOfDeath: Option[LocalDate],
                      age: Int, //additional params
                      starSign: String,//additional params - uses DOB for this
                      ageAtDeath: Option[Int])//additional params - if has died, can create some age else none if still alive//This method will accept an InputPerson case class

  /**Write a method called createPerson, with the return type Person*/ //- takes an input of type InputPerson and returns a Person.

  def createPerson (input: InputPerson) : Person = {
    //calculate age handles both living and deceased individuals correctly, using either their date of death or the current date.
    val age: Int = input.dateOfDeath match {
      case Some(deathDate) => ChronoUnit.YEARS.between(input.dateOfBirth, deathDate).toInt
      case None => ChronoUnit.YEARS.between(input.dateOfBirth, LocalDate.now()).toInt
    }

    //Uses pattern matching on the dateOfDeath field, which is Option[LocalDate] type.
    //If dateOfDeath is Some(deathDate) (the person is deceased), it calculates age as the years between birth date and death date
    //If dateOfDeath is None (the person is still alive), it calculates age as the years between birth date and the current date
    //In both cases, uses Java's ChronoUnit.YEARS.between() method to calculate the difference in years between two dates, and then converts the result to an integer using .toInt.

    /** Get Starsign from the Horoscope I previously created */
    val starSign: String = horoscope(input.dateOfBirth)._1

    /** Create ageAtDeath */

    val ageAtDeath: Option[Int] = input.dateOfDeath.map (deathDate =>
    ChronoUnit.YEARS.between(input.dateOfBirth, deathDate).toInt)
  //  val ageAtDeath: Option[Int] = input.dateOfDeath match {
  //    case Some(deathDate) => (ChronoUnit.YEARS.between(input.dateOfBirth, deathDate).toInt)
  //    case None => None

    //Create and return person object with all the parameters
    Person(
      fullName = input.fullName,
      dateOfBirth = input.dateOfBirth,
      occupation = input.occupation,
      lastCountryLivedIn = input.lastCountryLivedIn,
      dateOfDeath = input.dateOfDeath,
      age = age,
      starSign = starSign,
      ageAtDeath = ageAtDeath)

  }

    val input = InputPerson(fullName = "James Bond",
      dateOfBirth = LocalDate.of(1960, 12, 11),
      occupation = Some("Spy"),
      lastCountryLivedIn = "Bermuda",
      dateOfDeath = Some(LocalDate.of(2024, 12, 1)))


    println(createPerson(input)) //Person(James Bond,1960-12-11,Some(Spy),Bermuda,Some(2024-12-01),63,Sagittarius,Some(63))


  //b) HOROSCOPE - Create a method called horoscope. This method should accept a LocalDate
  // and return a tuple of the star sign and their horoscope. Use pattern matching in your method.
  //Q) Would be able to import this in Scala? import java.time.LocalDate

  import java.time.LocalDate //LocalDate class represents a date without a time-zone in the ISO-8601 calendar system.

  def horoscope(date: LocalDate): (String, String) = { //Local date takes in date and returns a tuple of 2 strings
    val day = date.getDayOfMonth //take day and Month from Java's LocalDate
    val month = date.getMonthValue

    val horoscopeResult = (month, day) match {

      // Aquarius (Jan 20 - Feb 18)
      case (1, d) if d >= 20 => ("Aquarius", "You will shine bright today") //Jan 20-31, case 1 = Jan
      case (2, d) if d <= 18 => ("Aquarius", "You will shine bright today") //Feb 1-18, case 2 = feb
      // Pisces (Feb 19 - Mar 20)
      case (2, d) if d >= 19 => ("Pisces", "You will prosper today") //Feb
      case (3, d) if d <= 20 => ("Pisces", "You will prosper today") //March
      // Aries (Mar 21 - Apr 19)
      case (3, d) if d >= 21 => ("Aries", "You will be limitless today") //March etc
      case (4, d) if d <= 19 => ("Aries", "You will be limitless today")
      // Taurus (Apr 20 - May 20)
      case (4, d) if d >= 20 => ("Taurus", "You will grow today")
      case (5, d) if d <= 20 => ("Taurus", "You will grow today")
      // Gemini (May 21 - Jun 20)
      case (5, d) if d >= 21 => ("Gemini", "You will find fun today")
      case (6, d) if d <= 20 => ("Gemini", "You will find fun today")
      // Cancer (Jun 21 - Jul 22)
      case (6, d) if d >= 21 => ("Cancer", "You will find fortune today")
      case (7, d) if d <= 22 => ("Cancer", "You will find fortune today")
      // Leo (Jul 23 - Aug 22)
      case (7, d) if d >= 23 => ("Leo", "You will rest and recover today")
      case (8, d) if d <= 22 => ("Leo", "You will rest and recover today")
      // Virgo (Aug 23 - Sep 22)
      case (8, d) if d >= 23 => ("Virgo", "You will cook something new today")
      case (9, d) if d <= 22 => ("Virgo", "You will cook something new today")
      // Libra (Sep 23 - Oct 22)
      case (9, d) if d >= 23 => ("Libra", "You will laugh today")
      case (10, d) if d <= 22 => ("Libra", "You will laugh today")
      // Scorpio (Oct 23 - Nov 22)
      case (11, d) if d >= 23 => ("Scorpio", "You will sparkle today")
      case (11, d) if d <= 22 => ("Scorpio", "You will sparkle today")
      // Sagittarius (Nov 23 - Dec 21)
      case (11, d) if d >= 23 => ("Sagittarius", "You will see an old friend today")
      case (12, d) if d <= 21 => ("Sagittarius", "You will see an old friend today")
      // Capricorn (Dec 22 - Jan 19)
      case (12, d) if d >= 22 => ("Capricorn", "You will find fame today")
      case (1, d) if d <= 19 => ("Capricorn", "You will find fame today")
      // Default: no horoscope found
      case _ => ("No horoscope found", "Sorry!")
    }
    horoscopeResult

  }
  val date = LocalDate.of(2019, 7, 29)
  val horoscopeResult = horoscope(date)

  println(s"Your star sign is: ${horoscopeResult._1}. Today's horoscope: ${horoscopeResult._2}")
  //Your star sign is: Aries. Today's horoscope: You will be limitless today

  //  // Aquarius (Jan 20 - Feb 18)
  //  case (1, d) if d >= 20 || (month == 2 && d <= 18) => ("Aquarius", "You will shine bright today")
  //  // Pisces (Feb 19 - Mar 20)
  //  case (2, d) if d >= 19 || (month == 3 && d <= 20) => ("Pisces", "You will prosper today")
  //  // Aries (Mar 21 - Apr 19)
  //  case (3, d) if d >= 21 || (month == 4 && d <= 19) => ("Aries", "You will be limitless today")
  //  // Taurus (Apr 20 - May 20)
  //  case (4, d) if d >= 20 || (month == 5 && d <= 20) => ("Taurus", "You will grow today")
  //  // Gemini (May 21 - Jun 20)
  //  case (5, d) if d >= 21 || (month == 6 && d <= 20) => ("Gemini", "You will find fun today")
  //  // Cancer (Jun 21 - Jul 22)
  //  case (6, d) if d >= 21 || (month == 7 && d <= 22) => ("Cancer", "You will find fortune today")
  //  // Leo (Jul 23 - Aug 22)
  //  case (7, d) if d >= 23 || (month == 8 && d <= 22) => ("Leo", "You will rest and recover today")
  //  // Virgo (Aug 23 - Sep 22)
  //  case (8, d) if d >= 23 || (month == 9 && d <= 22) => ("Virgo", "You will cook something new today")
  //  // Libra (Sep 23 - Oct 22)
  //  case (9, d) if d >= 23 || (month == 10 && d <= 22) => ("Libra", "You will laugh today")
  //  // Scorpio (Oct 23 - Nov 22)
  //  case (10, d) if d >= 23 || (month == 11 && d <= 22) => ("Scorpio", "You will sparkle today")
  //  // Sagittarius (Nov 23 - Dec 21)
  //  case (11, d) if d >= 23 || (month == 12 && d <= 21) => ("Sagittarius", "You will see an old friend today")
  //  // Capricorn (Dec 22 - Jan 19)
  //  case (12, d) if d >= 22 || (month == 1 && d <= 19) => ("Capricorn", "You will find fame today")
  //  // Default: no horoscope found
  //  case _ => ("No horoscope found", "Sorry!")

  //      case (1, d) if d >= 20 && d <= 31 || (month == 2 && d <= 18) => ("Aquarius", "You will shine bright today")
  //      case (2, d) if d >= 19 && d <= 29 || (month == 3 && d <= 20) => ("Pisces", "You will prosper today")
  //      case (3, d) if d >= 21 && d <= 31 || (month == 4 && d <= 19) => ("Aries", "You will be limitless today")
  //      case (4, d) if d >= 20 && d <= 30 || (month == 5 && d <= 20) => ("Taurus", "You will grow today")
  //      case (5, d) if d >= 21 && d <= 31 || (month == 6 && d <= 20) => ("Gemini", "You will find fun today")
  //      case (6, d) if d >= 21 && d <= 30 || (month == 7 && d <= 22) => ("Cancer", "You will find fortune today")
  //      case (7, d) if d >= 23 && d <= 31 || (month == 8 && d <= 22) => ("Leo", "You will rest and recover today")
  //      case (8, d) if d >= 23 && d <= 31 || (month == 9 && d <= 22) => ("Virgo", "You will cook something new today")
  //      case (9, d) if d >= 23 && d <= 30 || (month == 10 && d <= 22) => ("Libra", "You will laugh today")
  //      case (10, d) if d >= 23 && d <= 31 || (month == 11 && d <= 21) => ("Scorpio", "You will sparkle today")
  //      case (11, d) if d >= 22 && d <= 30 || (month == 12 && d <= 21) => ("Sagittarius", "You will see an old friend today")
  //      case (12, d) if d >= 22 && d <= 31 || (month == 1 && d <= 19) => ("Capricorn", "You will find fame today")
  //      case _ => ("No horoscope found", "Sorry!")

  //      case (1, d) if d >= 20 && d <= 31 => ("Aquarius", "You will shine bright today")
  //      case (2, d) if d <= 18 => ("Aquarius", "You will shine bright today")
  //      case (2, d) if d >= 19 && d <= 29 => ("Pisces", "You will prosper today")
  //      case (3, d) if d <= 20 => ("Pisces", "You will prosper today")
  //      case (3, d) if d >= 21 && d <= 31 => ("Aries", "You will be limitless today")
  //      case (4, d) if d <= 19 => ("Aries", "You will be limitless today")
  //      case (4, d) if d >= 20 && d <= 30 => ("Taurus", "You will grow today")
  //      case (5, d) if d <= 20 => ("Taurus", "You will grow today")
  //      case (5, d) if d >= 21 && d <= 31 => ("Gemini", "You will find fun today")
  //      case (6, d) if d <= 20 => ("Gemini", "You will find fun today")
  //      case (6, d) if d >= 21 && d <= 30 => ("Cancer", "You will find fortune today")
  //      case (7, d) if d <= 22 => ("Cancer", "You will find fortune today")
  //      case (7, d) if d >= 23 && d <= 31 => ("Leo", "You will rest and recover today")
  //      case (8, d) if d <= 22 => ("Leo", "You will rest and recover today")
  //      case (8, d) if d >= 23 && d <= 31 => ("Virgo", "You will cook something new today")
  //      case (9, d) if d <= 22 => ("Virgo", "You will cook something new today")
  //      case (9, d) if d >= 23 && d <= 30 => ("Libra", "You will laugh today")
  //      case (10, d) if d <= 22 => ("Libra", "You will laugh today")
  //      case (10, d) if d >= 23 && d <= 31 => ("Scorpio", "You will sparkle today")
  //      case (11, d) if d <= 22 => ("Scorpio", "You will sparkle today")
  //      case (11, d) if d >= 23 && d <= 30 => ("Sagittarius", "You will see an old friend today")
  //      case (12, d) if d <= 23 => ("Sagittarius", "You will see an old friend today")
  //      case (12, d) if d >= 22 && d <= 31 => ("Capricorn", "You will find fame today")
  //      case (1, d) if d <= 19 => ("Capricorn", "You will find fame today")
  //      case _ => ("No horoscope found", "Sorry!")

  //ANOTHER POSSIBLE WAY

  import java.time.LocalDate
  //
  //  sealed trait Horoscope {
  //    def sign: String
  //    def message: String
  //  }
  //
  //  case object Aquarius extends Horoscope {
  //    val sign = "Aquarius"
  //    val message = "You will be full of creative energy!"
  //  }
  //
  //  case object Pisces extends Horoscope {
  //    val sign = "Pisces"
  //    val message = "Trust your intuition today."
  //  }
  //
  //  case object Aries extends Horoscope {
  //    val sign = "Aries"
  //    val message = "A new opportunity is coming!"
  //  }
  //
  //  case object Taurus extends Horoscope {
  //    val sign = "Taurus"
  //    val message = "Patience is key to your success."
  //  }
  //
  //  case object Gemini extends Horoscope {
  //    val sign = "Gemini"
  //    val message = "Your communication skills will shine!"
  //ETC
  //def horoscope(date: LocalDate): Horoscope = {
  //  val day = date.getDayOfMonth
  //  val month = date.getMonthValue
  //
  //  (month, day) match {
  //    case (1, d) if d >= 20 || d <= 19 => Aquarius
  //    case (2, d) if d >= 20 || d <= 18 => Pisces
  //  ETC
  //    case _ => UnknownHoroscope
  //  }
  //}

//EXTENSION R E S E A R C H
// * Run the method below and look at the output.
// * What is happening here?
// * Is there any way to get around this and make the below method work as expected?

  /** SUMMARY
   * In Scala, pattern matching with _: List[T] does not correctly verify the actual type of the list due to type erasure. At runtime, all generic types like List[Int], List[String], and List[Double] are erased and treated as List[Any], making pattern matching unreliable.

   * Key Issues
   * Type Erasure: The JVM removes generic type information, so runtime type checks on List[T] don’t work as expected.

   * Incorrect Pattern Matching: A match case like _: List[Double] may always be selected, leading to unpredictable results.
   The type List[T] will always match as a List[Double] if the generic type T resolves to a Double.
   * Solutions
   * Checking the First Element

   * def checkListType[T](list: List[T]): String = list.headOption match {
   * case Some(_: Double) => "List of Doubles"
   * case Some(_: String) => "List of Strings"
   * case Some(_: Int) => "List of Ints"
   * case _ => "Unknown"
   * }
   * Limitation: This only checks the first element, which is not always reliable.

   * Using TypeTag for Accurate Type Checking

   * import scala.reflect.runtime.universe._

   * def checkListType[T: TypeTag](list: List[T]): String = typeOf[T] match {
   * case t if t =:= typeOf[Double] => "List of Doubles"
   * case t if t =:= typeOf[String] => "List of Strings"
   * case t if t =:= typeOf[Int] => "List of Ints"
   * case _ => "Unknown"
   * }
   * This method retains type information at runtime, making it a better approach.

   * Takeaways
   * Pattern matching on List[T] is unreliable due to type erasure.

   * Checking list.headOption is a workaround but has limitations.

   * Using TypeTag is the best way to accurately determine the type at runtime.
   * */

  /**
   In Scala, when you're using a generic function, the type information can be lost at runtime. This means that if you declare your function as def checkListType[T](list: List[T]), the type T is erased, and during runtime, the list can default to one of the narrower types.

   To fix this issue, you need to change the approach. Instead of using pattern matching on the list type, you can directly match on the contents' type. Here is  using isInstanceOf to check the type of the list:
   check the type of the list directly. This should give you the correct outputs for each case.*/
def checkListType[T](list: List[T]): String = list match {
  case _: List[Double] => "List of Doubles"
  case _: List[String] => "List of Strings"
  case _: List[Int] => "List of Ints"
  case _=> "Unknown"
}

val numList: List[Int] = List(1, 2, 3)
val doubleList: List[Double] = List(1.0, 2.0, 3.0)
val stringList: List[String] = List("1", "2", "3")

//checkListType(numList)
//checkListType(doubleList)
//checkListType(stringList)
  println(checkListType(numList))      // List of Doubles
  println(checkListType(doubleList))   // List of Doubles
  println(checkListType(stringList))   // List of Doubles


//  def checkListType[T](list: List[T]): String = {
//    if (list.isInstanceOf[List[Double]]) {
//      "List of Doubles"
//    } else if (list.isInstanceOf[List[String]]) {
//      "List of Strings"
//    } else if (list.isInstanceOf[List[Int]]) {
//      "List of Ints"
//    } else {
//      "Unknown"
//    }
//  }
//
//  val numList2: List[Int] = List(1, 2, 3)
//  val doubleList2: List[Double] = List(1.0, 2.0, 3.0)
//  val stringList2: List[String] = List("1", "2", "3")
//
//  println(checkListType(numList2))      // Should print: "List of Ints"
//  println(checkListType(doubleList2))   // Should print: "List of Doubles"
//  println(checkListType(stringList2))   // Should print: "List of Strings"


 //Possible solution
// def checkListType[T](list: List[T]): String = {
//   if (list.isEmpty) "Empty List"
//   else list.head match {
//     case _: Double => "List of Doubles"
//     case _: String => "List of Strings"
//     case _: Int => "List of Ints"
//     case _ => "Unknown"
//   }
// }


 }







