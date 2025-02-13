package Week2.Tuesday.SandrasAnimalSanctuary


//Here Mammal extends from the Animal class and is given further properties of BlueWhaleIsBiggestMammal, legColour & isNotWarmBlooded
//Step 1 class Mammal with val's9
class Mammal (name: String, age: Int,  val hasTinyEars: Boolean,  val colourOfFur: String) extends Animal (name, age) {

//Step 3
  //A lower class of Mammal, a sublass
  //Override here
  //Mammal overrides aboutAnimal from Animal



  //I want to say something using my val hasTinyEars and my colourOfFur
  //() empty so it can accept the properties
override def aboutAnimal(): String = {
  super.aboutAnimal ()+ s" I am an animal, and I have $colourOfFur fur"}
}


//Step 2
 object Mammal {

def putItAllTogether (name: String, age: Int,  hasTinyEars: Boolean,  colourOfFur: String) :
Mammal =
  new Mammal(name, age, hasTinyEars, colourOfFur)
 }




