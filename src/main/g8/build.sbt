name := """$name$"""
organization := "$organization$"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.3"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "$organization$.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "$organization$.binders._"

/******************************************************************************
*                                Code Style                                   *
*******************************************************************************/

scalafmtOnCompile in ThisBuild := true


/******************************************************************************
*                               Code Coverage                                 *
*******************************************************************************/

// Required for IntelliJ IDEA to not complain about the scoverage plugin
libraryDependencies += "org.scoverage" %% "scalac-scoverage-runtime" % "1.4.1" % Test

coverageExcludedPackages := """.*Reverse.*Controller;controllers\..*Reverse.*;router.Routes.*;"""

coverageMinimum := 80
coverageFailOnMinimum := true


/******************************************************************************
*                              Test Environment                               *
*******************************************************************************/

// This will block any tests from overriding the env file, if running in a CI
// environment, ensure this test.env file is overwritten
Test / envFileName := "test.env"
envVars in Test := (envFromFile in Test).value
