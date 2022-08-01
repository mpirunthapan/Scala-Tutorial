object test5 extends App{
    def toUpper(upper:String):String = upper.toUpperCase();
    def toLower(lower:String):String = lower.toLowerCase();
    
    def formatNames(name:String)(add: String => String):String = add(name);

    println(formatNames("Benny")(toUpper(_)));
    println(formatNames("Niroshan")(toUpper(_)));
    println(formatNames("Saman")(toLower(_)));
    println(formatNames("Kumara")(toUpper(_)));
    
    // println(formatNames("Benny")(toUpper(_)));   //BENNY
    // println(formatNames("Ni")(toUpper(_))+"roshan"); //NIroshan
    // println(formatNames("Saman")(toLower(_)));  //Saman
    // println("Kumar"+formatNames("a")(toUpper(_))); //KumarA
}