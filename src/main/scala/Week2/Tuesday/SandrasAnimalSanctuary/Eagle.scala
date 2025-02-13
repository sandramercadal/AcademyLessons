package Week2.Tuesday.SandrasAnimalSanctuary

//Eagle extends Animal.
//Eagle cant extend Mammal.
//Carry over the logic from Animal and add in the new ones for Eagle - isNocturnal & hasLongEars
class Eagle(name: String, age: Int, isNocturnal: Boolean, hasLongEars: Boolean) {
}



  //Step 2
  //Create the object and specify that an Owl is nocturnal:
  object Eagle {

    def putItAllTogether (name: String, age: Int, isNocturnal: Boolean, hasLongEars: Boolean) :
    Eagle =
      new Eagle (name, age, isNocturnal, hasLongEars)
  }
