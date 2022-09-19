package scala_tutorial8


  case class Point(var x:Int, var y:Int){
    def add(a:Point) = new Point(this.x + a.x, this.y + a.y)

    def move(p:Int, q:Int):Unit = {
      this.x = this.x + p
      this.y = this.y + q
    }

    def distance(a:Point): Double = {
      var distance_x:Int = this.x - a.x
      var distance_y:Int = this.y - a.y
      var distance:Int = distance_x*distance_x + distance_y*distance_y
      scala.math.sqrt(distance)
    }

    def invert():Unit = {
      var temp = this.x
      this.x = this.y
      this.y = temp
    }

  }
object Q1 {
  def main(args: Array[String]) = {
    var p1 =  Point(5,6)
    var p2 =  Point(7,8)

    println(p1.add(p2))

    p1.move(p=2,q=4)
    p2.move(p=2,q=4)
    println(p1)
    println(p2)

    println(p1.distance(p2))

    p1.invert()
    p2.invert()

    println(p1)
    println(p2)
  }
}