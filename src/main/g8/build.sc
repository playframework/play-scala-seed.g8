import mill._
import \$ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object $name;format="camel"$ extends RootModule with PlayModule {
    
  def scalaVersion = "2.13.16"
  def playVersion = "2.9.7"
  def twirlVersion = "1.6.9"

  object test extends PlayTests
}
