package Week2.Tuesday.SandrasAnimalSanctuary

//Bat extends Animal.
//Bat cant extend Mammal.

//Carry over the logic from Animal and add in the new ones for Bat - isNocturnal & hasLongEars
class Bat(name: String, age: Int, val isNocturnal: Boolean, hasLongEars: Boolean, colourOfFur: String)
  extends Mammal (name, age, hasLongEars, colourOfFur) {

  def aboutBat(): String = s"Hello!! I am a Bat, I have $hasLongEars. Nice to meet you!!" //will print the val parameters
}



//Step 2
//Create the object and specify that an Owl is nocturnal:
object Bat1 {

  def createAnimal(name: String, age: Int, isNocturnal: Boolean, hasLongEars: Boolean, colourOfFur: String):
  Bat = {
    new Bat(name, age, isNocturnal, hasLongEars, colourOfFur)
  }
}
