/** package Week2.Thurs.Burger

//Start to Build you Burger. Start with a veggie burger:

abstract class Burger(val veggieBurger: String, val typeOfBun: Burger.BunType) {
  def typeOfBurger: String //abstract method
  val description: String = s"This burger is a $veggieburger."
}



//Make some bun types
Object Burger {
  sealed trait BunType
  case object GlutenFree extends BunType
  case object Wholegrain extends BunType
}

*/