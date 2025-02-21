/** package Week2.Tuesday.SandrasAnimalSanctuary

//Warthog extends Mammal
//I took out the vals here before name, age etc but kept it in for new ones for a Warthog

class Warthog (name: String, age: Int, val hasFourTusks: Boolean) {
  extends Animal (name, age)
}


//warthog extends Animal so Warthog cant extend Mammal (extend only once).

//We are going to create something from it so we make it a class.
//If lost - Command + hover turns things blue

// A TRAIT :  We are checking something against it but not creating something from it.


//Step 2
//Create the object and specify that a Warthog hasFourTusks:
object Warthog {

  def putItAllTogether (name: String, age: Int, hasFourTusks: Boolean) :
  Warthog =
    new Warthog (name, age, hasFourTusks)
}

*/