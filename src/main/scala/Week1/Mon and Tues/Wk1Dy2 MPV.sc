//MVP

/**
 Before coding, decide if the answer will be true or false and why, then use operators to store values
 relating to the following:
 a) Three plus four, times fifty-seven is less than three-hundred
 b) One-hundred and forty-four, divided by 12 is greater than twelve or equal to twelve
 c) Cat is less than Dog (strings)
 d) Rabbit is less than Hamster (strings)
 e) Seventeen is odd (modulus)
 f) Seventy-five divided by nine is less than thirty and eighty-nine divided by six is less than twenty
 2. What is the difference between a string (e.g. “I love scala already”) and a print line (e.g. println (“I
 love scala already”))?
 3. Have a play in a scala worksheet using everything we have learnt today. What is possible? What
 isn’t? Is there anything that you have done that you think is pretty cool or that’s strange?
 */
// a
3 + 4 * 57 > 300
//b
144 / 12 >= 12
//c
"Cat" < "Dog"
//d
"Rabbit" < "Hamster"

//e Seventeen is odd (Modulus)

// Didn't quite get there...
//17 % 17 = "odd"

//UPDATED ANSWER: See aprils answer from storing values and operators worksheet
17 % 2 != 0 //

//f
(75 / 9 < 30) && (89 / 3 < 20)
//TRUE & FALSE = FALSE - false && anything always returns false

//2 The diff between "I love scala" and
//println (print line) "I love scala"
"I love scala"
println("I love scala")
//"I love scala" is a string - has a value of type string. It’s a string literal.
// Print line is an expression – a side effect as it prints to console – returns a unit (not a string!).

//3 play around, what is/isn't possible? Open question. Group discussion.
//3 ** 4
// power to - doesn't seem to work in Scala
//Further general investigation to continue

/**Extension Q1 - Q6:
  1. “STRING” == “string”
Is this true or false? Why?
  2. Can you convert the string “one” to the int 1?
  3. Can you convert the int 1 to string “one”?
4. Can you convert int 1 to a string? Is the result as you would expect?
5. Convert a lowercase string to uppercase.
6. Convert on the first letter of a string to uppercase.
*/
//Q1
"STRING" == "string"
//Scala appears to be case sensitive
//should return false

val areYouEqual = "STRING" == "string"
//FALSE - as above it is case sensitive


//Q2 Can you convert the string “one” to the int 1?
//This was asking if it is possible!
//Not simply (we can't just use .toInt).
// The compiler doesn't know that "one" is the same as 1.
// We would need to look at mapping to be able to do this, hold this thought.

//Q3 Can you convert the int 1 to string “one”?
//AS ABOVE IN ANSWER TO Q2
//This was asking if it is possible!
//Not simply (we can't just use .toInt).
// The compiler doesn't know that "one" is the same as 1.
// We would need to look at mapping to be able to do this, hold this thought.

//Q4 Can you convert 1 to a string? Is the result as you would expect?
val convertToString = 1.toString //Gives "1" as a string. Not one.

//Q5  Convert a lowercase string to uppercase.
val uppercase = "hello".toUpperCase

//Q6
//Convert the first letter of a string to uppercase.
val onlyFirstLetter = "hello".capitalize


/**
Research:
  1. Make a val called "new" which is type string. Why doesn’t this compile?

2. What do we need to do within our code to make it compile?

 3. Are there any other words that you cannot use?
*/
    //Name you give it      Type
            val new:       String = "I am a new string!"
// new is a keyword - this means it is protected.
// Use backticks if calling a val a keyword is unavoidable. lots of keywords, just look them up.

//other keywords include: object, if, abstract, class....
//Keywords or Reserved words are the words in a language that are used for some internal process
// or represent some predefined actions.
/**Keywords or Reserved words:
 * abstract
 * case
 * catch
 * class
 * def
 * do
 * else
 * extends
 * false
 * final
 * finally
 * for
 * forSome
 * if
 * implicit
 * import
 * lazy
 * match
 * new
 * null
 * object
 * override
 * package
 * private
 * protected
 * return
 * sealed
 * super
 * this
 * throw
 * trait
 * true
 * try
 * type
 * val
 * var
 * while
 * with
 * yield
 * >:
 * ⇒
 * =>
 * =
 * <%
 * <:
 * ←
 * <-
 * #
 * @
 * :
 * _
 */