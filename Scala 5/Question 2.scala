object test1 extends App{
    def GCD(x:Int,y:Int):Int = y match{
        case 0 => x
        case y if (y>x) => GCD(y,x)
        case _ => GCD(y,x%y)
    }
    def prime(n:Int,i:Int=2):Boolean = i match{
        case x if(n==x) => true
        case x if(GCD(n,x) > 1) => false
        case x => prime(n,x+1)
    }
    def primeSeq(n:Int):Unit={
        if(prime(n)==true) println(n)
        if(n>2) primeSeq((n-1))
    }
    print(primeSeq(10))
}
