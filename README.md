# mixed-java-scala-test

```bash
$ clojure -Sdeps '{:deps {org.pinkgorilla/gorilla-notebook {:mvn/version "0.4.1"}}}' -m pinkgorilla.core
```
 http://localhost:9000/worksheet.html

```
Execution failed for task ':commonizeNativeDistribution'.
> Could not resolve all files for configuration ':kotlinKlibCommonizerClasspath'.
   > Cannot resolve external dependency org.jetbrains.kotlin:kotlin-klib-commonizer-embeddable:1.8.21 because no repositories are defined.
     Required by:
         project :

Possible solution:
 - Declare repository providing the artifact, see the documentation at https://docs.gradle.org/current/userguide/declaring_repositories.html


```