package Chap4;
import java.text.*;
import java.util.*;
public class Ex7 {
    double TF,TC;
    public double toFahrenheit()
    {
    	TF=(1.8*TC)+32;
    	return TF;
    }
    public double toCelcius()
    {
    	TC=(TF-32)*5/9;
    	return TC;
    }
    public void setFahrenheit(double TF)
    {
    	this.TF=TF;
    }
    public void setCelsius(double TC)
    {
    	this.TC=TC;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Ex7 TT=new Ex7();
       double Tf;
       Scanner s=new Scanner(System.in);
       DecimalFormat dd=new DecimalFormat("0.000");
       System.out.print("Enter the temperture in Degree Fahrenheit:");
       Tf=s.nextDouble();
       TT.setFahrenheit(Tf);
       System.out.println("The temperature in Celsius is "+dd.format(TT.toCelcius()));
       double Tc;
       System.out.print("Enter the TC:");
       Tc=s.nextDouble();
       TT.setCelsius(Tc);
       DecimalFormat df=new DecimalFormat("0.00");
       System.out.print("TF is "+df.format(TT.toFahrenheit()));
       
	}

}
