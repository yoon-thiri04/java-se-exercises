package Chap9;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatchJavaIdentifier {
    private static final String VALID="Valid Identifier.";
    private static final String IN_VALID="Invalid Identifier";
    private static final String PATTERN="[a-zA-Z][a-zA-Z0-9$]*";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s2,s3;
		//System.out.print("Enter a String:");
		s2="Yoon thiri";
		StringTokenizer t=new StringTokenizer(s2);
		/*while(t.hasMoreTokens())
		{
		    StringBuilder sb=new StringBuilder(t.nextToken());
		    sb.reverse();
		    System.out.println(sb.toString()+" ");
		}*/
		System.out.print(s2.trim());
		/*
		String str,reply=null;
	    Pattern p=Pattern.compile(PATTERN);
	    Matcher m;
		Scanner s=new Scanner(System.in);
		while(true) {
		System.out.print("Enter Java Identifier:");
		str=s.next();
		if(str.equalsIgnoreCase("stop"))
		{
			break;
		}
		m=p.matcher(str);
		if(m.matches())
		{
			reply=VALID;
		}
		else reply=IN_VALID;
		System.out.println(str+" is "+reply);
		}*/
		
	
		
	    
		
		
		
				
	}
}
