

package Week2.Monday.Library

import Week2.Monday.family.Adult //using my adult from family that I previously built

class Book(val title: String, val author:Adult) extends ReadingFormat with Genre {
  def read: String = "Enjoy reading!"
}
object Book {
  def apply(title:String, author:Adult): Book = new Book(title, author)
}


/**


//Let's create a class & include Val so it can be accessible

//import anything we are using that ....

//This has been extended now to include the ReadingFormat within class

//Now Genre needs to be a trait = ass "with Genre". Create a new scala class of genre for this

//Object of Book is the Companion : def apply (title: String, author: Adult): Book = new Book (title, author)
within the curly brackets

*/