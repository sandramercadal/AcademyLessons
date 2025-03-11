package Week2.Tuesday.SandrasAnimalSanctuary


//Here Mammal extends from the Animal class and is given further properties of val hasTinyEyes & val colourOfFur
class Mammal (name: String, age: Int,  val hasLongEars: Boolean,  val colourOfFur: String) extends Animal (name, age) {
  //Mammal overrides aboutAnimal from Animal



  //I want to say something using my val hasTinyEars and my colourOfFur
  //() empty so it can accept the properties
  //Override keyword is used to modify or extend the behavior of a method that is inherited from a parent class
override def aboutAnimal(): String = {
  super.aboutAnimal ()+ s" I am an animal, and I have $colourOfFur fur"}
}


//An instance of a Mammal (object) - use "new" keyword
 object Mammal1 {

def createAnimal (name: String, age: Int, hasLongEars: Boolean,  colourOfFur: String) :
Mammal = new Mammal(name, age, hasLongEars, colourOfFur)
 }




