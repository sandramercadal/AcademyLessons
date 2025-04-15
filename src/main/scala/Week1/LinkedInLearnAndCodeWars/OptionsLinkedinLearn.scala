package Week1.LinkedInLearnAndCodeWars

object OptionsLinkedinLearn extends App{

  /** OPTIONS */

  //In Scala, an Option is a type that represents a value that might be present or might be absent. It's a way to handle the possibility of null values more safely. Instead of using null, which can lead to runtime errors if not handled properly, Option encapsulates the presence or absence of a value in a more controlled manner.

  //This design with two case classes (Rating and Film) is using nested Options to represent a hierarchy of data that might be missing at different levels.
  //Let's break down the reasoning:
  //
  //Rating has an Option[Int] for googleRating because a film might have a rating entry but no specific Google rating value yet.
  //Film has an Option[Rating] because some films might not have any rating information at all.
  //
  //This separation allows for more precise modeling of what data might be missing and at what level:
  //
  //A film definitely has a name (non-optional)
  //A film might not have rating information at all (Option[Rating])
  //If rating information exists, it might not have a Google rating (Option[Int])
  //
  //This approach gives you the flexibility to represent:
  //
  //A film with a complete rating: Film("Mulan", Some(Rating(Some(5))))
  //A film with a rating entry but no Google rating: Film("Mulan", Some(Rating(None)))
  //A film with no rating information at all: Film("Mulan", None)
  //
  //The nested Options can be cleanly processed using map and flatMap operations, allowing you to write code that gracefully handles all these different states of "missingness" in your data model.

  //val middleName: Option[String] = None

  //middleName is defined as an Option[String], meaning it can either hold a String (in this case "Jasmine Rose") or be None.
  //Some("Jasmine Rose") means that in this case, middleName contains a value ("Jasmine Rose").
  val middleName: Option[String] = Some("Jasmine Rose")
  println(middleName.getOrElse("").length) //12  - if option is a none it will use the "" empty string

  //val middleName: Option[Int] = None //An option can be an INT too
  //println(middleName.getOrElse("").length) //should return 0 ?
  //val middleName: Option[String] = Some(2)

  //getOrElse is one of the ways to get the values Jasmine or 2

  /**MAP**/
  val middleName2: Option[String] = Some("Muna")
  println(middleName2.map(word => word.toUpperCase)) //Some(MUNA)  - using map here

  //val middleName: Option[String] = None //map will return none
  //println(middleName.map(word => word.toUpperCase)) //None

  //when you create a case class, you are defining a new type that can hold data. Case classes provide a simple way to create classes that are used primarily to hold data. They come with built-in methods like equals, hashCode, and toString, which makes them handy for working with collections or pattern matching.
  /**FILM EXAMPLE -- FLAT MAP**/
  case class Rating(googleRating: Option[Int])
  case class Film(name: String, rating: Option[Rating])  //Film can either have a rating or no rating.

  //first film
  val mulan = Film("Mulan", Some(Rating(Some(5))))  //some is an option and rating also takes an option of 5
//The first Some (around Rating(...)) indicates that the Film has a rating (as an instance of Rating).
  //The second Some(5) indicates that this particular Rating has a defined googleRating value.

  println(mulan.name) //Mulan
  println(mulan.rating) // Some(Rating(Some(5)))


  println(Option(mulan)) //Some(Film(Mulan,Some(Rating(Some(5)))))
//Mulan is an instance of film
  //So, when you call Option(mulan), it does the following:
  //If mulan is null, Option(mulan) produces None.
  //If mulan is not null (which it is in this case), Option(mulan) produces Some(mulan).
  //This means that mulan has been successfully wrapped in an Option, and since mulan is not null, you get Some(mulan) as the result.
//So it will show you the structure of the Film object wrapped within the Some option.

  //output Some(Some(5)), indicating a nested Option.
  println(Option(mulan.rating.map(rating => rating.googleRating))) //Some(Some(Some(5)))
  // Using map (need to flatten afterwards)
  //Here, mulan.rating is of type Option[Rating].
  //The map function applies the transformation rating => rating.googleRating, which returns an Option[Int].
  //Since mulan.rating is Some(Rating(Some(5))), the result of mulan.rating.map(rating => rating.googleRating) is Some(Some(5)).
  //Wrapping this with Option(...) gives Some(Some(5)).

//Also output Some(Some(5)), indicating a nested Option.
  //Option[Option[Rating]] to Option[Rating] properly before applying the map.
  println(Option(mulan.rating).flatten.map(rating => rating.googleRating)) //Some(Some(5))
  //Here, Option(mulan.rating) is still Some(Rating(Some(5))).
  //Using flatten on Some(Rating(Some(5))) flattens it to Some(Rating(Some(5))) because mulan.rating is already an Option.
  //After flattening, the map function is applied. It will again transform Rating to googleRating (which is an Option).
  //Thus, you end up with Some(Some(5)).

  //This uses FlatMp which more elegant instead of map and falttend to get actual googleRating and gives you the actual value directly, avoiding the unnecessary nesting of Option.
//Outputs Some(5), which is a single Option containing the integer.
  println(mulan.rating.flatMap(rating => rating.googleRating)) //Some(5)
//Here, mulan.rating.flatMap(rating => rating.googleRating) directly uses flatMap, which checks if mulan.rating is Some.
  //If it is, it retrieves the rating (of type Rating), then it directly gets googleRating, which is of type Option[Int].
  //Since googleRating itself is Some(5), you get the final output as Some(5) without any nested Option.
  //Thus, the output is Some(5).




  /**FOR COMP great to get out the value inside of options and computing them and chaining dependant steps**/

  //val averageRating = for {
  //  rating <- mulan.rating
  //  googleRating <- rating.googleRating
  //  netflixRating <- rating.netflixRating
  //  if googleRating > 3
  //  averageRating = (googleRating + netflixRating) / 2
  //} yield averageRating
  //println(averageRating) //2+ 3 /2 = Some(3)
  ////If Mulan was a none rather than SOme, would return None.

  /** Challenge - Options
   * Q1a  Create a val of type Option[Int]
   * b Set it to a Some
   * c Use map function to double it
   * Set your Option to None
   * run same map function again on the none

   **/

  val number: Option[Int] = Some(5)
  println(number.map(n => n * 2)) //Option[Int] = Some(10)  - n can be anything!
  println(number.map(_ * 2)) //Option[Int] = Some(10) _ instead of arrow

  //Now our option Int is a None
  //val number: Option[Int] = None
  //map over it
  //println(number.map(_ * 2)) //None


  val myList= List(2,3,4)
  println(List)
  println(s"My list: $myList") //My list: List(2, 3, 4)

  // String list
  val stringList = List("apple", "banana", "cherry")
  println(stringList) //List(apple, banana, cherry)

  // Mixed type list (requires specifying Any as the type)
  val mixedList: List[Any] = List(1, "two", 3.0, true)
  println(mixedList) //List(1, two, 3.0, true)

  // Define an empty list using List()
  val emptyList: List[Int] = List()

  // Define an empty list using Nil
  val emptyList2: List[Int] = Nil

  // Create a list with elements including duplicates
  val ns = List(1, 2, 3, 4, 4, 4, 4, 4, 5)

  // Prepend an element to the list using +:
  val res46 = 6 +: ns
  // Should result in List(6, 1, 2, 3, 4, 4, 4, 4, 4, 5)

  // Append an element to the list using :+
  val res47 = ns :+ 6
  // Should result in List(1, 2, 3, 4, 4, 4, 4, 4, 5, 6)

  // Concatenate two lists using ++
  val res48 = List(6, 5, 4) ++ ns
  // Should result in List(6, 5, 4, 1, 2, 3, 4, 4, 4, 4, 4, 5)

  // Remove duplicates using distinct
  val res49 = ns.distinct
  // Should result in List(1, 2, 3, 4, 5)

  val res50 = ns.length

  /** How the map function works on lists */
  val myNumbers = List(1, 2, 3)
  myNumbers.map(n => n * 2) //times each number by 2 = 2,4,6

  val disneyName = List("Moana", "Jasmine")
  println(disneyName) ////List(Moana, Jasmine)
  println (disneyName.map(disneyName => disneyName.toUpperCase)) //List(MOANA, JASMINE)
  //works the same as
  println (disneyName.map(_.toUpperCase)) //List(MOANA, JASMINE)


  /** How the Flatmap function works on lists - combo of mat and flatten*/

  // Define the initial list of integers
  val newList: List[Int] = List(1, 2, 3) //List(List(1, 1), List(2, 2), List(3, 3))

  // Map each element to a list of itself and itself, creating a nested list
  val res90: List[List[Int]] = ns.map(n => List(n, n))
  println(res90)  // List(List(1, 1), List(2, 2), List(3, 3), List(4, 4), List(4, 4), List(4, 4), List(4, 4), List(4, 4), List(5, 5))

  // Map followed by flatten to create a flat list
  val res91: List[Int] = ns.map(n => List(n, n)).flatten
  println(res91)  // List(1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5)

  // FlatMap combines map and flatten in one operation
  val res92: List[Int] = ns.flatMap(n => List(n, n))
  println(res92)  // List(1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5)

  // Define a list of Disney character names
  val names: List[String] = List("Moana", "Jasmine")
  println(names)  // List(Moana, Jasmine)

  // Map each name to a list containing original and uppercase version
  val res93: List[List[String]] = names.map(name => List(name, name.toUpperCase))
  println(res93)  // List(List(Moana, MOANA), List(Jasmine, JASMINE))

  // Map followed by flatten
  val res94: List[String] = names.map(name => List(name, name.toUpperCase)).flatten
  println(res94)  // List(Moana, MOANA, Jasmine, JASMINE)

  // FlatMap combines the operations
  val res95: List[String] = names.flatMap(name => List(name, name.toUpperCase))
  println(res95)  // List(Moana, MOANA, Jasmine, JASMINE)

  /** For COMP */
  //def combinations(xs: List[Int], ys: List[Int]): List[(Int, Int)] = {
  //  for {
  //    x <- xs
  //    y <- ys
  //  } yield (x, y)
  //}
  //
  //def takeNames(names: List[String]): List[String] = {
  //  for {
  //    name <- names
  //    if name.contains("a")
  //  } yield name
  //}
  //println(combinations(List(1, 2), List(3, 4))))
  //println(takeName(List("Sandra", "Dotty", "Pat")))) //should only see two names

  /**challenge
   *Using List(1,1,2,2,3,3,4), get the head and tail
   * Find all the unique values
   * get the first 3 elements
   * find the length of the list
   * map over your list multiplying each number by itself
   * FlatMap over the list to create three duplicates for each element
   *
   * Create case class called Destination which as 2 fields: a city, which is of type Strinf, and a journeyTime, which is of  type Int
   * Create a list of destinations of your choice
   *
   * USe FOR COMP to filter to iterate through the list fo destinations and filter on shorterJourneyTime, yield the destination
   */









}
