package Chap9;
import java.util.*;
import java.util.regex.*;
public class ReplaceVowelsWithX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner s=new Scanner(System.in);
		String st;
		char letter;
		System.out.print("Enter a String:");
		st=s.next();
		st=st.toUpperCase();
		
		StringBuffer sb=new StringBuffer(st);
		
		for(int i=0;i<sb.length();i++)
        {
	        letter=sb.charAt(i);
	       if(letter=='a' || letter=='A' || letter=='E'|| letter=='e' ||
	    		letter=='i' || letter=='o' || letter=='I' || letter=='O')
	       {
	    	   sb.setCharAt(i,'X');
	       }
        }
		System.out.println("String is "+st);
		System.out.print("After replacing: "+sb.toString());*/
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a String:");
		String sen=s.next();
		/*Pattern p=Pattern.compile("[aeiou]");
		Matcher m=p.matcher(sen);
		if(m.find())
		{
			sen=m.replaceAll("X");
		}*/
		sen=sen.replaceAll("[aeiou]", "X");
		System.out.print(sen);

	}

}
