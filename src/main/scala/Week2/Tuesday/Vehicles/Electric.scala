package Week2.Tuesday.Vehicles

//can give Traits some methods def and val

trait Electric {
     val TimeToCharge: Int //can leave this as a abstract filed like car but must decalre at sub level (as soon as I extend it)
     def charge: String = s"Charge me for $TimeToCharge hours"




}
