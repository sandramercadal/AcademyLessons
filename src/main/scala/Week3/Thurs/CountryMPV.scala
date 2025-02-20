package Week3.Thurs

//Q1
object CountryMPV extends App {

  //my method is: def getCapital
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
  println(getCapital("Italy")) // returns Rome

  //Q2
  //Sealed case objects
  sealed trait Animal

  case object Pig extends Animal

  case object Sheep extends Animal

  case object Goat extends Animal

  case object Rabbit extends Animal

  case object Donkey extends Animal

  case object Cow extends Animal

 //I'm calling my method aboutAnimal
 //Use singular not plural e.g Animal not Animals
  def aboutAnimal(animal: Animal): String = animal match {
    case Pig => "I am a pink pig"
    case Sheep => "I am a cute sheep"
    case Goat => "I am a clever goat"
    case Rabbit => "I am a happy bunny"
    case Donkey => "I am a big donkey"
    case Cow => "I am a small cow"
  }
  println (aboutAnimal (Rabbit)) //I am a happy bunny
  println (aboutAnimal (Cow)) //I am a small cow
  println (aboutAnimal (Goat)) //I am a clever goat

//Q3a)





}



