package Chap6;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num1,num2;
       int i;
       Scanner s=new Scanner(System.in);
       System.out.print("Enter two numbers to generate num1 through num2:");
       num1=s.nextInt();
       num2=s.nextInt();
       for(i=num1;i<num2;i++)
       {
    	   if(i%10==9)
    	   {
    		   System.out.format("%4d", i);
    		   System.out.println();
    	   }
    	   else
    	   {
    		   System.out.format("%4d",i);
    	   }
       }
	}

}
