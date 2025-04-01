package Week2.Tuesday.SandrasAnimalSanctuary

//Use the extends keyword to extend a trait.
trait AbleToFly {
  def canFly: Boolean

  def fly(): String = if (canFly) "I can fly! 🪽✈️" else "I can't fly🫤 "
}




