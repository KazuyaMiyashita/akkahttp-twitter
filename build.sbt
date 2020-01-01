import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val commonSettings = List(
  scalacOptions ++= "-deprecation" :: "-feature" :: "-Xlint" :: Nil,
  scalacOptions in (Compile, console) ~= {_.filterNot(_ == "-Xlint")},
  scalafmtOnCompile := true
)

lazy val root = (project in file("."))
  .settings(
    name := "akkahttp-twitter",
    commonSettings,
    libraryDependencies ++= List(
      scalaTest.map(_%Test),
      scalaMock.map(_%Test),
      akkaHttp,
      cats,
      circe,
      guice,
      typesafeConfig,
      quill,
      mysql
    ).flatten
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
