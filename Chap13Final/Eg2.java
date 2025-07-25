package Chap13Final;
class Vehicle{
	String color="white";
	void move() {
		System.out.println("The vehicle is moving");
	}
}
class Car extends Vehicle{
	String color="Black";
     void speed() {
    	 System.out.println("The car speed is 35km per hours.");
     }
     void showAction() {
    	 super.move();
    	 speed();
    	 
     }
     void PrintColor()
     {
    	 System.out.println(color);
    	 System.out.print(super.color);
     }
}
public class Eg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car c=new Car();
        c.PrintColor();
        c.showAction();
	}

}
