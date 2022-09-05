object test3 extends App{
    def add(n:Int):Int = n match{
        case x if(x == 1) => 1
        case _ => n + add(n-1)
    }
    print(add(5))
}