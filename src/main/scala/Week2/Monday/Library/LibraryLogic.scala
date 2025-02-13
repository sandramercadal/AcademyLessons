

//Keep all our logic separatly to the class
//"extends App" so it runs :)
//Everytime we make a new instance of a class using the keyword new, we are making an object.

package Week2.Monday.Library
import Week2.Monday.family.{Adult, Forename, Surname}

  object LibraryLogic extends App {

    val harryPotter: Book = new Book("Harry Potter", Adult(new Forename("J.K"), new Surname("Rowling"))) with Fantasy with AudioBook with DigitalBook with PhysicalBook

    println(harryPotter.author.forename.name)
    println(harryPotter.title)
    println(harryPotter.read)
    println(harryPotter.enjoy)

    val goneGirl: Book = new Book("Gone Girl",Adult(new Forename("Gillian"), new Surname("Flynn"))) with Thriller
    println(goneGirl.enjoy)

  }
