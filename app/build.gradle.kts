buildscript {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven( url = "https://maven.google.com" )
        maven( url = "https://repo1.maven.org/maven2" )
        maven( url = "https://kotlin.bintray.com/kotlinx" )
    }
}

plugins {
    scala
    java
    application
    idea
    kotlin("multiplatform") version "1.9.22"
    id("java")
    id("dev.clojurephant.clojure") version "0.8.0-beta.2"
    id("application")
    // kotlin("jvm")
    // kotlin("jvm")

}



group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
        maven(url = "https://repo.clojars.org/")
        maven(url = "https://maven.google.com")
        maven(url = "https://repo1.maven.org/maven2")
        maven(url = "https://kotlin.bintray.com/kotlinx")
    }
}

dependencies {
    implementation("org.scala-lang:scala3-library_3:3.2.2")
    implementation("commons-collections:commons-collections:3.2.2")

   // implementation("org.jetbrains.kotlin:kotlin-klib-commonizer-embeddable:1.9.22")

    implementation("org.clojure:clojure:1.11.1")
    implementation("compojure:compojure:1.7.0")
    compileOnly("org.clojure:tools.namespace:1.4.4")

    // datomic support
    implementation("us.bpsm:edn-java:0.7.1")
    implementation("org.apache.commons:commons-text:1.10.0")
    implementation("com.google.guava:guava:31.1-jre")

    // test
    testRuntimeOnly("org.ajoberstar:jovial:0.3.0")
    testRuntimeOnly ("dev.clojurephant:jovial:0.4.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    implementation(kotlin("stdlib-jdk8"))
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

tasks.withType<Wrapper> {
    gradleVersion = "7.3" // "8.1.1"
    distributionType = Wrapper.DistributionType.BIN
}

clojure {
    builds {
        // getByName("mixed.ClojureSome")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(18))
    }
}

application {
    mainClass.set("mixed.App")
}

kotlin {
    // macosX64("native") { // on macOS
    linuxX64("native") { // on Linux
        // mingwX64("native") // on Windows
        binaries {
            executable()
        }
    }
}

repositories {
    mavenCentral()
}
