package Week2.Tuesday.SandrasAnimalSanctuary

//Warthog extends Mammal
//I took out the vals here before name, age etc but kept it in for new ones for a Warthog

class Warthog(name: String, age: Int, hasLongEars: Boolean, colourOfFur: String, val hasFourTusks: Boolean)
  extends Mammal (name, age, hasLongEars, colourOfFur) {



  override def aboutAnimal(): String = {
    super.aboutAnimal()+ s"I'm a warthog. Do I have Four tusks? Yes it's $hasFourTusks!"
  }
}


//Create the new object of Warthog:
object Warthog {

  def createAnimal(name: String, age: Int, hasLongEars: Boolean, colourOfFur: String, hasFourTusks: Boolean):
  Warthog =
    new Warthog(name, age, hasLongEars, colourOfFur,hasFourTusks)
}

