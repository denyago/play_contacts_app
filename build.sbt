name := "play_contacts_app"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  jdbc,
  evolutions,
  "com.typesafe.play" %% "anorm" % "2.4.0",
  "com.h2database" % "h2" % "1.4.177",
  specs2 % Test
)

lazy val root = (project in file(".")).enablePlugins(PlayScala)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator