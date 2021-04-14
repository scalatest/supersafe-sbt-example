lazy val example = Project("example", file(".")).settings(
    name := "example",
    organization := "com.artima",
    version := "1.0.0",
    scalaVersion := "2.13.5", 
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7" % "test", 
    scalacOptions += "-P:artima-supersafe:config-file:project/supersafe.cfg"
  )
