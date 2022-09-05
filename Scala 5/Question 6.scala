
object test6 {
  def main(args: Array[String]): Unit = {
    var i = 0;
    for(c<-0 until 10){
      println(fib(i));
      i=i+1;
    }
  }

  def fib(n: Int): Int = {
   if(n==0){return 0}
    else if(n==1){return 1}
    else return (fib(n-1)+fib(n-2));
  }
}