package Chap6;
import java.util.*;
public class Ex7 {
	private boolean ans;
	public boolean isPrime(int num)
	{
		ans=true;
		if(num==0 || num==1)
		{
			ans=false;
		}
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				ans=false;
			    break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex7 Num=new Ex7();
		int num;
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a number:");
		
		num=s.nextInt();
		while(num>-1)
		{
		if(Num.isPrime(num))
		{
			System.out.println("It is Prime Number.");
		}
		else System.out.println("It is not Prime Number.");
        System.out.print("Enter a number:");
	    num=s.nextInt();
		}
	}

}
