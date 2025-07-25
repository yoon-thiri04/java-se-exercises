package Chap9;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PhoneNumber {
    private static final String STOP="0";
    private static final String VALID="Valid Phone Number.";
    private static final String INVALID="Not Valid Phone Number";
    private static final String VALID_PATTERN="[0-9]{3}-[0-9]{3}-[0-9]{4}";
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String phoneNumber;
         Scanner s=new Scanner(System.in);
         
         while(true) {
          System.out.print("Enter Phone#: ");
          phoneNumber=s.next();
          Pattern p=Pattern.compile(VALID_PATTERN);
          Matcher m=p.matcher(phoneNumber);
          if(phoneNumber.equalsIgnoreCase("Stop"))
          {
        	  break;
          }
          if(m.matches())
          {
        	  System.out.println(phoneNumber+":"+VALID);
          }
          else System.out.println(phoneNumber+":"+INVALID);
         
         
         
         }
	}

}
