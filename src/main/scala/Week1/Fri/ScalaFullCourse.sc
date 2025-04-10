/**for comprehension - In simple terms, transforms each number in the list by adding 1 to it.**/
val numberList = List (1, 2, 3, 4)
val result = for (numb <- numberList) yield (numb + 1) //yield creates a new list where each number is (numb + 1)
println(numberList) //List(1, 2, 3, 4)
println(result) //List(2, 3, 4, 5)

