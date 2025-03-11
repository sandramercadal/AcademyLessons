package Week2.Tuesday.SandrasAnimalSanctuary

//Ladybird extends Insect
//I took out the vals here before name, age etc but kept it in for new ones for Ladybird

class Ladybird(name: String, age: Int, val hasSpots: Int)
  extends Insect (name, age, hasSpots) {
  def aboutLadybird(): String = s"Hello I'm a Ladybug. I have $hasSpots spots!" //will print the val parameters
}


//Create the new object of ladybird:
object Ladybird1 {

  def createAnimal(name: String, age: Int, hasSpots: Int):
  Ladybird = {
    new Ladybird(name, age, hasSpots)
  }
}

