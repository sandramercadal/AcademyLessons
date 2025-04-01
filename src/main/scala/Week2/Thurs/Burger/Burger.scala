/**

//Start to Build you Burger. Start with a veggie burger:

abstract class Burger(val veggieBurger: String, val typeOfBun: Burger.BunType) {
  def typeOfBurger: String //abstract method
  val description: String = s"This burger is a $veggieburger."
}
*/


package Week2.Thurs.Burger
abstract class Burger(
                       val doublePatty: Boolean,
                       val bunType: Burger.BunType, //1 choice
                       val salad: List[Burger.Salad], //can choose many. //salad: List [Burger.Salad] is nested type
                       val sauce: List[Burger.Sauce], //can choose many
                       val cheese: Burger.Cheese //1 choice
                     ) {
  //def makeItAMeal: Boolean // TODO: THINK ABOUT THIS LATER
  //If else statement see the code along from pause day on Teams
}

object Burger {

  sealed trait BunType  //Make some bun types

  case object SeededBun extends BunType

  case object Sesame extends BunType

  case object GlutenFree extends BunType

  case object Wholegrain extends BunType


  sealed trait Salad  //Make some salad types

  case object Lettuce extends Salad

  case object Tomato extends Salad

  case object Onions extends Salad

  case object NoSalad extends Salad //want to make sure they can choose nothing as we have it as a parameter to make a burger so they must choose something. (There is a better way, we will look at this in week 3.)


  sealed trait Sauce  //Make some sauce types

  case object Ketchup extends Sauce

  case object Mayo extends Sauce

  case object HotSauce extends Sauce

  case object NoSauce extends Sauce


  sealed trait Cheese  //Make some cheese types

  case object StandardCheese extends Cheese

  case object ExtraCheese extends Cheese

  case object NoCheese extends Cheese

}