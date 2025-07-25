package Chap4;
import java.util.*;
import java.text.*;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dd=new DecimalFormat("0.00");
        
        double R_inner,R_outer;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the inner radius:");
        R_inner=s.nextDouble();
        System.out.print("Enter the outer radius:");
        R_outer=s.nextDouble();
        
        Circle circle=new Circle();
        circle.setRadii(R_inner, R_outer);
        System.out.println("The Area of the circle region is "+dd.format(circle.Area()));
        System.out.print("The Circumference of the circle region is "+dd.format(circle.Circum()));
	}

}
