

package Week2.Monday.Library

import Week2.Monday.family.Adult //using my adult from family that I previously built

//Val properties are immutable
//Book is inheriting from 2 traits
class Book(
            val title: String,
            val author:Adult
          ) extends ReadingFormat with Genre {

  def read: String = "Enjoy reading!"
}
//def read is a simple string message when called

//Companion obj
//apply method to create new instances of books using (title, Author). No need for new here.
object Book {
  def apply(title:String, author:Adult): Book = new Book(title, author)

}


/**

 //import anything we are using eg an adult or a child we created earlier

//Let's create a class & include val so it can be accessible
 //This has been extended now to include the ReadingFormat within class

//Now Genre needs to be a trait = see "with Genre". Create a new scala class of genre for this

//Object Book is the Companion : def apply (title: String, author: Adult): Book = new Book (title, author)
within the curly brackets

*/