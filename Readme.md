# Kotlin wrapper for ND4J

[nd4j](https://github.com/deeplearning4j/nd4j)

Install [kotlinc](https://kotlinlang.org/docs/tutorials/command-line.html):

```
$ brew update
$ brew install kotlin
```

Build

```
mvn clean package -Pubber
```

Run using kotlinc REPL:

```
$ kotlinc -cp target/nd4k-1.0-SNAPSHOT-fat.jar
```

Then try:

```
Welcome to Kotlin version 1.0.0-beta-1103 (JRE 1.8.0_51-b16)
Type :help for help, :quit for quit
 >>> import org.nd4j.linalg.factory.Nd4j
 >>> val float1x4 = floatArrayOf(1f, 2f, 3f, 4f)
 >>> val nd = Nd4j.create(float1x4)
 >>> val int: Float = nd.get(0, 2)
 >>> println(int)
```
