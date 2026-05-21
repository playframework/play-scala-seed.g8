lazy val root = (project in file(".")).
  settings(
    Test / test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
  ).enablePlugins(ScriptedPlugin)
  .aggregate(phantomDeps)

// https://github.com/playframework/play-java-seed.g8/pull/204
// ensuring deps are updated inside of templates files
lazy val phantomDeps = (project in file("phantom-deps"))
  .disablePlugins(ScriptedPlugin, Giter8Plugin)
  .settings(
    publish / skip := true,
    scalaVersion := "2.13.18", // ! Also update in src/main/g8/[build.sc|build.sbt] !
    libraryDependencies ++= Seq(
      "org.playframework.twirl" %% "twirl-compiler" % "2.0.9", // ! Also update in src/main/g8/build.sc !
      "org.scalatestplus.play" %%"scalatestplus-play" % "7.0.2", // ! Also update in src/main/g8/build.sbt !
      "org.playframework" %% "play-routes-compiler" % "3.0.11", // ! Also update in src/main/g8/[build.sc|project/plugins.sbt] !
      "org.foundweekends.giter8" %% "giter8" % "0.18.0", // ! Also update in project/plugins.sbt and src/main/g8/project/plugins.sbt !
    )
  )
