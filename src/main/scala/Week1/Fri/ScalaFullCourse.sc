/**for comprehension - In simple terms, transforms each number in the list by adding 1 to it.**/

//val xs = List(1,2,3,4): This line creates a list named xs containing the numbers 1 through 4.
//val result = for (a <- xs) yield (a + 1): This line iterates over each element in xs, takes a, adds 1 to it, and "yields" the new value. It creates a new list with the results.
//println(xs): This prints the original list, which is still List(1, 2, 3, 4).
//println(result): This prints the new list, which will be List(2, 3, 4, 5) since each number in xs was incremented by 1.
val numberList = List(1,2,3,4)
val result = for (numb <- numberList) yield (numb + 1) //yield creates a new list where each number is (numb + 1)
println(numberList) //List(1, 2, 3, 4)
println(result) //List(2, 3, 4, 5)

