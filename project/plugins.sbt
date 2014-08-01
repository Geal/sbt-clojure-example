// Comment to get more information during initialization
logLevel := Level.Warn

lazy val root = project.in(file(".")).dependsOn(clojurePlugin)

lazy val clojurePlugin = file("../../sbt-clojure")
