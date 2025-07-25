package Chap6;
import java.util.*;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=s.nextInt();
        System.out.print("The proper divisors of the number are");
        for(int i=1;i<num;i++)
        {
        	if(num%i==0)
        	{
        		System.out.print(" "+i);
        	    sum+=i;
        	}
        }
        System.out.println();
        if(sum==num)
        {
        	
        	System.out.print("It is a perfect number.");
        }
        else System.out.print("It is not a perfect number.");
	}

}
