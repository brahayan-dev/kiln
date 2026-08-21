val scala3Version = "3.8.4"

lazy val root = project
  .in(file("."))
  .settings(
    name := "kiln",
    version := "0.1.0",
    description := "Scala project to study data structures and algorithms",
    scalaVersion := scala3Version,
    scalacOptions ++= Seq("-deprecation"),
    libraryDependencies += "org.scalameta" %% "munit" % "1.3.5" % Test
  )
