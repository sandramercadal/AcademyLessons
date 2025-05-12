

package Week2.Tuesday.Vehicles


trait Electric {
     val timeToCharge: Int //can leave this as abstract field like car, but must declare it at sub-level (as soon as I extend it)
     def charge: String = s"Charge me for $timeToCharge hours"
}
//Electric: This is a trait (a type that can be mixed into classes) that requires an abstract field timeToCharge and defines

