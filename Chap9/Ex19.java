package Chap9;
import java.util.*;
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str;
       char letter;
       Scanner s=new Scanner(System.in);
       while(true)
       {
       System.out.print("Enter a sentence:");
       str=s.nextLine();
       if(str.isEmpty()) break;
       for(int i=0;i<str.length();i++)
       {
    	   letter=str.charAt(i);
    	   if(letter>=65 && letter<=90 )
    	   {
    		   letter+=32;
    		   System.out.print(letter);
    	   }
    	   else if(letter>=97 && letter<=122 )
    	   {
    		   letter-=32;
    		   System.out.print(letter);
    	   }
    	   else System.out.print(letter);
       }
       System.out.println();
       }
       
	 }   
      
	}


