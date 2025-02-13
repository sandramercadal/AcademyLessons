package Week2.Tuesday.SandrasAnimalSanctuary

//THIS IS MY CLASS. I never want to make a new animal so it can be a class (blueprint).
//Class is a combination of things. A Mammal is also an animal!
//Everything an animal has is also what a Monkey and Warthog and Owl have....

class Animal (val name: String, val age: Int) {

  def aboutAnimal (): String = s"I am an animal, my name is $name and I am $age years old!"  //will print the name and age parameters

}

//Now create your COMPANION OBJECT, syntax is "object Animal" { enter def here }
//We can access the companion classes private methods
//Notice I have used the word "new" so this is a class?

  object Animal {
    def putItAllTogether (name: String, age: Int): Animal = new Animal (name, age)
  }

