name := "emarinelli-scala"

organization := "emarinelli"

version := "0.1.10"

scalaVersion := "2.10.0-RC1"

initialCommands := """
  import emarinelli.Utils._
  import emarinelli.Shortcuts._
"""

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")

publishTo := Some("Blend Repository" at "https://blend.artifactoryonline.com/blend/blend")
