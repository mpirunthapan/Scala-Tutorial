package scala_tutorial7

object Q1 extends App {
  val Num = new Rational(5,6)
  println(Num.neg())
}

class Rational(numerator:Int, denominator:Int){
  def x:Int = numerator
  def y:Int = denominator

  def neg() = new Rational(-this.x, this.y)
  override def toString: String = x + "/" + y
}