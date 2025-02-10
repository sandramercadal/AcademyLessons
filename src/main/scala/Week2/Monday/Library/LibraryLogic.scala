package Week2.Monday.Library



/**package Wk2.family.Library
//to make it run add 'extends App' to class LibraryLogic

import Week2.Mon.Family.{Adult, Forename, Surname}

class LibraryLogic extends App {

  val harryPotter: Book = new Book("Harry Potter", Adult(new Forename("J.K"), new Surname("Rowling")))
    with Fantasy with AudioBook with DigitalBook with PhysicalBook
//with is adding in the traits

  println (harryPotter.author) //author is an adult which is a class so will just giev you the memory space
  println (harryPotter.forename.name)
  println (harryPotter.title)
  println (harryPotter.read)
  println (harryPotter.enjoy)


}

//A new book
val goneGirl: Book = new Book ("Gone Girl", Adult(new Forename("Gillian"), new Surname("Flynn")))
println (goneGirl.enjoy) //defaulted it back to enjoy youir book as I didnt give it override to say enjoy your fantasy book or thriller book


//Everything is written in classes


//MPV what is accessible, where, import stuff, get comfortable
*/