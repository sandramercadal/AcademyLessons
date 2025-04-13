case class Person (name: String, age: Int)
val anne: Person = Person ("Anne", 25)
println(anne.name) //Anne
println(anne.age) //25

def greeting(person: Person): String = s"hi ${person.name}"
println(greeting(anne)) //hi Anne

val anne1: Person = Person("Anne", 25) // First Anne
val anne2: Person = Person("Anne", 36) // Second Anne