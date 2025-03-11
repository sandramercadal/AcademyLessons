package Week3.Thurs

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
  def getCapital(country: String): String = { //takes a single parameter, country & will return a String representing the capital of the specified country.

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

  //Q3a) a PERSON case class requires fields in the table.
  //Write a method called createPerson which returns a type Person.
  // PERSON method accepts an InputPerson case class.
  // InputPerson case class will contain Given at inout = true method which calculaes the missing fields and returns a Person.
  // Only some of the table data is given at input. Given at input = true.

  case class Person(fullName: String, dob: String, occupation: String,
                    lastCountryLivedIn: String, age: Int, starSign: String, ageAtDeath: Int)

  //TBC     case class inputAboutPerson ()

  //TBC       def createPerson

  //INPUT about a PERSON case class holds input data
  // PERSON case class gives the output
  // CREATEPERSON method responsible for taking an INPUT about a PERSON instance & calculating any missing values like age
  //and returning a fully populated PERSON instance
  //Also need a function to get the gae based on  the DOB.


  //b) HOROSCOPE - Create a method called horoscope. This method should accept a LocalDate
  // and return a tuple of the star sign and their horoscope. Use pattern matching in your method.
  //Q) Would be able to import this in Scala? import java.time.LocalDate

  import java.time.LocalDate //LocalDate class represents a date without a time-zone in the ISO-8601 calendar system.

  def horoscope(date: LocalDate): (String, String) = { //Local date takes in date and returns a tuple of 2 strings
    val day = date.getDayOfMonth //take day and Month from LocalDate
    val month = date.getMonthValue

    val horoscopeResult = (month, day) match {

      // Aquarius (Jan 20 - Feb 18)
      case (1, d) if d >= 20 || (month == 2 && d <= 18) => ("Aquarius", "You will shine bright today")
      // Pisces (Feb 19 - Mar 20)
      case (2, d) if d >= 19 || (month == 3 && d <= 20) => ("Pisces", "You will prosper today")
      // Aries (Mar 21 - Apr 19)
      case (3, d) if d >= 21 || (month == 4 && d <= 19) => ("Aries", "You will be limitless today")
      // Taurus (Apr 20 - May 20)
      case (4, d) if d >= 20 || (month == 5 && d <= 20) => ("Taurus", "You will grow today")
      // Gemini (May 21 - Jun 20)
      case (5, d) if d >= 21 || (month == 6 && d <= 20) => ("Gemini", "You will find fun today")
      // Cancer (Jun 21 - Jul 22)
      case (6, d) if d >= 21 || (month == 7 && d <= 22) => ("Cancer", "You will find fortune today")
      // Leo (Jul 23 - Aug 22)
      case (7, d) if d >= 23 || (month == 8 && d <= 22) => ("Leo", "You will rest and recover today")
      // Virgo (Aug 23 - Sep 22)
      case (8, d) if d >= 23 || (month == 9 && d <= 22) => ("Virgo", "You will cook something new today")
      // Libra (Sep 23 - Oct 22)
      case (9, d) if d >= 23 || (month == 10 && d <= 22) => ("Libra", "You will laugh today")
      // Scorpio (Oct 23 - Nov 22)
      case (10, d) if d >= 23 || (month == 11 && d <= 22) => ("Scorpio", "You will sparkle today")
      // Sagittarius (Nov 23 - Dec 21)
      case (11, d) if d >= 23 || (month == 12 && d <= 21) => ("Sagittarius", "You will see an old friend today")
      // Capricorn (Dec 22 - Jan 19)
      case (12, d) if d >= 22 || (month == 1 && d <= 19) => ("Capricorn", "You will find fame today")
      // Default: no horoscope found
      case _ => ("No horoscope found", "Sorry!")


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

    }
    horoscopeResult
  }

  val date = LocalDate.of(2019, 3, 29)
  val horoscopeResult = horoscope(date)

  println(s"Your star sign is: ${horoscopeResult._1}. Today's horoscope: ${horoscopeResult._2}")
  //Your star sign is: Aries. Today's horoscope: You will be limitless today

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

}



