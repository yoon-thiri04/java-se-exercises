package Chap8;
import java.io.FileInputStream;

import java.util.*;
public class Eg6 {
    public static void openfile(String filename)
    {
    	try {
    	FileInputStream f=new FileInputStream(filename);
    	}catch(Exception e)
    	{
    		System.out.print(e);
    	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		try {
			try {
				int num=100/0;
			}catch(ArithmeticException e)
			{
				e.printStackTrace();
				
			}
			try {
				String str=null;
				System.out.print(str.charAt(10));
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.print(e1.getMessage());
			}
			catch(StringIndexOutOfBoundsException e2)
			{
				System.out.println(e2);
			}
			finally {
				System.out.println("1 of Two Exceptions.");
			}
			try {
				int[] a=new int[10];
				a[11]=34;
			}
			catch(ArrayIndexOutOfBoundsException e3)
			{
				e3.printStackTrace();
			}
			
           try {
           String str=null;
           System.out.print(str.length());
           }catch(StringIndexOutOfBoundsException e5)
           {
        	   System.out.print(e5.getMessage());
           }
           try {
        	   String str2="Yoon";
        	   System.out.print(str2.charAt(10));
           }
           catch(Exception e6)
           {
        	   System.out.println(e6.getLocalizedMessage());
           }
           finally {
        	   System.out.println("3 of Two Exceptions.");
           }
          
         FileInputStream f=new FileInputStream("Stress.txt");
        	   
        }catch(ArithmeticException r) {
				System.out.println(r.getLocalizedMessage());
			}
			catch(Exception t)
			{
				t.printStackTrace();
			}finally {
				System.out.println("Last Exception.");
			}
		try {
			Scanner s=new Scanner(System.in);
			int a[]=new int[8];
			System.out.print("Enter your name:");
			a[2]=s.nextInt();
			
		}
		catch(InputMismatchException e4)
         {
         e4.printStackTrace();
       }finally {
    	   System.out.println("2 of Two Exceptions.");
       }
	
			

		}
     
    	 
     }
	


     
	
 


