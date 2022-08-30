# rainbowcli

## Forked from [ktoso/scala-rainbow](https://github.com/ktoso/scala-rainbow)

Super simple terminal output colorizing for Scala.
Using it you can colorize any string for terminal output and was tested on Linux and OSX, not on windows and there it probably sux ;-)

## Download

for sbt:

```scala

val rainbowcli =  "com.bilal-fazlani" % "rainbowcli" % "3.0.0"

libraryDependencies += rainbowcli
```

The library is published for **Scala 3**

## Usage

Using rainbow is as simple as it gets:

```scala
import com.bilalfazlani.rainbowcli.*

given ColorContext = ColorContext(true)

println { "Warning, critical error!".red.bold }
```

For a list of available colors take a look at [rainbow.scala](https://github.com/bilal-fazlani/rainbowcli/blob/master/src/main/scala/com/bilalfazlani/rainbowcli/rainbow.scala)

## License

Public Domain - Just use it however you see fit.
