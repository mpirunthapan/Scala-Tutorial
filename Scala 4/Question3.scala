object test extends App{
    
    def patternmatching(n:Int):String= n match{
        case x if x%2 == 0 => "Input is Even"
        case x if x%2 == 1 => "Input is Odd"
        case x if x < 0 || x == 0 => "Input is Negative/Zero"    
    }
    print(patternmatching(5))
}