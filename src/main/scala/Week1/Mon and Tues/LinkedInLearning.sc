

def lightSwitch(switchOn: Boolean): String = if (switchOn) "light on!" else "light off!"
println(lightSwitch(true))//light on!
println(lightSwitch(switchOn=false))//light off!

/**Chapter 2 challenge --Q1 WRite a function called product which takes 2 parameters of type Int & multiplies them together  **/
def product (number1: Int, number2: Int) : Int = number1 * number2
println(product(number1=2, number2=2)) // 2* 2 = 4
println(product(2,2)) // 2* 2 = 4

  /**Chapter 2 challenge --Q2 Write a function called greeting which takes a parameter called Name, of type string and outputs a string, the parameter should have a default value so that an appropriate string is outputted if the function is called without a parameter
   */
def greeting (name: String = "name") : String = s"hi $name!"
println(greeting("sandra")) //hi sandra!
println(greeting()) //hi name!

/**FROM - I can have 15 ppl at home for a party.
 * I can have 40 with a tent at home
 */
//val guests: Int = ??
//val partyAtHome: Boolean =
//  if (guests < 15) true
//  else false
/**To**/
def partyAtHome(guests:Int): Boolean =
  if (guests > 15) true else false
println(partyAtHome(10)) //false as 10 guests are less than 15 which is the max!

//adding a tent
def partyAtHomeAgain(guests:Int, tentAvailable: Boolean): Boolean =
  if (guests <= 15) true //T if guests are up to 15 with no tent
  else if (tentAvailable && guests < 41) true
  else false
println(partyAtHomeAgain(40, true)) //true
println(partyAtHomeAgain(45, true)) //F
println(partyAtHomeAgain(10, false)) //T


/**Challenge 2 Pattern Match **/
def competition (result: Int) : String = {
  if (result == 1) "gold"
  else if (result == 2) "silver"
  else if (result == 3) "bronze"
  else "well done!"
}
println(competition(1)) //gold

/** Now with Pattern matching */
def competition2 (result: Int) : String = {
  result match { //matching against an Int not a string
    case 1 => "You won gold"
    case 2 => "silver"
    case 3 => "bronze"
    case _ => "Well done!"
  }
}
println(competition2(1)) //You won gold
println(competition2(7)) //Well done!
println(competition2(3)) //bronze
