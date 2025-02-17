/**
 * OPERATORS
 * Arithmatic operators
 * + PLus
 * - Minus
 * / Divided by
 * * Multiply
 * %  modulus
 */
val a:Int = 10
val b: Int = 5
val c: Int = 3
//Add
a + b
//subtract
a - b
b - c
//Divide
a / b
b / c
//multiply
a * b
b * c
c * c
//Modulus is there anything left over when they are divided
a % c // (a=10 % c=3) 3 goes into 10 3 times with 1 left over. Get result of what is left over = 1
a % b // (a=10 % b=5) = what is leftover which is 0

//Equality ==
a == a
a == b
//Inequality !=
a != a
a != b
//Less than <
b < a
a < c
//Less than or equal to <=
b <= a
a <= a
//Greater than >
a > b
b < c
//Greater than or equals to >=
a>= c
c>=c
"cat" >= "cat"

/**
 * Logical Operators
 */
//AND &&
true && true //true
true && false //false  - false && anything always returns false
false && true //false
false && false //false

(3<6) && (6>7) //both sides need to be true to get a true overall
//3 < 6 IS TRUE
//6 > 7 IS FALSE
//TRUE & FALSE = FALSE - false && anything always returns false

//OR ||  - one or the other must be true to give me a true
true || false // TRUE
false || true //TRUE
false || false  //FALSE

(3<6) || (6>7)
// 3 < 6 = TRUE
// 6 > 7 = FALSE
//TRUE || FALSE IS TRUE - one or the other must be true to give me a true

//Not ! negates the value
// if something is not true its false
// if something is not false its true

!false  // returns TRUE
!true   //returns FALSE


//Task 1 - on ppt
//SEE CHART TO SEE WHAT A && B will give


//Task 2
//(scala will do bodmas automatically - brackets, orders, division, multiplication, addition, subtraction.
//a) Four plus three, times fifty-five is less than three-hundred

//Scala follows a operator precedence:
// * has a higher precedence than + so evaluate that first
// 3 *55 = 165
//Next, add 4 = 169
//169 < 300 = TRUE
4 + 3 * 55 < 300

//b) ninety-six divided by twelve is greater than eight or exactly eight
96 / 12 >= 8
// 96 / 12 = 8
// 8 >= 8 = TRUE


//c) Hamster is less than Hippo (strings)
//Comparison based on unicode values.
//h vs h is the same so move onto the next letter
//a vs i - a has a lower unicode than i so true.
"hamster" < "hippo"

//d) Eight is even (modulus)
8 % 2 == 0
//Modulus (%) will give the remainder after 2 numbers are divided.
//Even numbers, when divided by 2, will have 0 as the remainder as even numbers will go perfectly into 2.
//Odd numbers, when divided by 2, will give a remainder of 1. We just care that it isn't zero. That is the important part.
//val isOdd: boolean = 17 % 2 !=  0
//17 % 2 = 1  (Note: this is saying, what is the remainder when 2 goes into 17, well, 2 goes into 17 8 times and then there is 1 left over)
//We are left with 1 != 0 (1 is not 0) which is true. So...
//isOdd = true
//If we wanted to check for something being even, we could check that the remainder was 0. e.g. 6 % 2 == 0
//Hope this helps! FROM APRIL

//e) Remember the order of precedence so brackets () first. Know the order!!!
// () Then *, then /, then %

//One-hundred and fifty-six divided by eight = 19.5 so less than 20 (156 / 8 < 20) = TRUE
// then, fifty-four is less than 20 so FALSE
// and fifty-four divided by four is 13.5 so less than fourteen so TRUE
// TRUE && FALSE && FALSE = FALSE ( - false && anything always returns false)
156 / 8 < 20 && 54 < 20 && 54 / 4 < 14