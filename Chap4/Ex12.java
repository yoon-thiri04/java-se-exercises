package Chap4;
import java.util.*;
import java.text.*;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dd=new DecimalFormat("0.00");
        Height person=new Height();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the person's age:");
        person.age=s.nextInt();
        System.out.print("Enter the person's height in cms:");
        person.height=s.nextDouble();
       
        System.out.print("The person's Recommanded Weight is "+dd.format(person.Recommanded_W()));
        
	}

}
