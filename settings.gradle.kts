pluginManagement {
    plugins {
        kotlin("jvm") version "1.9.22"
    }
}
/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/8.1.1/userguide/multi_project_builds.html
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
}

rootProject.name = "mixed"
include("app")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        // your repos
        google()
        mavenLocal()
        maven(url = "https://repo.clojars.org/")
        maven(url = "https://maven.google.com")
        maven(url = "https://repo1.maven.org/maven2")
        maven(url = "https://kotlin.bintray.com/kotlinx")
    }
}