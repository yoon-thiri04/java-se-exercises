package Chap5;
import java.util.*;
import java.text.*;
class Triangle{
	double a,b,c;
	public static final int INVALID_DIMENTION=-1;
	public boolean isValid()
	{
		if(a+b>c && c+a>b && b+c>a)
		return true;
		else
		return false; 
	}
	public Triangle(double a,double b,double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double getPerimeter()
	{
		double result=INVALID_DIMENTION;
		if(isValid())
		{
			result=a+b+c;
		}
		return result;
	}
	public double getArea()
	{
		double result=INVALID_DIMENTION;
		if(isValid())
		{
			double s=(a+b+c)/2;
			result=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		return result;
	}
}
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DecimalFormat dd=new DecimalFormat("0.00");
         Scanner s=new Scanner(System.in);
         double a,b,c;
         System.out.print("Enter three side of the triangle:");
         a=s.nextDouble();
         b=s.nextDouble();
         c=s.nextDouble();
         Triangle ABC=new Triangle(a,b,c);
         double Peri=ABC.getPerimeter();
         double Area=ABC.getArea();
         System.out.println("The Perimeter is "+Peri);
         System.out.print("The Area is "+dd.format(Area));
	}

}
