package Chap13Final;
interface Additions{
	void sum(int num1,int num2);
}
interface Subtraction{
	void sub(int num1,int num2);
}
class Calculator implements Additions,Subtraction{
	public void sum(int num1,int num2) {
		System.out.print(num1+num2);
	}
	public void sub(int num1,int num2)
	{
		System.out.print(num1-num2);
	}
	
}
public class Eg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator cal=new Calculator();
        cal.sub(5, 2);
        cal.sum(3 , 2);
	}

}
