package Chap8;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
	    System.out.print("Enter a name:");
	    try {
	    	n=s.nextInt();
	    }
	    catch(InputMismatchException e)
	    {
	    	e.printStackTrace();
	    }
	    finally {
	    	System.out.println("Bye");
	    }
	}

}
