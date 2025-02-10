/**
 * If Else
 * Depending on the weather tell me what to wear
 */
//If true it hits the first string inside the 'if'
  //if false it hits the 2nd string inside the 'else'
val weather : String = "hot"

if
(weather == "hot")
{
s"It is $weather, grab your sunglasses!"

}else{
s"It isn't hot today $weather"
}


val weather : String = "cold"

if
(weather == "hot")
{
  s"It is $weather, grab your sunglasses!"

}else{
  s"It isn't hot today it is $weather"
}

if (weather.toLowerCase() == "hot" ) {
  s"It is $weather, no coat needed!"
} else if (weather.toLowerCase =="raining") {
  s"It is $weather, take a coat with a hood."
} else {
  s" $weather is not valid, please enter raining or hot"
}

//Multiple options
val season : String: "winter"
if (weather.toLowerCase == "cold" || season.toLowerCase ==
  "winter") {
  s"It is $weather, take a coat"
} else{
  "A light jacket is fine"
}

//Challenge 2
val ageRating : Int = 18

if (ageRating >= 18) {
  s"Your $ageRating means you can see a film rated 18"
} else if (ageRating>= 15) {
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

//Challenge 1
val calculatedScore : Int 90
  if (calculatedScore >= 90) {
    s"Your $calculatedScore is A"
  } else if (calculatedScore == 80 || calculatedScore > 80) {
    s"Your $calculatedScore is B"
  } else if (calculatedScore == 70 | calculatedScore > 70) {
    s"Your $calculatedScore is C"
  } else if (calculatedScore == 60 | calculatedScore > 60) {
    s"Your $calculatedScore is D"
  } else if (calculatedScore == 50 | calculatedScore > 50) {
    s"Your $calculatedScore is E"
  } else {
    s"Your $calculatedScore is F"
}
 //CODE FROM APRIL
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