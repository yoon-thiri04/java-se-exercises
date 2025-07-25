package Chap9;
import java.util.*;
import java.util.regex.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str;
        Scanner s=new Scanner(System.in);
        while(true) {
        System.out.print("Enter a word or sentence(with space):");
        str=s.nextLine();
        str.trim();
        if(str.equals("stop")) 
        {
        	break;
        }
        int left=0;
        int right=str.length()-1;
        StringBuffer sb=new StringBuffer();
        for(int i=right;i>=0;i--) {
        	sb.append(str.charAt(i));
        }
        if(sb.toString().equalsIgnoreCase(str))
        {
        	System.out.println("The input is palindrome.");
        }
        else System.out.println("The input is not palindrome.");
	}
        
	}

}
