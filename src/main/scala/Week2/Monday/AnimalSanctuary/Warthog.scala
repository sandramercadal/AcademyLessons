package Week2.Monday.AnimalSanctuary

//If I want Warthog to extend to Animal I need to use extend it technique



class Warthog (val name: String, val age: Int) extends Animal with Mammal {
  def talk: String = "I'm a Warthog"
  //def create something else/a new characteristic
}

class Worm extends Animal {
  override def hasEyes: Boolean = false
}

//NEXT STEPS:
//Make a new animal e.g owl and a hawk
//make sure you can extend (above will extend to bird)
//mammal - animal route is a trait
//then create Dragon Fly extends to Insect

//Fixed code by april
//class Warthog (override val name: String, override val age: Int) extends Animal (name, age) with Mammal
//Need to override the paramaters and then add name and age from the override into Animal/
//We didnt need to do this with Book becaise book has paramenter an readingFormal didnt so we had nothing to override and Book wasnt being extended readingForamt was

