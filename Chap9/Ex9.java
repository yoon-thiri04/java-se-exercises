package Chap9;
import java.util.*;
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str;
       char ch;
       Scanner s=new Scanner(System.in);
       
       while(true)
       {
    	 System.out.print("Enter a string:");
         str=s.next();
         if(str.length()<=1)
         {
        	 ch=str.charAt(0);
        	 if(ch=='@') {
        		 System.out.print("The ASCII value of "+ch+" is "+(int)ch);
        	     break;
        	 }
        	 System.out.println("The ASCII value of "+ch+" is "+(int)ch);
         }
         else System.out.println("Your String is more than one character.");
	}
	}

}
