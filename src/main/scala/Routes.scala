import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route

import akka.actor.typed.ActorSystem

import akka.http.scaladsl.model._

class Routes()(implicit val system: ActorSystem[_]) {

  val routes: Route = concat(
    path("a") {
      complete(HttpResponse(entity = "foo"))
    }
  )

}
