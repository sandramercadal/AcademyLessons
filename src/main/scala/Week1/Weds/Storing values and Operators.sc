/**
 * OPERATORS
 * Arithmatic operators
 * +
 * -
 * /
 * *
 * %  modulus
 *
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
a % c // (10 % 3) 3 goes into 10 3 times with 1 left over. Get result of left over = 1
a % b // = 0

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
true && true
true && false
(3<6) && (6>7) //both sides need to be true to get a true overall
//or || one or the other must be true to give me a true
true || false
false || true
false || false
(3<6) || (6>7)

//Not ! if something is not true its false
!false
!true

//Task 1 - on ppt
//SEE CHART TO SEE WHAT A && B will give


//Task 2
//(scala will do bodmas automatically - brackets, orders, division, multiplication, addition, subtraction.
//a) Four plus three, times fifty-five is less than three-hundred
4 + 3 * 55 < 300

//b) ninety-six divided by twelve is greater than eight or exactly eight
96 / 12 >= 8

//c) Hamster is less than Hippo (strings)
//Comparison based on unicode values.
//h vs h
//a vs i - a has a lower unicode than i so true.
"hamster" < "hippo"

//d) Eight is even (modulus)
8 % 2 == 0
//Modulus (%) will give the remainder after 2 numbers are divided.
//Even numbers, when divided by 2, will have 0 as the remainder as even numbers will go perfectly into 2.
//Odd numbers, when divided by 2, will give a remainder of 1. We just care that it isn't zero. That is the important part.
//val isOdd: boolean = 17 % 2 !=  0
//
//17 % 2 = 1  (Note: this is saying, what is the remainder when 2 goes into 17, well, 2 goes into 17 8 times and then there is 1 left over)
//
//We are left with 1 != 0 (1 is not 0) which is true. So...
//
//isOdd = true
//
//If we wanted to check for something being even, we could check that the remainder was 0. e.g. 6 % 2 == 0
//
//Hope this helps! FROM APRIL

//e) One-hundred and fifty-six divided by eight
// is less than twenty
// and fifty-four is less than 20
// and fifty-four divided by four is less than fourteen
156 / 8 < 20 && 54 < 20 && 54 / 4 < 14