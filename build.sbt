name := """template-poc"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++=
  javaJdbc ::
  javaEbean ::
  cache ::
  javaWs ::
  "com.github.jknack" % "handlebars" % "2.0.0" ::
  "com.github.jknack" % "handlebars-jackson2" % "2.0.0" ::
  Nil
