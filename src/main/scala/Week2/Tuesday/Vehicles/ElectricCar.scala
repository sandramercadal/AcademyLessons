package Week2.Tuesday.Vehicles
case class ElectricCar (override val brand: String) extends Car(brand, "Electric") with Electric {
  override val timeToCharge: Int = 8
  val noisyToDrive: Boolean = false //specific to ElectricCar. Maybe I want a new method which is only in electric this is specific to electricCar only noy just electric.
}
