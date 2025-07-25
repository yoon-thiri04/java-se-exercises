package Chap13Final;
abstract class Animal{
	abstract void speak();
	void move() {
		System.out.print("The animal is moving.");
	}
}
class Dog extends Animal{

	@Override
	void speak() {
		System.out.println("Woff Woff ");
		
	}
	
}
class Bird extends Animal{
	void speak() {
		System.out.println("Pikyi Pikyi");
	}
}
public class myAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Dog d=new Dog();
         d.speak();
         d.move();
         Bird b=new Bird();
         b.speak();
         b.move();
	}

}
