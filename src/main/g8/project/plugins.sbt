// We use `play-exceptions` artifact as undependend of Scala version
// just to find the latest version of Play in Maven Central
addSbtPlugin("com.typesafe.play" % "play-exceptions" % "$play_version$")
addSbtPlugin("org.foundweekends.giter8" % "sbt-giter8-scaffold" % "0.13.1")
