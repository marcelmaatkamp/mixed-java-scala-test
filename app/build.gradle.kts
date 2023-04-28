plugins {
    scala
    java
    application
    id("distribution")
    id("dev.clojurephant.clojure") version("0.8.0-beta.2") // 0.8.0-beta.2
    id("com.github.johnrengelman.shadow") version ("7.1.2")
    id("maven-publish")
}

repositories {
    mavenCentral()
    maven {
        name = "clojars"
        url = uri("https://repo.clojars.org")
    }
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.2")
    implementation("commons-collections:commons-collections:3.2.2")
    implementation("org.clojure:clojure:1.11.1")
    compileOnly("org.clojure:tools.namespace:1.4.4")

    testRuntimeOnly ("dev.clojurephant:jovial:0.4.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")

    // datomic support
    implementation("us.bpsm:edn-java:0.7.1")
    implementation("org.apache.commons:commons-text:1.10.0")
    implementation("com.google.guava:guava:31.1-jre")

    // test
    testRuntimeOnly("org.ajoberstar:jovial:0.3.0")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnit("4.13.2")
            dependencies {
                implementation("org.scalatest:scalatest_3:3.2.15")
                implementation("org.scalatestplus:junit-4-13_3:3.2.15.0")
                implementation("org.scala-lang.modules:scala-xml_3:2.1.0")
                implementation ("org.easymock:easymock:5.1.0")
                implementation("org.scalatestplus:easymock-5-1_3:3.2.15.0")
            }
        }
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

application {
    mainClass.set("mixed.App")
}

// NOTE: You *must* enable AOT (Ahead-of-Time) compilation in order to use a Clojure class as the main class
// clojure.aotCompile = true
// clojure.warnOnReflection = true
