sbtPlugin := true

scalaVersion := "2.12.2"

scriptedSettings

scriptedLaunchOpts ++= sys.process.javaVmArguments.filter(
  a => Seq("-Xmx", "-Xms", "-XX", "-Dsbt.log.noformat").exists(a.startsWith)
)

// giter8.ScaffoldPlugin.scaffoldSettings
