package Week2.Tuesday.SandrasAnimalSanctuary

//Animal is my class. I never want to make a new animal so it can be a class (blueprint).
//Class is a combination of things. A Mammal is also an animal!
//Everything an animal has is also what a Monkey and Warthog have.

class Animal (val name: String, val age: Int) {

//Similar to TimeToCharge for Electric in Vehicle case study
  def aboutAnimal (): String = s"The animal is called $name and is $age years old!"

}


//Now create your COMPANION OBJECT "object Animal {"
//We can access the companion classes private methods
//Notice I have used the word "new" so this is a class?

  object Animal {
    def apply (name: String, age: Int): Animal = new Animal (name, age)
  }
