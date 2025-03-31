package Week2.Tuesday.SandrasAnimalSanctuary

//Bird inherits name and age from Animal and has the extras of can fly and colourOfFeather. It can extend into BirdsTraits.
//BirdTraits has TRAITS

//Traits are something lots of things can have e.g. insect and bird can both fly also species
//Bird extends Animal and adds canFly and ColourOfFeathers plus it extends to BirdTraits (traits)

class Robin (name: String,
             age: Int,
             hasWings: Boolean,
             colourOfFeathers: String,
             val hasRedBreast: Boolean)
  extends Bird (name, age, hasWings, colourOfFeathers)  {


  //example override val (something new)
  //canFly is already implemented in the parent Bird class
  //override def not val to match the trait definition
override def canFly: Boolean = true

  override def aboutAnimal(): String = {
    super.aboutAnimal()+
      s"I'm actually a Robin, and I have a ${colourOfFeathers.toLowerCase} feathers." + (if (hasWings) "I can fly 🪰"  else "I can't fly")


      }
  }


object Robin {

  def createAnimal (
                     name: String,
                     age: Int,
                     hasWings: Boolean,
                     colourOfFeathers: String,
                     hasRedBreast: Boolean) :
  Robin =
    new Robin (name, age, hasWings, colourOfFeathers, hasRedBreast)
}

//  //TO DO
//  //Create an object for Robins and one for birds in general
//
//  object Robins extends App {
//    val infoOnRobins = new
//    override val xyz: Boolean = false
//    override val xyz: Boolean = true
//  }
//
//  //Cuckoo facts
//  override def CuckooLikeToMakeABurrow: String = ???
//  override def CuckoosInEngland: String = ???
//
//  //Robin facts
//  override def RobinsInCirculation: String = ???
//  override def lengthOfARobin: Int = ???
//
//
//
//}




