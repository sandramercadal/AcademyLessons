package Week2.Tuesday.Vehicles


abstract class Vehicle(val brand: String) {
  def drive: String //abstract method
  val description: String = s"This vehicle is a $brand."
}

