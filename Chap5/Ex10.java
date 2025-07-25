package Chap5;
import java.util.*;

import java.text.*;
class RecommendedWeightWithTest{
	int age;
	double height;
	public double Calculate_RWeight()
	{
		return (height-100+age/10)*0.90;
	}
}
public class Ex10 {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      RecommendedWeightWithTest person=new RecommendedWeightWithTest();
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the person's age:");
      person.age=s.nextInt();
      System.out.print("Enter the person's height in cms:");
      person.height=s.nextDouble();
      if(person.height>=140 && person.height<=230)
      {
    	  System.out.print("The person's ideal weight is "+person.Calculate_RWeight());
      }
      else System.out.print("Your height is more than 230cms.");
	}

}

