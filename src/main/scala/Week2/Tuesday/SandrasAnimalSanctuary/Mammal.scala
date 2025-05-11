package Week2.Tuesday.SandrasAnimalSanctuary


//Here Mammal extends from the Animal class and is given further properties of val hasLongEyes & val colourOfFur
class Mammal (
               name: String,
               age: Int,
               val hasLongEars: HasLongEars, //Not boolean as use case class to match Warthog
               val colourOfFur: String)
extends Animal (name, age)  {
  //Mammal overrides aboutAnimal from Animal

  //() empty so it can accept the properties
  //Override keyword is used to modify or extend the behavior of a method that is inherited from a parent class
override def aboutAnimal(): String = {
  super.aboutAnimal() + s" I am a mammal, and I have $colourOfFur fur"
}
}
//super refers to the superclass (or parent class) of the current class. you are accessing members (methods or fields) of the parent class from the subclass. This is particularly useful when you want to override a method but also want to include the behavior of that method from the superclass.

//An instance of a Mammal (object) - use "new" keyword
 object Mammal {

def createAnimal (name: String,
                  age: Int,
                  hasLongEars: HasLongEars,
                  colourOfFur: String) : Mammal =
  new Mammal(name, age, hasLongEars, colourOfFur)
 }




