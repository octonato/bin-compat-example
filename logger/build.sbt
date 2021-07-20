import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.github.octonato"
ThisBuild / organizationName := "octonato"

lazy val root = (project in file("."))
  .settings(
    name := "logger",
    libraryDependencies += scalaTest % Test
  )
