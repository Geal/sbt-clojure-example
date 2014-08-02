// Comment to get more information during initialization
logLevel := Level.Debug

//lazy val root = project.in(file(".")).dependsOn(clojurePlugin, groovyPlugin)
lazy val root = project.in(file(".")).dependsOn(clojurePlugin)

lazy val clojurePlugin = file("../../sbt-clojure")

//lazy val groovyPlugin = file("../../sbt-groovy")
