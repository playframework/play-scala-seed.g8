lazy val plugins = (project in file(".")).settings(
  scalaVersion := "2.12.17", // TODO: remove when upgraded to sbt 1.8.0 (maybe even 1.7.2), see https://github.com/sbt/sbt/pull/7021
)

addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "$play_version$")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.16.0")
