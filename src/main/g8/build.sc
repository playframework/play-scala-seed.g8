import mill._
import \$ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object $name;format="camel"$ extends PlayModule with SingleModule {
    
  def scalaVersion = "$scala_version$"
  def playVersion = "$play_version$"
  def twirlVersion = "1.6.2"

  object test extends PlayTests
}
