package Chap13Final;
interface S{
	String color="red";//public static final
	void drawable();
	}
class rectangle implements S{
	
	public void drawable() {
		System.out.print("Draw a rectangle.");
	}
}
class circle implements S{
	public void drawable() {
		System.out.print("Draw a circle.");
	}
}
public class Eg6Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         rectangle r=new rectangle();
         System.out.print("Color is "+r.color);
         r.drawable();
         circle c=new circle();
         System.out.print("Color is "+c.color);
         c.drawable();
         
	}

}
