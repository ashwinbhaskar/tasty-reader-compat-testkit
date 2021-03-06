import sbt._

object Dependencies {
  lazy val junitInterface  = "com.novocode"        % "junit-interface"    % "0.11"
  lazy val zio             = "dev.zio"             % "zio_0.23"           % "1.0.0-RC17-tastycompat"
  lazy val zio18           = "dev.zio"             % "zio_0.23"           % "1.0.0-RC18-2-tastycompat"
  lazy val intent          = "com.factor10"        % "intent_0.23"        % "0.6.0" % Test
  lazy val scalacheck      = "org.scalacheck"      % "scalacheck_0.23"    % "1.14.1-SNAPSHOT" % Test
  lazy val munit           = "org.scalameta"       % "munit_0.23"         % "0.7.3" % Test
  lazy val nanotest        = "com.eed3si9n.verify" % "verify_0.23"        % "0.2.0" % Test
  lazy val circe           = "com.sandinh"         % "circe-core_0.23"    % "0.13.0"
  lazy val `circe-generic` = "com.sandinh"         % "circe-generic_0.23" % "0.13.0"
  lazy val `circe-parser`  = "com.sandinh"         % "circe-parser_0.23"  % "0.13.0"
}
