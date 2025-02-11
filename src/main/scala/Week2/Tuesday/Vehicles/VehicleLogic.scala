package Week2.Tuesday.Vehicles

//extends App so it runs
/**
object VehicleLogic extends App{


  println ("\nCar\n")
  //car is a class
  //I have a new car and it's a petrol

  //one level down we are good
  val ford = new Car ("Ford", "Petrol")
  println (ford.FuelType) //command + click it will tel you where its coming from
  println (ford.drive) //come from vehicle but overriden from car
  println (ford.brand) //come from vehicle
  println (ford.description)//come from vehicle

println ("\n---------ElectricCar--------")

  //we need to make an electric car and this is a case class so no need for word "new"
  //It requires a brand and a fuel type
  //val electricFord = ElectricCar ("Ford", )

//override val fuel Lan suggested a change ??

//object of type electric car, should be able to accesse verything else like noisyTodrive etc so 7 things
val electricFord = ElectricCar("Ford")//new ElectricCar object
  println (ford.FuelType)
  println (ford.drive)
  println (ford.brand)
  println (ford.description)
  println (electricFord.timeToCharge) //coming from Electric trait
  println (electricFord.noisyToDrive) //coming from ElectricCar
  println (electricFord.charge) //coming from Electric trait

}

*/