/** package Week2.Thurs.Burger

//we want to have parameters with traits it has to go on the body
//A tarit within another trait or extend? April would wrap this in an object, an object of sauces. Then we could do trait ketchup extends sauces, trait mayo extends sauces

//we aew going to keep them seperate like with thriller

trait Sauces {

def whereAmI: String = "I am in sauces"

}

trait ketchup extends Sauces {
//you could add an override here like spicy mayo, spicy ketchup. The default is spicy
  override val spicy: Boolean = false

  //you can do all the same with pickles being true
}
trait Mayp extends Sauces
trait Relish extends Sauces
trait Mustard extends Sauces

*/




