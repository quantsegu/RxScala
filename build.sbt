organization := "io.reactivex"

name := "rxscala"

lazy val root = project in file(".")

lazy val examples = project in file("examples") dependsOn (root % "test->test;compile->compile") settings(
  libraryDependencies ++= Seq(
    "org.apache.bcel" % "bcel" % "5.2" % "test"
  )
)

scalacOptions in ThisBuild := Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

scalaVersion in ThisBuild := "2.11.6"

crossScalaVersions in ThisBuild := Seq("2.10.5", "2.11.6")

libraryDependencies ++= Seq(
  "io.reactivex" % "rxjava" % "1.0.8",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test")
