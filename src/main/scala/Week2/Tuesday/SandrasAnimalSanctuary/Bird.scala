package Week2.Tuesday.SandrasAnimalSanctuary

//Bird inherits name and age from Animal and has the extras of can fly and colourOfFeather. It can extend into BirdsTraits.
//BirdTraits has TRAITS
//Traits are something lots of things can have e.g. insect and bird can both fly also species


class Bird (name: String,  //regular constructor parameter
            age: Int,    //regular constructor parameter
            val hasWings: HasWings, //updated "HasWings" to match Robin case class
            val featherColour: String) //constructor parameter with val becomes a class property that persist after object creation
  extends Animal(name, age) with AbleToFly {
  //could extend further with BirdTraits - Think about this later!

  //override def canFly: Boolean = false
  override def canFly: Boolean = hasWings.value //Use value to access the boolean value

  //call super.aboutAnimal () to first call the parents class methods
  override def aboutAnimal(): String = {
    super.aboutAnimal() + s"I'm a bird, and the colour of my beak is $featherColour!"
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
                     hasWings: HasWings,
                     featherColour: String,
                    canFly: Boolean = false) :
  Bird = {
    new Bird(name, age, hasWings, featherColour)
  }
}







