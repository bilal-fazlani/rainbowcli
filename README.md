# scala-rainbow

## Forked from [ktoso/scala-rainbow](https://github.com/ktoso/scala-rainbow)

Super simple terminal output colorizing for Scala.
Using it you can colorize any string for terminal output and was tested on Linux and OSX, not on windows and there it probably sux ;-)

## Download

for sbt:

```scala
resolvers += "jitpack" at "https://jitpack.io"

val scalaRainbow =  "com.github.bilal-fazlani" % "scala-rainbow" % "2d27b7de6b"

libraryDependencies += scalaRainbow
```

The library is published for **Scala 3**

## Usage

Using rainbow is as simple as it gets:

```scala
import com.bilalfazlani.scala.rainbow._

println { "Warning, critical error!".red }
```

For a list of available colors take a look at [rainbow.scala](/src/main/scala/com/bilalfazlani/scala/rainbow/rainbow.scala) 

## License

Public Domain - Just use it however you see fit.
