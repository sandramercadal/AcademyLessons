package Week2.Monday.Library


//BASE TRAIS
//trait Genre defines a method enjoy that returns the string "Enjoy your book!". This method provides a default behavior for any class or trait that extends Genre.
trait Genre {
  def enjoy: String = "Enjoy your book!"
}


//Trait Fantasy & Thriller extends Genre which means Fantasy & Thriller is inheriting from Genre.
//This means that Fantasy & Thriller has access to the enjoy method defined in Genre.
//override def enjoy: String = "Enjoy your fantasy book!" in the Fantasy trait is redefining the enjoy method to provide a more specific message for fantasy and thriller books. The override keyword indicates that you are replacing the behavior of enjoy from the Genre trait with a new implementation.
//An override has a blue symbol with an arrow to the left
trait Fantasy extends Genre {
  override def enjoy: String = "Enjoy your fantasy book!"
}
  //An override has a blue symbol with an arrow to the left

trait Thriller extends Genre {
  override def enjoy: String = "Enjoy your thriller book!"
}

//The override is necessary because you are providing a new version of an existing method defined in the parent trait (Genre). This allows you to customize the behavior of the enjoy method when it is called on instances of classes that extend Fantasy & Thriller. If you did not use override, the Scala compiler would give you an error because it expects you to explicitly state when you are changing the behavior of an inherited method.

// now go back to book.scala