
ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"


// enable the Scala.js plugin that’s in 'project/plugins.sbt'
enablePlugins(ScalaJSPlugin)

// this states that this project has a Scala.js application with a `main` method
scalaJSUseMainModuleInitializer := true

// this specifies the name of the `main` method
Compile/mainClass := Some("ScalaLaminar_02")

// these are basic settings that you’ll see in every sbt project.
// they specify the project name, version, and version of Scala you want
// to use.
lazy val root = (project in file("."))
  .settings(
    name := "ScalaLaminar-02"
  )

// this specifies that Laminar is a dependency for this project.
// note that Laminar depends on Scala.js and Airstream, but we don’t need
// to specify those versions here, because they are dependencies of Laminar.
libraryDependencies ++= Seq(
  "com.raquo" %%% "laminar" % "16.0.0"
)