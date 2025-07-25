package Chap9;
import java.util.*;
import java.util.regex.*;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter a word:");
			str=s.next();
			if(str.isEmpty())
			{
				break;
			}
			StringBuilder str2=new StringBuilder(str);
			if(str.equalsIgnoreCase(str2.reverse().toString()))
			{
				System.out.println("The word is Palidrome.");
			}
			else System.out.println("The word is not Palidrome.");
		}
		

	}

}
