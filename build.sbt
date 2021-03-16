organization := "com.bilal-fazlani"

name := "scala-rainbow"

version := "0.3.0"

scalaVersion := "3.0.0-RC1"

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit" % "0.7.22" % Test
)

testFrameworks += new TestFramework("munit.Framework")

scalacOptions ++= Seq(
  "-source",
  "future",
  "-deprecation"
)
