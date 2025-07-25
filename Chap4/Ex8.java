package Chap4;
import java.util.*;
import java.text.*;
public class Ex8 extends Ex7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ex7 TT=new Ex7();
        double TC;
        Scanner s=new Scanner(System.in);
        DecimalFormat dd=new DecimalFormat("0.000");
        System.out.print("Enter the tempearture in Degree Celsius:");
        TC=s.nextDouble();
        TT.setCelsius(TC);
        System.out.print("The temperature in Degree Fahrenheit is "+dd.format(TT.toFahrenheit()));
        
	}

}
