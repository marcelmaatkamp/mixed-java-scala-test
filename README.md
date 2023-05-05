# mixed-java-scala-test

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
✗ ./app/build/bin/native/releaseExecutable/app.kexe
Hello, Kotlin/Native!
```