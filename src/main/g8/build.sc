import mill._
import \$ivy.`com.lihaoyi::mill-contrib-playlib:`,  mill.playlib._

object $name;format="camel"$ extends PlayModule with SingleModule {
    
  def scalaVersion = "2.13.16"
  def playVersion = "2.8.22"
  def twirlVersion = "1.5.1"

  object test extends PlayTests
}
