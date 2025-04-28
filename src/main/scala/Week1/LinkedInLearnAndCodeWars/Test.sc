import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global


//def boolToWord(boolean: Boolean): String = boolean match {
//  case true => "Yes"
//  case false => "No"
//}
//println(boolToWord(true)) //Yes

import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

/** Simple FUTURE */
def simpleFutureExample(): Future[String] = {
  Future {
    Thread.sleep(1000) // Simulate some long-running task
    "Hello from Future!"
  }
}

// Call the function and wait for the result
val futureResult = simpleFutureExample()
println(Await.result(futureResult, 2.seconds))