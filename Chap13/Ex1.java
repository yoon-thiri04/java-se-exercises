package Chap13;
import java.util.*;
class BankAccount{
	  private String name;
	  private int accountNumber;
	  private double balance;
	  
	  public double deposit(double amount)
	  {
		  balance+=amount;
		  return balance;
	  }
	  public double withdraw(double amount)
	  {
		  if(checkBalance(amount))
		  {
			  balance-=amount;
			  return balance;
		  }
		  else return -1;
	  }
	  public boolean checkBalance(double amount)
	  {
		   return balance>amount;
			 
	  }
	  public void setBalance(double balance)
	  {
		  this.balance=balance;
	  }
	  public void setName(String name)
	  {
		  this.name=name;
	  }
	  public void setAccountNumber(int accountNumber)
	  {
		  this.accountNumber=accountNumber;
	  }
	  public String getName() {
		  return name;
	  }
	  public int getAccountNumber()
	  {
		  return accountNumber;
	  }
	  public double getBalance()
	  {
		  return balance;
	  }
	  
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int accountNum;
		double balance,amount,withdraw_amount;
        BankAccount person=new BankAccount();
       
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Name :");
        name=s.nextLine();
        System.out.print("Enter Account Number :");
        accountNum=s.nextInt();
        System.out.print("Enter Balance :");
        balance=s.nextDouble();
        System.out.print("Enter deposit amount :");
        amount=s.nextDouble();
       
        person.setName(name);
        person.setAccountNumber(accountNum);
        person.setBalance(balance);
        System.out.println("After Deposit : "+person.deposit(amount));
        System.out.print("Enter amount you want to withdraw : ");
        withdraw_amount=s.nextDouble();
        System.out.print("After Withdraw : "+person.withdraw(withdraw_amount));
	}

}
