package Week2.Tuesday.SandrasAnimalSanctuary

//THIS IS MY CLASS. I never want to make a new animal so it can be a class (blueprint).
//Class is a combination of things. A Mammal is also an animal!
//Everything an animal has is also what a Monkey and Warthog and Owl have....

class Animal(val name: String, val age: Int) {

  def aboutAnimal(): String = s"Hello!! I am an animal, I'm $name and I'm $age years old. Nice to meet you!!"
}



//Now create your COMPANION OBJECT, syntax is "object Animal" plus function
//Serves as a factory for creating instances of that class.
//"new" is used to create a new object of a class.
//We can access the private methods of class Animal now
object Animal {
  def createAnimal(name: String, age: Int): Animal = {
    new Animal(name, age)
  }
}

//val Rufus = Animal.createAnimal("Rufus", 4)
//println(Rufus.aboutAnimal())