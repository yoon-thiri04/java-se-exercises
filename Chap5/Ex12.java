package Chap5;
import java.util.*;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int year;
         Scanner s=new Scanner(System.in);
         System.out.print("Enter a year:");
         year=s.nextInt();
         if(year%4==0 && year%100!=0)
         {
        	 System.out.print("It is a leap year.");
         }
         else if(year%4==0 && year%100==0 && year%400==0)
         {
        	 System.out.print("It is a leap year.");
         }
         else System.out.print("It is not a leap year.");
	} 

}
