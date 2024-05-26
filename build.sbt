// stable version of scala
val scala3Version = "3.3.3"

// for running the program in a fork
fork := true

lazy val root = project
  .in(file("."))
  .settings(
    name := "Pastebin Tutorial",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
        "com.lihaoyi" %% "cask" % "0.9.2",
        "com.lihaoyi" %% "requests" % "0.8.2",
        "org.scalameta" %% "munit" % "0.7.29" % Test
    )
)
