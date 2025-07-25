package Exam;
import java.util.*;
import java.util.regex.*;
public class wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String sentence;
          int count=0;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter sentence:");
          sentence=s.nextLine();
          Pattern p=Pattern.compile("[a-z || A-Z || 0-9]");
          Matcher m=p.matcher(sentence);
         while(m.find())
          {
        	count++;
          }
          System.out.print("Word count is :"+count);
	}

}
