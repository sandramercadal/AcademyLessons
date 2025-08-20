def hello() = {
  println("Hello, World")
}
println(hello)

println("hello, reader!")

/**malleable */

/** sets up a map from countries to their capitals, modifies the map by adding a new binding ("Japan" -> "Tokyo"), and prints the capital associated with France. */
var capital = Map("US" -> "Washington", "France" -> "Paris")
capital += ("Japan" -> "Tokyo")
println(capital("France"))

/** alternatives to above default Map implementation is HashMap, TreeMap, Par, ParMap executes operations in parallel */
