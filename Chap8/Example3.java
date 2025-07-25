package Chap8;


import java.util.Scanner;

public class Example3 {
    public void number(int num)
    {
    	try {
    		num=num/0;
    	}
    	catch(ArithmeticException e)
    	{
    		e.printStackTrace();
    	}
    	finally{
    		System.out.println("Finally Executed");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Example3 N=new Example3();
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=scan.nextInt();
        N.number(num);
	}

}
