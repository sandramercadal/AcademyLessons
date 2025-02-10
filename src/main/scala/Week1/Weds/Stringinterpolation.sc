/** string interpolation */

//s INTERPOLATION
//References variables using $ symbol
val name : String = "Sandra"
println (s" My name is $name.")//Scala will look for the val called name

//Arbitrary expressions can also be embedded using ${ } e.g
println (s" 3 * 3 = ${3 * 3}")

val a: Int = 19764 // given it the name of a
val b: Int = 67// given it the name of b
println (s" a x b = ${a * b}")
//Helpful when debugging code. Println the result at certain points in a method.

//f INTERPOLATION
//Allows the creation of simple formatted strings.
// common format specifiers e.g typesafe.
// Typesafe - you must pass in the same type as the compiler is expecting or it will error

//f Common format specifiers (type safety):
// %f - float, Double
// %d - Int, Long
// %s - String

val height: Double = 1.9
//with f:
println (f" $name%s is $height% .2f meters tall")
//.2f is to 2 decimal places

//The same thing with s instead of f:
//s doesn't recognise formatting
println (s" $name%s is $height% .2f meters tall")

math.Pi //built in library. Some libraries you import some you do not.
//Pi is case sensitive
//f
println(f"Pi to 2 d.p is ${math.Pi}%.2f")//This is Pi to 2 decimal places I use %f because Pi is a double
println(f"Pi to 5 d.p is ${math.Pi}%.5f")//This is Pi to 5 decimal places I use %f because Pi is a double
println(f"Pi to 1 d.p is ${math.Pi}%.3f")//This is Pi to 3 decimal places I use %f because Pi is a double

println(f"Pi to 1 d.p is ${math.Pi}%20.1f") //Add padding in the sentence
println(f"Pi to 1 d.p is ${math.Pi}%20.1f" + "      '") //how to add padding after ...badly using speech marks...
println(f"Pi to 1 d.p is ${math.Pi}%20.1f      '") //Add padding after (badly...)


//Printf - String
// let's us do this a bit better and swap to using a string for ease
//you need to declare it at the start then have a placeholder
 printf ("'%s'", "hello")
printf ("'%20s'", "hello")//padding before
printf ("'%-20s'", "hello")//padding after
printf ("'%20s%-20s'", "hello", "") //Padding before and after
printf ("'%25s%-20s'", "hello", "") //Even Padding before and after

//RAW INTERPOLATION
//V.simliar to 's' but doesn't escape literals in a string
//  \new line with s (line break)

//What is the difference between these two?
println (s"I'm going onto a \nnew line")
//the result is highlighted and when you click it everything will go onto a new line
//will drop onto a new line with 's'
//new line with raw seems to ignore any lines! won't see this very often
println (raw"I'm going onto a \nnew line")


//Common Use --> Regex. When we want something to look a certain way e.g a password
//if you want a challenge look into this

//CODE ALONG TASK

//Q1 - Create two strings with 2 names. Using those names, use string interpolation to print name "A is older than B"

//val name : String = "Molly"
//val secondName : String = "Mary"
//println (s" Molly is older than $secondName.")

//Create 2 ages for the people, and print A is x years older than B
val person1: String = "Molly"
val person2: String = "Mary"
val age1: Int =22
val age2: Int = 16
println (s "")
printf ("%s  Molly is 1 year older than $Mary.")

//Change your Int to doubles

//val : Double = 1.9
//println (f" $name%s is $height% .2f meters tall")
val height: Double = 1.2
println (f" $name%s is $height% .2f meters tall")
println (f" $secondName%s is $height% .2f meters tall")
//.2f is to 2 decimal places

//TASK - APRIL CODE
//Create 2 strings for two peoples names. Then using those names use string interpolation to print “A is older than B”
val personA:String = "Arnold"
val personB:String = "Bart"
println(s"$personA is older than $personB")

//Create 2 integers for the age of each person. Then use string interpolation to calculate how much older the first person is and print “A is X years older than B”
val wholeAgeA: Int = 35
val wholeAgeB: Int = 29
println(s"$personA is ${wholeAgeA - wholeAgeB} years older than $personB")

//Change your 2 integers to doubles and provide new decimal point values. Using string interpolation update the previous task so that the sentence remains the same but will give the answer to 1d.p.
val ageA: Double = 35.40
val ageB: Double = 29.30
println(f"$personA is ${ageA - ageB}%.1f years older than $personB")

//Use string interpolation to avoid the new lines from this string. “\n\n\n\n\n\n\n\nsameline\n\n”
println(raw"\n\n\n\n\n\n\n\nsameline\n\n")





