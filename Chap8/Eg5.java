package Chap8;
import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       try {
    	   int array[]=new int[5];
    	   array[3]=100/0;
       }
       catch(ArithmeticException e1)
       {
    	   e1.printStackTrace();
       }
       /*catch(ArrayIndexOutOfBoundsException e2)
       {
    	   e2.printStackTrace();
       }*/
	}

}
