package Week2.Tuesday.Vehicles

//can give Traits, some methods are def or val


trait Electric {
     val timeToCharge: Int //can leave this as abstract field like car, but must declare it at sub-level (as soon as I extend it)
     def charge: String = s"Charge me for $timeToCharge hours"
}