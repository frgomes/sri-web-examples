enablePlugins(SriPlatformPlugin)

name := "web-examples-relay-graphcool"
organization := "scalajs-react-interface"

val scala212 = "2.12.8"
val scala213 = "2.13.0"

scalaVersion := scala212
crossScalaVersions := Seq(scala212, scala213)

resolvers += Resolver.bintrayRepo("scalajs-css", "maven")

libraryDependencies ++= Seq(
  "scalajs-react-interface" %%% "core" % "2019.06.26",
  "scalajs-react-interface" %%% "web" % "2019.06.26",
  "scalajs-css" %%% "core" % "2019.06.26",
  "scalajs-css" %%% "autoprefixer" % "2019.06.26",
  "scalajs-react-interface" %%% "web-router" % "2019.06.26",
  "scalajs-react-interface" %%% "vdom" % "2019.06.26",
  "scalajs-react-interface" %%% "relay" % "2019.06.26",
  "scalajs-react-interface" %%% "universal" % "2019.06.26"
)

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-language:postfixOps",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-language:existentials"
)

