package Week2.Tuesday.Vehicles

//It's going to extedn the class as it is a vehicle so d i want it to be a class, case class or trait?? look at Aprils chart
//How to seperate cars fuel typer petrol, diesel, electric this wont be my lowest level so it canet be a case class as this is the lowest level

//if car is final make ita case class
//for now, lets make it a class
//extends vehicle
//a car, ots coming from vehicle so i jhave to pass doen ny car
//coammnd click to
//I need to pass doen brand brand is a string so (brand:
//brand already decalred as a string
//adding fueldtype so val fuelType
//I need to add the override of drive and use a s interpolation
//Its going to end on typoe of petrol so can use a case class now. This is the lowest level and they are final by default. You coukld choose a clas and choose to mak ethat final but you miss
//out on all the bult in functionality. Make a new scala class called Electric car






class Car ( brand: String, val FuelType: String) extends Vehicle (brand){
override def drive: String = s"This $brand car is using $FuelType"







}


