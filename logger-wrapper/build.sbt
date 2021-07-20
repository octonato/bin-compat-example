import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.example.wrapper"
ThisBuild / organizationName := "wrapper"

lazy val root = (project in file("."))
  .settings(
    name := "logger-wrapper",
    libraryDependencies ++= Seq(
      "com.github.octonato" %% "logger" % "0.1.0",
      scalaTest % Test
    )
  )
