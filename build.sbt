lazy val root = (project in file(".")).
  settings(
    test in Test := {
      val _ = (g8Test in Test).toTask("").value
    },
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-XX:MaxPermSize=256m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("http://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)

  ).enablePlugins(ScriptedPlugin)


// giter8.ScaffoldPlugin.scaffoldSettings

// Monitor this for src/main/g8/.scalafmt.conf
libraryDependencies += "org.scalameta" %% "scalafmt-core" % "2.6.1"
