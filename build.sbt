name := "emarinelli-scala"

organization := "emarinelli"

version := "0.1.8-SNAPSHOT"

scalaVersion := "2.10.0-RC1"

initialCommands := """
  import emarinelli.Utils._
  import emarinelli.Shortcuts._
"""

publishTo <<= version { (v: String) =>
  val nexus = "http://mvn.compose.cc:8081/nexus/content/repositories"
  Some(
    if (v.trim.endsWith("SNAPSHOT")) {
      "Blend Snapshots" at nexus + "/snapshots/"
    } else {
      "Blend Releases"  at nexus + "/releases/"
    }
  )
}
