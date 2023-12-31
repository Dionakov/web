val Http4sVersion = "0.23.20"
val MunitVersion = "0.7.29"
val LogbackVersion = "1.4.8"
val MunitCatsEffectVersion = "1.0.7"

lazy val root = (project in file("."))
  .settings(
    organization := "net.rochdion",
    name := "web",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "3.3.0",
    libraryDependencies ++= Seq(
      "org.http4s"      %% "http4s-ember-server" % Http4sVersion,
      "org.http4s"      %% "http4s-ember-client" % Http4sVersion,
      "org.http4s"      %% "http4s-circe"        % Http4sVersion,
      "org.http4s"      %% "http4s-dsl"          % Http4sVersion,
      "org.scalameta"   %% "munit"               % MunitVersion           % Test,
      "org.typelevel"   %% "munit-cats-effect-3" % MunitCatsEffectVersion % Test,
      //"ch.qos.logback"  %  "logback-classic"     % LogbackVersion,
    ),
    testFrameworks += new TestFramework("munit.Framework")

  )

val stage = taskKey[Unit]("Stage task")

val Stage = config("stage")

stage := {
  IO.copyFile(new File("web-assembly-0.0.1-SNAPSHOT.jar"), baseDirectory.value / "target" / "webapp-runner.jar")
}
