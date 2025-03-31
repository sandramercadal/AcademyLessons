//MVP

/** Watermelon exercise:
 John from primary school maths is trying to buy as many watermelons as possible and we need to give him
 a reality check. John can reasonably carry 3 watermelons without a bag, and 5 with one bag.
1. Create a value to store a number of watermelons.
2. Use an if/else statement to print out appropriate messages based on the criteria above to tell John
  whether he:
  a) Doesn't need a bag
  b) Needs a bag
c) Can't carry them
Consider how you will handle invalid numbers.
 3. Use string interpolation to add to each message the number of watermelons John is trying to buy -
 which type of string interpolation is most appropriate here?
 4. Create a value to store a boolean that indicates whether John has a bag with him or not.
 5. Use an if statement and this boolean value to tell John whether he can or cannot by the desired
 number of watermelons in Task 1. Can this be done without using "else if"?
 6. The store puts their prices in a foreign currency, so the conversion rate to £ means one
 watermelon is £1.397. Calculate and use string interpolation to display the total cost of John's
 purchase to 2 decimal places - which type is most appropriate here?
*/


// MVP Task 1 - Create a value to store a number of watermelons.
val numWatermelons: Int = 4 // Change as necessary. Let's Try out 4 watermelons

// MVP Task 2 and Task 3
if (numWatermelons >0 && numWatermelons <= 3) {
  if (numWatermelons==1){
    println(s"John can carry $numWatermelons watermelon without a bag")
  }
  else println(s"John can carry $numWatermelons watermelons without a bag")
} else if (numWatermelons >=4 && numWatermelons <= 5) {
  println(s"John needs a bag to carry $numWatermelons watermelons")
} else {
  println(s"John cannot carry $numWatermelons watermelons")
}

// MVP Task 4 - Create a value to store a boolean that indicates whether John has a bag with him or not.
val hasBag: Boolean = false // Try out both true and false to make sure the if statement works as intended

// MVP Task 5
//Use an if statement and this boolean value to tell John whether he can or cannot buy the desired
//number of watermelons in Task 1. Can this be done without using "else if"?

//%.1f specifies that you want to format a floating-point number to one decimal place.
if (numWatermelons <= 3 || numWatermelons <= 5 && hasBag) {
  println(s"John can buy $numWatermelons watermelons")
} else {
  println(s"John cannot buy $numWatermelons watermelons")
}

// MVP Task 6
//The store puts their prices in a foreign currency, so the conversion rate to £ means one
//watermelon is £1.397. Calculate and use string interpolation to display the total cost of John's
//purchase to 2 decimal places - which type is most appropriate here?
//%2.2f is a formatting specifier that formats the resulting number as a floating-point number with 2 digits after the decimal point.
//The 2 before the . specifies the minimum width of the integer part of the number.
println(f"The total cost of the watermelons is £${numWatermelons * 1.397}%2.2f")


/** MY WATERMELON SKELETON
val watermelontotal: Int = 6
if (watermelontotal <= 6) {
  println (s"You have $watermelontotal watermelons, that means you can't carry that many only carry 5")
}
else if (watermelontotal >= 5) {
  println (s"You have $watermelontotal watermelons, you can carry a max of 5 in a bag")
}
else if (watermelontotal <= 3) {
  println (s"You have $watermelontotal watermelons, means you can carry that many John, without a bag")

} else{
  if (watermelontotal >=0)
    println (s"Please enter at least 1 watermelon")
}

*/


// Extension
// 1. Order of precedence can be found here: https://docs.scala-lang.org/tour/operators.html#:~:text=%5E%20has%20the%20highest%20precedence%20because,%3F%20%2C%20%7C%20%2C%20and%20less%20.
/**
 * (characters not shown below)
 *
 * * / %
 *
 * + -
 *
 * :
 *
 * < >
 *
 * = !
 *
 * &
 *
 * ^
 *
 * |
 *
 * (all letters, $, _)
 */
true || false && false // 2. true - & evaluated before | --> so, left with: true || false = true
(true || false) && false // 3. false - brackets (parentheses) are evaluated first --> so, left with: true && false
1 < 4 && 7 != 10 || 9 + 10 == 21 // 4. true -->
/**
 * Lets break this one down. Order would be:
 *
 * Arithmetic operators (+) have higher precedence.
 *
 * Comparison operators (<, !=, ==) come next.
 *
 * Logical AND (&&) has a lower precedence than comparison operators.
 *
 * Logical OR (||) has the lowest precedence.
 *
 * How would it evaluate:
 *
 * 9 + 10 == 21 -> 19 == 21 -> false -> (1 < 4 && 7 != 10 || false)
 *
 * 1 < 4 -> true -> (true && 7 != 10 || false)
 *
 * 7 != 10 -> true -> (true && true|| false)
 *
 * true && true -> true -> (true || false)
 *
 * true || false  →  true
 *
 * Final result = true
 */

// Research
//If statements always return values. This means we can assign values based on if statements.
  //How would we go about doing this, or where could we search to find out?
//Try out the example below:
  //1. Create two values that hold integers. Assign any integer you'd like to these values.
//2. Create a new value to hold a string and assign it "yes" if the first value is greater than the second,
//and "no" if the second value is greater.
//(Don’t overthink this!)

val value1: Int = 1
val value2: Int = 2

val value3: String = if (value1 < value2) {
  "yes"
} else {
  "no"
}

// could write this in single line notation
val value3: String = if (value1 < value2) "yes" else "no"



//MY EXTENSION
//In logical operators,
//Priority seems to be : ! before && or ||

true || false && false //true
//&& has higher priority than || so false && false is checked first  - giving the answer of false.
//&&  only gives true if both are the same e.g true && true.
// With true || false, you get true because only one of the two has to be true to give true.

((true || false) && false) //false
//The parentheses now take priority so what is inside is looked at first.
//true || false is looked at first, as there is at least one true it gives true.
//so as we are at true, the next step is true && false which gives false because
// at least one is false so it gives false (only when both are true is true returned).
//T/F	   T/F   Answer
//true	true	  true
//true	false	  false
//false	true	  false
//false	false	  false

//A real-world example:
//val 1 : User can access the system
//val 2 : User has been set up with an account

val canAccess = true
val hasAccount = false

val staffStatus = canAccess && hasAccount
println (staffStatus)
//This is because hasAccount is false
//Tried to use println and the variable which is similar to what I know from Javascript.

(1<4 && 7!=10 ||9+10==21) //TRUE

//etc

//The order of the symbols is very important here.


