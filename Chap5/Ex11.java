package Chap5;
import java.util.*;
public class Ex11   {
     int age;
     double height;
     final double lbPerKg=2.205;
     double R_weight,R_weightLb;
     double actual_weight,actual_weightLb;
     public String printLine()
     {
    	 if(height>=140 && height<=230)
    	 {
    		R_weight=(height-100+age/10)*0.90;
    		R_weightLb=R_weight*lbPerKg;
    		actual_weightLb=actual_weight*lbPerKg;
    		double Diff=actual_weightLb-R_weightLb;
    		if(Diff>10)
    		{
    			return "You should more exercise.";
    		}
    		else if(Diff<-20) {
    			return "You need more nourishment.";
    		}
    	    else return "You are Ok.";
         }
    	 else {
    		return "Your Height is more than 230cms";
    	 }
    } 
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ex11 person=new Ex11();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the person's age:");
        person.age=s.nextInt();
        System.out.print("Enter the person's height in cms:");
        person.height=s.nextDouble();
        System.out.print("Enter your actual weight in kg:");
        person.actual_weight=s.nextDouble();
        System.out.print(person.printLine());
	}

}
