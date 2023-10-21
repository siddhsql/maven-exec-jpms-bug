# README

Complete example showing how Maven sucks. Objective: create a modularized application using Java Module System and be able to use service locator pattern to load a plugin at runtime.

## Build

```
mvn install
```

## Run

```
cd consumer
mvn exec:java -Dexec.mainClass=consumer/mycompany.consumer.App
```

Output:

```
[INFO] --- exec:3.1.0:java (default-cli) @ consumer ---
unable to load service provider
```

full [log](https://gist.github.com/siddhsql/06fef5fe42183cc0271f53be3b5d561a)

## Now run using `java`

```
java -p ./target/classes:../contract/target/classes:../provider/target/classes --module consumer/mycompany.consumer.App
```

Output:

```
Hello Sam
```

This is the correct output that maven exec plugin should have produced. 9 out of 10 times when you have a problem with Java the cause is not JDK, its Maven.