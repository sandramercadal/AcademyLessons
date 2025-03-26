package Week2.Tuesday.SandrasAnimalSanctuary

//Ladybird extends Insect
class Ladybird(
                name: String,
                age: Int,
                wingSpan: Double,
                val hasSpots: Int)
  extends Insect (name, age, wingSpan)  {


  override def aboutAnimal(): String = {
    super.aboutAnimal()+ s"Hello I'm a Ladybug. I have $hasSpots spots!"
  } //will print the val parameters
}


//Create the new object of ladybird:
object Ladybird {

  def createAnimal(name: String, age: Int, wingSpan: Double, hasSpots: Int):
  Ladybird = {
    new Ladybird(name, age, wingSpan, hasSpots)
  }
}

