package Week2.Tuesday.SandrasAnimalSanctuary


//Here Mammal extends from the Animal class and is given further properties of val hasLongEyes & val colourOfFur
class Mammal (
               name: String,
               age: Int,
               val hasLongEars:
               Boolean,
               val colourOfFur: String)
extends Animal (name, age) with AbleToFly {
  //Mammal overrides aboutAnimal from Animal

  //() empty so it can accept the properties
  //Override keyword is used to modify or extend the behavior of a method that is inherited from a parent class
override def aboutAnimal(): String = {
  super.aboutAnimal() + s" I am a mammal, and I have $colourOfFur fur"
}

  override def canFly: Boolean = false
}


//An instance of a Mammal (object) - use "new" keyword
 object Mammal {

def createAnimal (name: String, age: Int, hasLongEars: Boolean,  colourOfFur: String) :
Mammal = new Mammal(name, age, hasLongEars, colourOfFur)
 }




