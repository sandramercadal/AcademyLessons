/**
 * If Else
 * Depending on the weather tell me what to wear

 If true it hits the first string inside the 'if'
 if false it hits the 2nd string inside the 'else'

 */


val weather: String = "hot" //will return it is hot (You can set weather to any string you want, or if you want to start with an empty value, you can use:
                            //val weather: String = ""
if
(weather == "hot") {
  s"It is $weather, grab your sunglasses!"

} else {
  s"It isn't hot today its $weather"
}


val weather: String = "cold" //will return it is cold
if
(weather == "hot") {
  s"It is $weather, grab your sunglasses!"

} else {
  s"It isn't hot today its $weather"
}

// if true --> hits the first string inside the 'if'
// if false --> hits the second string inside the 'else'

//toLowerCase on a string converts all the characters in that string to lowercase.
//Useful when you want to compare strings without worrying about their case (uppercase or lowercase).

if (weather.toLowerCase == "hot") {
  s"It is $weather, no coat needed."
} else if (weather.toLowerCase == "raining") {
  s"It is $weather, take a coat with a hood."
} else {
  s"$weather is not valid, please enter raining or hot"
}

//Now with a println to see output changed to anotherWeather //String = It is hot, no coat needed.
val anotherWeather: String = "hot"
if (anotherWeather.toLowerCase == "hot") {
  s"It is $anotherWeather, no coat needed."
} else if (anotherWeather.toLowerCase == "raining") {
  s"It is $anotherWeather, take a coat with a hood."
} else {
  s"$anotherWeather is not valid, please enter raining or hot"
}
println(anotherWeather)

//Multiple options
val season: String = "summer"
if (weather.toLowerCase == "cold" || season.toLowerCase == "winter") {
  s"It is $weather, take a coat"
} else {
  "A light jacket is fine"
}

//Task 1
//Use conditions to calculate somebody's grade given the percentage they scored.

//90%+ = "A"
//80%+ = "B"
//70%+ = "C"
//60%+ = "D"
//50%+ = "E"
//49%- = “F”

//CODE FROM APRIL
val studentGrade: Int = -59

if (studentGrade >= 90 && studentGrade <= 100) {
  "A! Well done!"
} else if (studentGrade >=80 && studentGrade <= 89){
  "B"
}else if (studentGrade >=70 && studentGrade <= 79){
  "C"
}else if (studentGrade >=60 && studentGrade <= 69){
  "D"
}else if (studentGrade >=50 && studentGrade <= 59){
  "E"
} else if (studentGrade >=40 && studentGrade <= 49) {
  "F"
} else if (studentGrade >=0 && studentGrade <= 39){
  s"$studentGrade is a U grade"
} else {
  s"$studentGrade is not valid"
}


//CODE FROM APRIL
//TASK 2
//Use conditions to work out for a given age,
// what film ratings they can see.
// Make sure your conditions are exhaustive,
// and any age will get a response (what if they're younger than 4,
//what if they're exactly 8).

//4+ = "U"
//8+ = "PG"
//12+ = "12A"
//15+ = "15"
//18+ = "18"

val givenAge: Int = 3

if (givenAge >= 18){
  println("Films ratings: U, PG, 12A, 15 or 18")
} else if (givenAge >= 15){
  println("Films ratings: U, PG, 12A or 15")
} else if (givenAge >= 12){
  println("Films ratings: U, PG or 12A")
} else if (givenAge >= 8){
  println("Films ratings: U or PG")
}  else if (givenAge >= 4 && givenAge >= 0 ){
  println("Films ratings: U only")
} else {
  println(s"$givenAge is too young to attend the cinema")
}

//Challenge 2 MY CODE
val ageRating: Int = 3

if (ageRating >= 18) {
  s"Your $ageRating means you can see a film rated 18"
} else if (ageRating >= 15) {
  s"Your $ageRating can see a film rated 15"
} else if (ageRating >= 12) {
  s"Your $ageRating can see a film rated 12A"
} else if (ageRating >= 8) {
  s"Your $ageRating  can see a film rated PG"
} else if (ageRating >= 4) {
  s"Your $ageRating can see a film rated U"
} else {
  s"Your $ageRating mean are too young  - sorry"
}
////A double backslash should work in your string to get a single backslash e.g \\ - Question asked in class.