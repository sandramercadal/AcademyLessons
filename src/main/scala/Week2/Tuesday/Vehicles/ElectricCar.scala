package Week2.Tuesday.Vehicles
case class ElectricCar (override val brand: String) extends Car(brand, "Electric") with Electric {
  override val timeToCharge: Int = 8
  val noisyToDrive: Boolean = false //specific to ElectricCar. Maybe I want a new method which is only in electric this is specific to electricCar only noy just electric.
}

/**Case Class: ElectricCar: This is a case class that extends Car and mixes in the Electric trait. It passes the brand to the Car class and sets the fuelType to "Electric". It also provides a specific value for timeToCharge (8 hours) and adds a new field noisyToDrive
 */
