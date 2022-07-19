package scala_tutorial3

object Q4 {
  def main( args: Array[String]): Unit = {
    println(Wholesale_cost(10))
  }
  def Wholesale_cost(y :Int ): Double = {
    if(y>=50){
       (24.5*60/100*y)+50*3+(y-50)*0.75
    }else{
       (24.5*60/100*y)+(y*3)
    }
  }
}
