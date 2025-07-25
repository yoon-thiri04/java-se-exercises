package Chap6;
import java.util.*;
public class Ex18 {
    public int digit(int num)
    {
    	int k=0;
    	while(num>0)
    	{
    		int ans=num%10;
    		k++;
    		num/=10;
    	}
    	return k;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ex18 Num=new Ex18();
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter an integer:");
        num=s.nextInt();
        while(num>-1)
        {
        	System.out.println("The integer has "+Num.digit(num)+" digits");
        	System.out.print("Enter a number:");
        	num=s.nextInt();
        }
        
	}

}
