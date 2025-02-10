package Week2.Monday.Library

class Genre {
 def enjoy: String = "enjoy your book!"


}

//Fantasy & Thriller can access this method called enjoy
trait Fantasy extends Genre {
  override def enjoy: String = "enjoy your fantasy book!"
  //An override has a blue symbol with an arrow to the left
}

trait Thriller extends Genre{
  override def enjoy: String = "enjoy your thriller book!"
  //An override has a blue symbol with an arrow to the left
}

//now go back to book.scala