package scala_tutorial7

object Q4 extends App {
  var bankaccountList:List[BankAccount] = List()

  def accCreate(nic:String, accId: Int):Unit = {
    val acc = new BankAccount(nic, accId)
    bankaccountList = bankaccountList ::: acc :: Nil

    println(bankaccountList)
  }

  val find = (a:Int, b:List[BankAccount]) => b.filter(account => account.accId.equals(a))
  val overdraft = (b:List[BankAccount]) => b.filter(account => account.balance < 0.0)
  val totalBalance = (b:List[BankAccount]) => b.foldLeft(0.0)((x, y) => x + y.balance)
  val interest = (b:List[BankAccount]) => b.map(account => if(account.balance > 0) account.balance * 0.05 else account.balance * 0.1)


  /* Driver Code */

  //create accounts
  accCreate("1",1)
  accCreate("2",2)

  //deposit money
  find(1, bankaccountList)(0).deposit(1000)
  println(find(1, bankaccountList)(0))

  //transfer money
  find(1, bankaccountList)(0).transfer(2, 100.0)
  println(find(2, bankaccountList)(0))

  //list of negative balances
  println(overdraft(bankaccountList))

  //sum of all account balances
  println(totalBalance(bankaccountList))

  //final balances of all accounts after apply the interest
  println(interest(bankaccountList))
}

class BankAccount(nic:String, val accId: Int, var balance: Double = 0.0){

  def withdraw(amount:Double) : Unit = {
    this.balance = this.balance - amount
  }

  def deposit(amount:Double) : Unit = {
    this.balance = this.balance + amount
  }

  def transfer(account:Int, amount:Double) : Unit = {
    val transferAcc = Q4.find(account, Q4.bankaccountList)
    if (balance < 0.0) println("Insufficient balance")
    else {
      this.withdraw(amount)
      transferAcc(0).deposit(amount)
    }
  }

  override def toString = "["+nic+":"+accId +":"+ balance+"]"
}