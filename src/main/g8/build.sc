import mill._
import \$ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object $name;format="camel"$ extends RootModule with PlayModule {
    
  def scalaVersion = "$scala_version$"
  def playVersion = "$play_version$"
  def twirlVersion = "2.0.1"

  object test extends PlayTests
}
