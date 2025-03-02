/** package Week3.Thurs
 *
 * object ChocolateBar extends App{
 *
 * //MVP 3a making a class from another class
 * //1a PM
 * //2 sealed trait
 * //b) go back to pizzas we just made in options
 * //c PM if i eneter Pig i want a fact about a pig
 * //3a  1 case class to return, another cass class inout Person
 * //call person case class and enter what parameter we want it to be eg val method
 * //age method
 * //start sign method & ageatDeath method
 *
 * //b) retun string and string in tuple
 * //tuple has 2 return types
 * //extesnion 1 add in the if's
 * //research what does this code do
 *
 * //1 2 & 3a
 *
 */


//case class choc
//TASK
package Week3.Thurs

object ChocolateBar extends App {
  case class ChocolateBar(filling: Option[String]) //Option[Sting] says it might have a filling (eg nuts) or
  //might be plain so have no filling

  def getFilling(chocolateBar: ChocolateBar): String =
    chocolateBar.filling.getOrElse("just chocolate") //There is a special magic trick
  // called "getFilling" that checks if the chocolate has a filling. If it does, it tells you what it is. If it doesn’t, it just says "just chocolate".


  object Snickers extends ChocolateBar(Some("nuts"))

  object DairyMilk extends ChocolateBar(None)

  println(getFilling(Snickers))
  println(getFilling(DairyMilk))


}
