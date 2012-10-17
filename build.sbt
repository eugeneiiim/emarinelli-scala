name := "emarinelli-scala"

organization := "emarinelli"

version := "0.1.6-SNAPSHOT"

scalaVersion := "2.9.1"

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
