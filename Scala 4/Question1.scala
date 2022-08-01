object test1 extends App{
    def interest(amount:Int):Double= amount match{
        case x if x < 0 => 0
        case x if x < 20000 => x*0.02
        case x if x < 200000 => x*0.04
        case x if x < 2000000 => x*0.035
        case x if x > 200000 => x*0.065
    }

    print(interest(20000))
}