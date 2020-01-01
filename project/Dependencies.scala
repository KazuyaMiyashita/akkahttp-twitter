import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8" :: Nil
  lazy val scalaMock = "org.scalamock" %% "scalamock" % "4.4.0" :: Nil
  lazy val akkaHttp = "com.typesafe.akka" %% "akka-http" % "10.1.11" :: Nil
  lazy val cats = 
    "org.typelevel" %% "cats-core" % "2.0.0" ::
    "org.typelevel" %% "cats-effect" % "2.0.0" :: Nil
  lazy val circe = 
    "io.circe" %% "circe-core" % "0.12.3" ::
    "io.circe" %% "circe-generic" % "0.12.3" ::
    "io.circe" %% "circe-parser" % "0.12.3" :: Nil
  lazy val guice = "com.google.inject" % "guice" % "4.0" :: Nil
  lazy val typesafeConfig = "com.typesafe" % "config" % "1.4.0" :: Nil
  lazy val quill = "io.getquill" %% "quill-core" % "3.5.0" :: Nil
  lazy val mysql = "mysql" % "mysql-connector-java" % "8.0.18" :: Nil
}
