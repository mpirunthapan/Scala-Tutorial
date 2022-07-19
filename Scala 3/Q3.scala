package scala_tutorial3

object Q3 {
  def main (args : Array[String]) : Unit = {
    println(Volume_of_sphere(5))
  }
  def Volume_of_sphere(r : Double) : Double = { 4/3*scala.math.Pi*r*r*r}
}
