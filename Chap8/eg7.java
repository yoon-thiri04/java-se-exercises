package Chap8;
import java.util.*;
public class eg7 {
	
    public void myMethod(int num)throws ArithmeticException,NullPointerException,InputMismatchException{
    	int res=num/3;
    	System.out.print(res);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        eg7 num=new eg7();
        Scanner s=new Scanner(System.in);
        
        try {
        	System.out.print("Enter a String:");
            int st=s.nextInt();
        	num.myMethod(st);
        }catch(ArithmeticException e) {
        	e.printStackTrace();
        }
        catch(NullPointerException e1)
        {
        	System.out.println(e1);
        }
        catch(InputMismatchException e2)
        {
        	System.out.println(e2);
        }
        finally {
        	System.out.println("Happy");
        }
	}

}
