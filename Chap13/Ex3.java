package Chap13;
class Animal{
	  public void move() {
		  System.out.print("Animals Move");
	  }
	  public void makeSound()
	  {
		  System.out.println("Animals making sound");
	  }
}
class Bird extends Animal{
	public void move() {
		System.out.print("Flying");
	}
	public void makeSound()
	{
		System.out.println("pikyi pikyi");
	}
}
class Panthera extends Animal{
	public void move()
	{
		System.out.print("Walking");
	}
	public void makeSound()
	{
		System.out.println("woung woung");
	}
}
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal A=new Animal();
        Animal bird=new Bird();
        Animal panthera=new Panthera();
        System.out.print("Bird: ");
        bird.move();
        System.out.print(" , ");
        bird.makeSound();
        System.out.print("Panthera: ");
        panthera.move();
        System.out.print(" , ");
        panthera.makeSound();
	}

}
