package Chap4;

public class Circle {
double r_inner,r_outer;
	
	public void setRadii(double r_I,double r_O)
	{
		r_inner=r_I;
		r_outer=r_O;
	}
	public Circle(double r_I,double r_O)
	{
		r_inner=r_I;
		r_outer=r_O;
	}
	public Circle()
	{
		
	}
	public double Area()
	{
		return (Math.PI*Math.pow(r_outer, 2))-(Math.PI*Math.pow(r_inner, 2));
		
	}
	public double Circum()
	{
		return (2*Math.PI*r_outer)-(2*Math.PI*r_inner);
	}
}
