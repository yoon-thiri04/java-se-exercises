package Chap13Final;
class BankAccount{
	private  String account;
	private double balance;
	public BankAccount(String account,double balance)
	{
		this.account=account;
		this.balance=balance;
	}
	public void deposit(int amount)
	{
		balance+=amount;
	}
	public void withdraw(double amount)
	{
		if(balance>amount)
		{
			balance-=amount;
		}
		else System.out.print("Insufficient Balance");
	}
	public double getBalance()
	{
		return balance;
	}
}
class SavingAccount extends BankAccount{
	 public SavingAccount(String account,double balance)
	 {
		 super(account,balance);
	 }
	 public void withdraw(double amount)
	 {
		 if(getBalance()-amount<100)
		 {
			 System.out.print("Minimum value of 100 required.");
		 }
		 else {
			 super.withdraw(amount);
		 }
	 }
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount bk=new BankAccount("BA1234",500);
        bk.deposit(1000);
        System.out.println("After deposit:"+bk.getBalance());
        bk.withdraw(600);
        System.out.println("After withrawing :"+bk.getBalance());
        SavingAccount sk=new SavingAccount("A1000",500);
        sk.deposit(100);
        System.out.println("After deposit:"+sk.getBalance());
        sk.withdraw(450);
        System.out.println("Afer withdarw:"+sk.getBalance());
        sk.withdraw(100);
        
	}

}
