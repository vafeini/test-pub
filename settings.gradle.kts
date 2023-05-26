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
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"


   // id("com.gradle.enterprise") version ("3.9")
}

//gradleEnterprise {
// if (System.getenv("CI") != null) {
//  buildScan {
//   publishAlways()
//   termsOfServiceUrl = "https://gradle.com/terms-of-service"
//   termsOfServiceAgree = "yes"
//  }
// }
//}

rootProject.name = "test-pub"
include("lib")

