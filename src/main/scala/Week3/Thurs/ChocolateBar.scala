
//O P T I O N
//can this chocbar have a filling or not??

//Make a chocolate bar case class with an optional filling.
//Write a method to return the filling of the chocolate bar, which if empty, will give a default.
//Demonstrate this working by making some chocolate objects.
//getOrElse



package Week3.Thurs

object ChocolateBar extends App {
  case class ChocolateBar(filling: Option[String]) //Option[Sting] says it might have a filling (eg nuts) or
  //might be plain so have no filling

  def getFilling(chocolateBar: ChocolateBar): String =
    chocolateBar.filling.getOrElse("just chocolate") //There is a special magic trick
  // called "getFilling" that checks if the chocolate has a filling. If it does, it tells you what it is. If it doesn’t, it just says "just chocolate".
//If there isn't one (when it is None), it returns the string "just chocolate".

  object Snickers extends ChocolateBar(Some("nuts")) //Option(String)

  object DairyMilk extends ChocolateBar(None) //Option only no string

  println(getFilling(Snickers)) //nuts
  println(getFilling(DairyMilk)) //just chocolate

}
