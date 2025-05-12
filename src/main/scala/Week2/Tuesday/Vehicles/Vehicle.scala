package Week2.Tuesday.Vehicles


abstract class Vehicle(val brand: String) {
  def drive: String //abstract method
  val description: String = s"This vehicle is a $brand."
}
/** Abstract Class:
 Vehicle: This abstract class defines a base vehicle structure with an abstract method drive that subclasses must implement. It also has a non-abstract field description that describes the vehicle by its brand.
 */
