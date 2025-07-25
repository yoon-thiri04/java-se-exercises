package Chap7;
import java.util.*;
public class Ex2 {
    double slide;
    public Ex2()
    {
    	slide=5;
    	System.out.println("The Surface Area of the cube1 is "+Surface_Area());
    	System.out.println("The Volume of the cube1 is "+Volume());
    }
    public Ex2(double slide)
    {
    	this.slide=slide;
    	System.out.println("The Surface Area of the cube2 is "+Surface_Area());
    	System.out.println("The Volume of the cube2 is "+Volume());
    	
    }
    public double Surface_Area()
    {
    	return 6*Math.pow(slide, 2);
    }
    public double Volume()
    {
    	return Math.pow(slide, 3);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Ex2 cube1=new Ex2();
        
        double slide;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the slide of cube2:");
        slide=s.nextDouble();
        Ex2 cube2=new Ex2(slide);
     
       
        
	}

}
