/** val veggieBurger = new VeggieBurger (true, "glutenfree") with Ketchup with Mayo {
    //object of Burger, I have a new burger and it is a veggie burger
println (VeggieBurger.whereAmI)//Coming from Burger
*/


//APRILS CODE
package Week2.Thurs.Burger


import Week2.Thurs.Burger.Burger._
  object BurgerLogic extends App {


    val veggieBurger = VeggieBurger(
      doublePatty = true,
      bunType = SeededBun,
      salad = List(Lettuce),
      sauce = List(Mayo),
      cheese = ExtraCheese
    )
//In codealong instead of above we had val veggieBurger1 = new VeggieBurger (true, Burger.Glutenfree) with Ketchup with Mayo {
//override val spicy: Boolean = false
//override val garlic: Boolean = true
    //println(veggieBurger1.whereAmI)
    //println(veggieBurger1.spicy)
    //println(veggieBurger1.typeOfBun)

    println("\n---Veggie---")
    println(veggieBurger.doublePatty)
    println(veggieBurger.bunType)
    println(veggieBurger.salad)
    println(veggieBurger.sauce)
    println(veggieBurger.cheese)

    val chickenBurger = ChickenBurger(
      doublePatty = true,
      bunType = SeededBun,
      salad = List(Lettuce, Tomato, Onions),
      sauce = List(Ketchup, Mayo),
      cheese = NoCheese
    )
    println("\n---Chicken---")
    println(chickenBurger.salad)
    println(chickenBurger.grilledOrFried(ChickenBurger.Grilled))
    println(chickenBurger.grilledOrFried(ChickenBurger.Fried))

//    val beefBurger = BeefBurger(
//      doublePatty = false,
//      bunType = SeededBun,
//      salad = List(Lettuce, Tomato),
//      sauce = List(HotSauce),
//      cheese = ExtraCheese,
//      //howDoYouWantItCooked = Medium
//    )
//    println("\n---Beef---")
//    //println(beefBurger.howDoYouWantItCooked)

  }
 /** Alternative code
  *
  * object BurgerLogic extends App {
  * val veggieBurger1 = new VeggieBurger(true, Burger.SeededBun) with Ketchup with Mayo {
  * override val spicy: Boolean = false
  * }
  *
  * println(veggieBurger1.spicy)
  * println(veggieBurger1.bunType)
  * println(veggieBurger1.garlic)
  * }*/
