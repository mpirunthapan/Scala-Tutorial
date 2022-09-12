package scala_tutorial7

object Q2 extends App {
  val x = new RationalNumber(3,4)
  val y = new RationalNumber(5,8)
  val z = new RationalNumber(2,7)

  val result = x.Sub(y).Sub(z)

  println(result)
}

class RationalNumber(a: Int, b: Int) {
  private def gcd (p: Int, q: Int): Int =
    if (q == 0)  p else gcd(q, p % q)

  def numer = a / gcd(a, b)
  def denom = b / gcd(a, b)

  def Sub (r:RationalNumber) = new RationalNumber(this.numer * r.denom - this.denom * r.numer, this.denom * r.denom)
  override def toString(): String = numer + "/" + denom
}