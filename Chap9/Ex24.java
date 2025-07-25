package Chap9;
import java.util.*;
import java.util.regex.*;
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("[\\s+!,]");
		Matcher m;
		while(true)
		{
			System.out.print("Enter a sentence:");
			str=s.nextLine();
			if(str.isEmpty())
			{
				break;
			}
			m=p.matcher(str);
		   if(m.find())
		   {
			str=m.replaceAll("");
			StringBuilder str2=new StringBuilder(str);
			if(str.equalsIgnoreCase(str2.reverse().toString()))
				
				System.out.println("The  sentence is Palindrome.");
			
			else System.out.println("The sentence is not Palindrome.");
		   }
		}

	}

}
