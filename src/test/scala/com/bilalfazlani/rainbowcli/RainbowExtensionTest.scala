package com.bilalfazlani.rainbowcli

class RainbowExtensionTest extends munit.FunSuite {
  test("Rainbow should colorize strings") {
    given ColorContext = ColorContext(true)

    val red = "red".red
    val blue = "blue".blue
    val yellow = "yellow".yellow
    val green = "green".green

    println("red = " + red)
    println("blue = " + blue)
    println("yellow = " + yellow)
    println("green = " + green)
  }
}
