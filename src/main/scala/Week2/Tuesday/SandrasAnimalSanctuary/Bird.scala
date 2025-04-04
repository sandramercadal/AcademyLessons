package Week2.Tuesday.SandrasAnimalSanctuary

//Bird inherits name and age from Animal and has the extras of can fly and colourOfFeather. It can extend into BirdsTraits.
//BirdTraits has TRAITS
//Traits are something lots of things can have e.g. insect and bird can both fly also species


class Bird (name: String,  //regular constructor parameter
            age: Int,    //regular constructor parameter
            val hasWings: Boolean, //constructor parameter with val (creates public, immutable field)
            val beakColour: String) //constructor parameter with val becomes a class property that persist after object creation
  extends Animal(name, age) with AbleToFly {
  //could extend further with BirdTraits - Think about this later!

  //override def canFly: Boolean = false
  override def canFly: Boolean = hasWings

  //call super.aboutAnimal () to first call the parents class methods
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







