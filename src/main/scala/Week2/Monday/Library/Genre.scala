package Week2.Monday.Library

trait Genre {
  def enjoy: String = "Enjoy your book!"
}

//Fantasy & Thriller can access this method called enjoy
trait Fantasy extends Genre {
  override def enjoy: String = "Enjoy your fantasy book!"
}
  //An override has a blue symbol with an arrow to the left

trait Thriller extends Genre {
  override def enjoy: String = "Enjoy your thriller book!"
}
//An override has a blue symbol with an arrow to the left


//Genre is a TRAIT
// now go back to book.scala