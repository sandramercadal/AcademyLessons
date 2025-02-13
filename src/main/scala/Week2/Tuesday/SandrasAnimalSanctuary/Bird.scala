package Week2.Tuesday.SandrasAnimalSanctuary

//Bird inherits name and age from Animal and has the extras of can fly and colourOfFeather. It can extend into BirdsTraits.
//BirdTraits has TRAITS

//Traits are something lots of things can have e.g. insect and bird can both fly also species
//Bird extends Animal and adds canFly and ColourOfFeathers plus it extends to BirdTraits (traits)

class Bird (name: String, age: Int, canFly: Boolean, colourOfFeathers: String)
  extends Animal(name, age) with BirdTraits {


  //Need to describe a bird here and add canFly and colourOfFeathers using override
  override val canFly: Boolean = true


  override def aboutAnimal(): String = {
    super.aboutAnimal() + s"I am a bird, and it is $canFly that I like to fly and the colour of my feathers are $colourOfFeathers!"
  }

  //TO DO
  //Create an object for Robins and one for birds in general

  object Robins extends App {
    val infoOnRobins = new
    override val xyz: Boolean = false
    override val xyz: Boolean = true
  }

  //Cuckoo facts
  override def CuckooLikeToMakeABurrow: String = ???
  override def CuckoosInEngland: String = ???

  //Robin facts
  override def RobinsInCirculation: String = ???
  override def lengthOfARobin: Int = ???



}


object Bird {

  def putItAllTogether(name: String, age: Int, canFly: Boolean, colourOfFeathers: String):
  Bird =
    new Bird(name, age, canFly, colourOfFeathers)
}



