//MVP
//Watermelon exercise
//include .toLowerCase as applicable
val watermelontotal: Int = 6
if (watermelontotal <= 6) {
  s"You have $watermelontotal watermelons, that means you can't carry that many only carry 5"
}
else if (watermelontotal >= 5) {
  s"You have $watermelontotal watermelons, you can carry a max of 5 in a bag"
}
else if (watermelontotal <= 3) {
  s"You have $watermelontotal watermelons, means you can carry that many John, without a bag"

} else{
  if (watermelontotal >=0)
    s"Please enter at least 1 watermelon"
}

//Watermelon exercise to be continued...

//EXTENSION
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
//Remember the order of precedence so () first. Know the order.
//* / %
//etc

//1 <  4  true
//7 != 10 true
//1 < 4 && 7 !=10 = true && true and true
//9 + 10 ==21 = false
//true || false = true //according to my table though true and false is false

