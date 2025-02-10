//Q1
val myNames : Seq [String] =
  Seq ("Mr", "Mrs", "Master")

//Q2
val colourMap: Map [String, Int] = Map (

  "red" -> 1,
  "yellow"  -> 2,
  "blue" -> 3,
  "green" -> 4
)

//Q4

val removeEventList: List [Int] = firstList.filterNot (
  number => number  + 1
)

//question 3 - Add one to the list...
val newList: List [Int] = List (1,2,3,4,5)
val addToNum: List [Int] = newList.map {
  number => number + 1
}

//Q5
val seqCOntains : Boolean = seqNames.contains ("e")
