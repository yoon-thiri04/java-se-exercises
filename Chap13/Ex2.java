package Chap13;
/*package Chp13;
import java.text.*;
import java.util.*;
abstract class Shape{
	 String color;
	 String getColor()
	 {
		 return color;
	 }
	 abstract double calculateArea();
}
class Rectangle extends Shape{
	
      double width,height;
      public Rectangle(double width,double height)
      {
    	  this.width=width;
    	  this.height=height;
      }
      public double calculateArea(){
    	  return width*height;
      }
}
class Circle extends Shape{
	  double r;
	  public Circle(double r)
	  {
		this.r=r;
		
	  }
	  public double calculateArea()
	  {
		return Math.PI*Math.pow(r, 2);
	  }
}


public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r,w,h;
		
		Scanner s=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		System.out.print("Enter circle's radius:");
		r=s.nextDouble();
		
		Circle c=new Circle(r);
		System.out.print("Enter circle's color:");
		c.color=s.next();
		
		System.out.print("Circle's Area is "+df.format(c.calculateArea()));
		System.out.println(" , color is "+c.getColor());
	    
		System.out.print("Enter rectangle's width and height:" );
		w=s.nextDouble();
		h=s.nextDouble();
		
		Rectangle rec=new Rectangle(w,h);
		System.out.print("Enter rectangle's color:");
		rec.color=s.next();
		
		System.out.print("Rectangle's Area is "+df.format(rec.calculateArea()));
		System.out.print(" , color is "+rec.getColor());
	}
}
*/