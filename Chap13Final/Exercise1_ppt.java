/*ackage Chap13Final;
abstract class Shape{
	private String color;
	public String getColor() {
		return color;
	}
	abstract double calculateArea();
}
class Triangle extends Shape{
	private double base;
	private double height;
    
	public double calculateArea() {
		return 1/2*(base*height);
	}
}
class Circle{
	private double radius;
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
public class Exercise1_ppt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Triangle tri=new Triangle();
        System.out.print("Enter color:");
        
        System.out.print(tri.calculateArea());
         
	}

}
*/