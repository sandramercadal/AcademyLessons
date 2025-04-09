package Week2.Tuesday.SandrasAnimalSanctuary

//Warthog extends Mammal
//I took out the vals here before name, age etc but kept it in for new ones for a Warthog

case class HasLongEars (value: Boolean)
case class HasFourTusks (value: Boolean)

class Warthog(name: String,
              age: Int,
              hasLongEars: HasLongEars, //Not "boolean" as using case class now
              colourOfFur: String,
              val hasFourTusks: HasFourTusks) //Not : boolean as using case class
  extends Mammal (name, age, hasLongEars, colourOfFur) {



  override def aboutAnimal(): String = {
    super.aboutAnimal()+ s"I'm a warthog. Do I have Four tusks? Yes it's ${hasFourTusks.value}!"
  }
}


//Create the new object of Warthog:
object Warthog {

  def createAnimal(name: String,
                   age: Int,
                   hasLongEars: HasLongEars, //not double as have case class, same for hasFourTusks not an Int
                   colourOfFur: String,
                   hasFourTusks: HasFourTusks):
  Warthog =
    new Warthog(name, age, hasLongEars, colourOfFur,hasFourTusks)
}

