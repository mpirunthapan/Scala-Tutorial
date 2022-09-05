object test1 extends App{
    def GCD(x:Int,y:Int):Int = y match{
        case 0 => x
        case y if (y>x) => GCD(y,x)
        case _ => GCD(y,x%y)
    }
    def prime(p:Int,n:Int=2):Unit = n match{
        case x if(p==x) => println(p+" is a prime number")
        case x if(GCD(p,x) > 1) => println(p+" is not a prime number")
        case x => prime(p,x+1)
    }
    // def primeSeq(n:Int):Unit={
        
    // }
    // print(GCD(5,15))
    print(prime(5))
}
