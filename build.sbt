ThisBuild / scalaVersion := "3.1.3"
ThisBuild / organization := "com.bilal-fazlani"
ThisBuild / organizationName := "Bilal Fazlani"
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/bilal-fazlani/rainbowcli"),
    "https://github.com/bilal-fazlani/rainbowcli.git"
  )
)
ThisBuild / developers := List(
  Developer(
    "bilal-fazlani",
    "Bilal Fazlani",
    "bilal.m.fazlani@gmail.com",
    url("https://bilal-fazlani.com")
  )
)
ThisBuild / licenses := List(
  "MIT License" -> url(
    "https://github.com/bilal-fazlani/rainbowcli/blob/main/LICENSE"
  )
)
ThisBuild / homepage := Some(
  url("https://github.com/bilal-fazlani/rainbowcli")
)
name := "rainbowcli"

libraryDependencies ++= Seq(
  "org.scalameta" %% "munit" % "0.7.26" % Test
)

testFrameworks += new TestFramework("munit.Framework")

scalacOptions ++= Seq(
  "-deprecation"
)
