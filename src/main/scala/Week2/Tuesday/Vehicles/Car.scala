package Week2.Tuesday.Vehicles
class Car (brand: String, val fuelType: String) extends Vehicle(brand) {
  override def drive: String = s"This $brand car is using $fuelType"
}

/**  Class Definitions:
 *
 * Car class extends the Vehicle class, inheriting its properties.
 * It has parameters for brand and fuelType (both strings taking in eg "Gasoline" or "Electric").
 * The drive method is overridden to provide a specific message about driving the car with its fuel type.
 **/


//What is VEHICLE?  It is going to extend to Car, Lorry, motorbike etc so the class as it is a vehicle so I don't want it to be a class, therefore
// Will it be a case class or a trait?? (look at Aprils chart)
//
// //I can separate my car by fuel types: petrol, diesel, or electric. This won't be my lowest level so it cannot be a case class as this is the lowest level
//
//OPTION RATIONALE
//CAR
// If car is final make it a case class for now, lets make it a class. It extends vehicle
//
// BRAND
//I need to pass down brand, brand is a string so (brand: ...
//brand is already declared as a string
//
//FUELTYPE
//Adding fueltype so val fuelType
//
// DRIVE
//I need to add the override of drive and use an s interpolation
//
//It's going to end on type of petrol so can use a case class now. This is the lowest level and they are final by default.
//You could choose a class and choose to make that final but you miss out on all the built-in functionality.
//
// *Make a new scala class called Electric car now...
// *
// */
//







