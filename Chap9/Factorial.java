package Chap9;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int num;
         Scanner s=new Scanner(System.in);
         System.out.print("Enter a number to generate its factorial:");
         num=s.nextInt();
         int fact=1;
         for(int i=1;i<=num;i++)
         {
        	 fact*=i;
         }
         System.out.print("The factorial of "+num+" is "+fact);
	}

}
