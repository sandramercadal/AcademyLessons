/** package Week2.Thurs.Burger

//we want to have parameters with traits it has to go on the body
//A tarit within another trait or extend? April would wrap this in an object, an object of sauces.
 Then we could do trait ketchup extends sauces, trait mayo extends sauces
//we are going to keep them separate like with thriller

//CODEALONG PAUSE DAY
trait Sauces {

def whereAmI: String = "I am in sauces"

}

trait ketchup extends Sauces {
//you could add an override here like spicy mayo, spicy ketchup. The default is spicy
  val spicy: Boolean

  //you can do all the same with pickles being true
}
trait Mayo extends Sauces{
val garlic: Boolean = false
}
trait Relish extends Sauces
trait Mustard extends Sauces

*/




