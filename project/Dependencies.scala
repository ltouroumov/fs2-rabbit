import sbt._

object Dependencies {

  object Version {
    val cats        = "2.4.2"
    val catsEffect  = "3.0.0"
    val fs2         = "3.0.0"
    val circe       = "0.13.0"
    val amqpClient  = "5.11.0"
    val logback     = "1.2.3"
    val monix       = "3.3.0"
    val zio         = "1.0.4-2"
    val zioCats     = "2.3.1.0"
    val scodec      = "1.0.0"
    val dropwizard  = "4.1.18"
    val catsTagless = "0.12"

    val kindProjector    = "0.11.3"
    val betterMonadicFor = "0.3.1"

    val scalaTest               = "3.2.5"
    val scalaCheck              = "1.15.2"
    val scalaTestPlusScalaCheck = "3.2.2.0"
    val disciplineScalaCheck    = "2.1.2"
  }

  object Libraries {
    def circe(artifact: String): ModuleID = "io.circe" %% artifact % Version.circe

    lazy val amqpClient  = "com.rabbitmq"   % "amqp-client"         % Version.amqpClient
    lazy val catsEffect  = "org.typelevel" %% "cats-effect"         % Version.catsEffect
    lazy val fs2Core     = "co.fs2"        %% "fs2-core"            % Version.fs2
    lazy val scodecCats  = "org.scodec"    %% "scodec-cats"         % Version.scodec
    lazy val catsTagless = "org.typelevel" %% "cats-tagless-macros" % Version.catsTagless

    // Compiler
    lazy val kindProjector    = "org.typelevel" % "kind-projector"     % Version.kindProjector cross CrossVersion.full
    lazy val betterMonadicFor = "com.olegpy"   %% "better-monadic-for" % Version.betterMonadicFor

    // Examples
    lazy val logback       = "ch.qos.logback"        % "logback-classic"  % Version.logback
    lazy val monix         = "io.monix"             %% "monix"            % Version.monix
    lazy val zioCore       = "dev.zio"              %% "zio"              % Version.zio
    lazy val zioCats       = "dev.zio"              %% "zio-interop-cats" % Version.zioCats
    lazy val dropwizard    = "io.dropwizard.metrics" % "metrics-core"     % Version.dropwizard
    lazy val dropwizardJmx = "io.dropwizard.metrics" % "metrics-jmx"      % Version.dropwizard

    // Json libraries
    lazy val circeCore    = circe("circe-core")
    lazy val circeGeneric = circe("circe-generic")
    lazy val circeParser  = circe("circe-parser")

    // Scala test libraries
    lazy val scalaTest               = "org.scalatest"     %% "scalatest"            % Version.scalaTest
    lazy val scalaCheck              = "org.scalacheck"    %% "scalacheck"           % Version.scalaCheck
    lazy val scalaTestPlusScalaCheck = "org.scalatestplus" %% "scalacheck-1-14"      % Version.scalaTestPlusScalaCheck
    lazy val disciplineScalaCheck    = "org.typelevel"     %% "discipline-scalatest" % Version.disciplineScalaCheck
    lazy val catsLaws                = "org.typelevel"     %% "cats-laws"            % Version.cats
    lazy val catsKernelLaws          = "org.typelevel"     %% "cats-kernel-laws"     % Version.cats
  }

}
