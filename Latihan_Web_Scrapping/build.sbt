name := "QuoteScraper"

version := "0.1"

scalaVersion := "3.6.4"

libraryDependencies ++= Seq(
  "org.jsoup" % "jsoup" % "1.15.4"
)

// Untuk konversi collection Java ke Scala
scalacOptions += "-language:implicitConversions"
