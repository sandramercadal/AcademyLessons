package Week2.Tuesday.SandrasAnimalSanctuary

//Bird inherits name and age from Animal and has the extras of can fly and colourOfFeather. It can extend into BirdsTraits.
//BirdTraits has TRAITS
//Traits are something lots of things can have e.g. insect and bird can both fly also species


class Bird (name: String,
            age: Int,
            val hasWings: Boolean,
            val beakColour: String)
  extends Animal(name, age) with AbleToFly {
  //could extend further with BirdTraits - Think about this later!

  //override def canFly: Boolean = false
  override def canFly: Boolean = hasWings

  override def aboutAnimal(): String = {
    super.aboutAnimal() + s"I'm a bird, and the colour of my feathers are $beakColour!"
  }
}
  //Need to describe a bird here and add trait canFly
  //override vals from the trait "flies"
  //Boolean check:
  //override def canFly: Boolean = false

//  //Descriptive to show if someone can or cannot fly
// override def fly () : String = {
//   if (canFly) s"$name the bird can fly"
//   else s" $name the bird cannot fly"
// }



object Bird {

  def createAnimal (
                     name: String,
                     age: Int,
                     hasWings: Boolean,
                     beakColour: String,
                    canFly: Boolean = false) :
  Bird = {
    new Bird(name, age, hasWings, beakColour)
  }
}


//  //TO DO
//  //Create an object for Robins and one for birds in general

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
//}




