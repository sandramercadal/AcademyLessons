package Week2.Tuesday.SandrasAnimalSanctuary

//Warthog extends Mammal
//I took out the vals here before name, age etc but kept it in for new ones for a Warthog

class Warthog(name: String, age: Int, val hasFourTusks: Boolean)
  extends Mammal (name, age, hasLongEars, colourOfFur) {
  def aboutWarthog(): String = s"Hello I am a warthog. Do I have Four tusks?$hasFourTusks!" //will print the val parameters
}


//Create the new object of Watrhog:
object Warthog1 {

  def createAnimal(name: String, age: Int, hasFourTusks: Boolean):
  Warthog = new Warthog(name, age, hasFourTusks)
}

