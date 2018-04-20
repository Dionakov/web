organization := "org.scalatra.example"
name := "Scalatra HTTP Demo"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.12.4"

val ScalatraVersion = "2.6.+"

libraryDependencies ++= Seq(
  "org.scalatra"            %% "scalatra"          % ScalatraVersion,
  "org.scalatra"            %% "scalatra-specs2"   % ScalatraVersion    % "test",
  "ch.qos.logback"          %  "logback-classic"   % "1.2.3"            % "provided",
  "org.eclipse.jetty"       %  "jetty-webapp"      % "9.4.7.v20170914"  % "provided",
  "javax.servlet"           %  "javax.servlet-api" % "3.1.0"            % "provided"
)

enablePlugins(ScalatraPlugin)
enablePlugins(SbtTwirl)