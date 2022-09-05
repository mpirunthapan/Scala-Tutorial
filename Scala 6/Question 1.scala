package scala_tutorial6

object Q1 {


  def encryption(): Unit = {
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val shift = (scala.io.StdIn.readLine("Shift by : ").toInt + alphabet.size) % alphabet.size

    val inputText = scala.io.StdIn.readLine("Secret message: ")

    val outputText = inputText.map((c: Char) => {
      val x = alphabet.indexOf(c.toUpper)

      if (x == -1) {
        c
      }
      else {
        alphabet((x + shift) % alphabet.size)
      }
    });

    println("Encrypted message : " + outputText);
  }

  def decryption(): Unit = {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val shift =  (scala.io.StdIn.readLine("Shift code: ").toInt + alphabet.size) % alphabet.size
    val inputText = scala.io.StdIn.readLine("Secrete message: ")
    val outputText = inputText.map((c: Char) => {
      val x = alphabet.indexOf(c.toUpper)

      if (x == -1){
        c
      }
      else if((x-shift)<0){
        alphabet((alphabet.size+(x-shift)))
      }
      else{
        alphabet((x - shift) % alphabet.size)
      }
    });
    println("Decrypting Message : " + outputText);
  }

  def Cipher(num:Int) : Unit = num match {
    case x if x == 0 => encryption()
    case x if x == 1 => decryption()
  }

  def main(args: Array[String]) : Unit = {
    var option = scala.io.StdIn.readLine("Type 0 for Encryption/ Type 1 for Decryption: ").toInt
    Cipher(option)
  }
}