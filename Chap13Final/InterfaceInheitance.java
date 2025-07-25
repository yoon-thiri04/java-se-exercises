package Chap13Final;
interface Vehicles{
	void drive();
}
interface ar extends Vehicles{
	void hasSeats();
}
class myCar implements ar{
	public void hasSeats() {
		System.out.print("Has Seats");
	}
	public void drive() {
		System.out.print("Driving");
	}
}
public class InterfaceInheitance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          myCar me=new myCar();
          me.hasSeats();
          me.drive();
	}

}
