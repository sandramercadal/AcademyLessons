package Week2.Tuesday.SandrasAnimalSanctuary

class Insect (name: String,
              age: Int,
              val wingSpan: WingSpan) //WingSpan from the case class instead of double
  extends Animal (name, age) {
  //Insect overrides aboutAnimal from Animal


  override def aboutAnimal(): String = {
    super.aboutAnimal () + s" I am an Insect with a wingspan of $wingSpan cm. Nice to meet you!!"
  }
}

//An instance of an Insect (object) - use "new" keyword
object Insect {

  def createAnimal (name: String,
                    age: Int,
                    wingSpan: WingSpan) : //not double
  Insect = {
    new Insect(name, age, wingSpan)
  }
}




