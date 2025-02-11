package Week2.Tuesday.Vehicles
//This is my top class, every vehicle I choose to sell will have these
//Am i every going to build it ? no then it can be abstract. Why make it abstract?? It will prevent me making (instantiating) a vehicle.
//I am never going to be able to create a vehicle when I have made it abstract, it can only be extended.

//If we are just going to extend it why didn't we just make it a trait??? because if I had a trait i couldnt have any paramenters Traits do not allow for this.
//I always want my vehicle to have a brand or another constructor parameters.
//SO
//I want parameters (brand)
//I can use abstract


//ABSTRACT CLASS is my top level as I don't want to make instances of it
  abstract class Vehicle(val brand: String) {
    def drive: String //abstract method
    val description: String = s"This vehicle is a $brand."//this will be passed down every time?
  }
  //This is similar to Waris' anmimals always giving a simple description of an animal

  //Next Step:
  //Lets make a vehicle called a car (new scala class: called car) create this...





