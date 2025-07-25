package Chap9;
import java.util.*;
public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=1;
        
        int b=0;
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of fabonacci to generate N>=1:");
        n=s.nextInt();
        System.out.println("The first "+n+" fabonacci sequences are ");
        int ans=0;
        for(int i=0;i<n;i++)
        {
        	ans=a+b;
        	a=b;
        	b=ans;
        	System.out.println("F"+(i+1)+" = "+ans);
        	
        	
        }
	}

}
