

//Keep all our logic separatly to the class
//"extends App" so it runs :)
//Everytime we make a new instance of a class using the keyword new, we are making an object.

package Week2.Monday.Library
import Week2.Monday.family.{Adult, Forename, Surname}

  object LibraryLogic extends App {

    //CREATE SOME BOOKS
    val harryPotter: Book = new Book("Harry Potter", Adult(new Forename("J.K"), new Surname("Rowling"))) with Fantasy with AudioBook with DigitalBook with PhysicalBook
//it has characteristics of a fantasy book and can be in audio, digital, and physical formats.

    val goneGirl: Book = new Book("Gone Girl",Adult(new Forename("Gillian"), new Surname("Flynn"))) with Thriller

    println(harryPotter.author.forename.name) //J.K
    println(harryPotter.title) //Harry Potter
    println(harryPotter.read) //Enjoy reading!  see read
    println(harryPotter.enjoy) //Enjoy your fantasy book!  see enjoy
    println(goneGirl.enjoy) //Enjoy your thriller book!  see enjoy





  }
