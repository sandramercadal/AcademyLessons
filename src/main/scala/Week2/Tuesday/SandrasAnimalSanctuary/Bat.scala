package Week2.Tuesday.SandrasAnimalSanctuary

//Bat extends Mammal.

//Carry over the logic from Animal and add in the new ones for Bat - isNocturnal & hasLongEars
class Bat(name: String, age: Int, hasLongEars: Boolean, colourOfFur: String, val isNocturnal: Boolean)
  extends Mammal (name, age, hasLongEars, colourOfFur) with AbleToFly {

  //user override instead of just def to extend via polymorphism
  override def aboutAnimal(): String = {
    super.aboutAnimal()+ s" I'm a Bat, it's $isNocturnal I'm nocturnal. " + fly() + "Nice to meet you!!"

  } //will print the val parameters

  //add the abstract method from AbleToFly trait. Make it override
  override def canFly: Boolean = true
}


//Step 2
//Create the object and specify that an Owl is nocturnal:
object Bat {

  def createAnimal(name: String, age: Int, hasLongEars: Boolean, colourOfFur: String, isNocturnal: Boolean):
  Bat =
    new Bat(name, age, hasLongEars, colourOfFur, isNocturnal)
}

// override is a keyword used when a subclass defines a method that
// already exists in its superclass. It signifies that you are intentionally
// replacing the implementation of the method from the parent class with a new
// version in the child class.