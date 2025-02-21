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

object CountryMPV extends App {

  //my method is: def getCapital and use this to call the println
  def getCapital(country: String): String = {

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





}



