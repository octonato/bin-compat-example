import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "app",
    libraryDependencies ++= Seq(
      "com.github.octonato" %% "logger" % "0.1.0",
      "com.example.wrapper" %% "logger-wrapper" % "0.1.0",
      scalaTest % Test
    )
  )