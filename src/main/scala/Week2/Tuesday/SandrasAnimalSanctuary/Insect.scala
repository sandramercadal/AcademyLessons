package Week2.Tuesday.SandrasAnimalSanctuary

class Insect (name: String, age: Int, val wingSpan: Double) extends Animal(name, age) {
  //Insect overides aboutAnimal from Animal


  override def aboutAnimal(): String = {
    super.aboutAnimal ()+ s" I am an Insect, and I have a wingspan of $wingSpan meters. Nice to meet you!!"}
}

//An instance of an Insect (object) - use "new" keyword
object Insect1 {

  def createAnimal (name: String, age: Int, wingSpan: Double) :
  Insect = new Insect(name, age, wingSpan)
}




