package Chap10;
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int size;
         double sum=0;
         Scanner scan=new Scanner(System.in);
         System.out.print("Enter array size:");
         size=scan.nextInt();
         int[] N=new int[size];
         for(int i=0;i<N.length;i++)
         {
        	 System.out.print("Enter x"+(i+1)+":");
        	 N[i]=scan.nextInt();
        	 sum+=N[i];
         }
         double x=sum/N.length;
         double s,result=0;
         for(int j=0;j<N.length;j++)
         {
        	 result+=Math.pow((N[j]-x),2);
         }
         s=Math.sqrt(result/N.length);
         System.out.print("Standard Deviation s is "+s);
         
         
	}

}
