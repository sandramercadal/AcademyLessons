package Week2.Tuesday.Vehicles
//This is my top class, every vehicle i choose to sell will have these
//Am i every going to build it ? no then it can be abstract. Why make it abstract?? It will prevent me making (instantiating) a vehicle.
//I am never going to be able to create a vehicle when I have made it abstract, it can only be extended.
//If we are just going to extend it why didnt we just make it a trait??? because if I had a trait i couldnt have any paramenters I always want my vehicle to have a brand or another constructior paramenter.
// Traits do not allow for this.

//SO
//I want paramenters (brand)
//I can use abstract
class Vehicle (val brand: String) {
       def drive: String // abstract method
       //if i want to say something like waris anmimals alwyas saying their name I can here
       val description: String = s"This vehicle is a $brand."  //this will be passed down everything time

  //Lets make a vehicle lets make a car (new scala class: called car



}
