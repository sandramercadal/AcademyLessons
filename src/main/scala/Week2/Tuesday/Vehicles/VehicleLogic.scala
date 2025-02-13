

//extends App so it runs
package Week2.Tuesday.Vehicles

object VehicleLogic extends App {

  println("\n----Car-----\n")
  //Car is a Class
  val ford = new Car("Ford", "Petrol") //object of Car, I have a new car and it is petrol
  println(ford.fuelType) //Coming from car
  println(ford.drive) //Come from Vehicle, override in Car
  println(ford.brand) //Come Vehicle
  println(ford.description) //Come from Vehicle


  //object of type electric car, should be able to access everything else like noisyToDrive etc so 7 things:
  println("\n-----ElectricCar-----\n")
  val electricFord = ElectricCar("Ford") //new ElectricCar object
  println(electricFord.fuelType)
  println(electricFord.drive)
  println(electricFord.brand)
  println(electricFord.description)
  println(electricFord.noisyToDrive) //coming from ElectricCar
  println(electricFord.timeToCharge) //coming from Electric trait
  //println(electricFord.charge) //coming from Electric trait

}

 /**


object VehicleLogic extends App{


  println ("\nCar\n")
  //car is a class
  //I have a new car and it's a petrol

  //one level down
  //command + click it will tell you where it's coming from

  val ford = new Car("Ford", "Petrol") //object of Car
  println(ford.fuelType) //Coming from car
  println(ford.drive) //Come from Vehicle, override in Car
  println(ford.brand) //Come Vehicle
  println(ford.description) //Come from Vehicle

  //we need to make an electric car and this is a case class so no need for word "new"
  //It requires a brand and a fuel type
  //val electricFord = ElectricCar ("Ford") //new ElectricCar object




*/