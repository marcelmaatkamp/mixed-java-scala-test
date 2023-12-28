# mixed-java-scala-test

Mix and interop java, scala, kotlin and clojure classes all in one project.

# idea

Generate idea config 

```bash
$ gradle idea
```

Open in Intellij

# run 

```bash
$ gradle run
```

Output
```
> Task :app:run
Hello, world!
ScalaSome: scaleSome: ScalaSomeThing
Clojure: plus: 3
ScalaSome: javaPureSome: mixed.JavaPureSome
JavaSome: scalaSome: ScalaSomeThing
3
["I" "love" "turtles"]
["I" "hate" "turtles"]
[1, 4, 7]
The state is: 4
ScalaSome: javaSome: javaSomeThing
Clojure: plus: 3
```

# pink gorrila 

```bash
$ clojure -Sdeps '{:deps {org.pinkgorilla/gorilla-notebook {:mvn/version "0.4.1"}}}' -m pinkgorilla.core
```
 http://localhost:9000/worksheet.html

# kotlin

## nativeBinaries

### compile

```bash
$ gradle nativeBinaries
```

### run

```bash
$ ./app/build/bin/native/releaseExecutable/app.kexe
```

output 
```
Hello, Kotlin/Native!
```