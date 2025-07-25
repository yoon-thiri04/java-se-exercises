package Chap6;
import java.util.*;
public class Ex13 {
     public static void main(String[] args)
     {
    	 Date start_time=new Date();
    	 int N;
    	 Scanner s=new Scanner(System.in);
    	 System.out.print("Enter a number N>2:");
    	 N=s.nextInt();
    	 int i,j,k=0;
    	 boolean ans=true;
    	 for(j=2;j<=N;j++)
    	 {
    		  ans=true;
    		  for(i=2;i<=j-1;i++)
    		  {
    			  if(j%i==0)
    			  {
    				  ans=false;
    			  }
    		  }
    		  if(ans==true)
    		  {
    			  k++;
    		  }
    	 }
    	 System.out.println("There are "+k+" prime numbers between 2 and "+N);
    	 Date end_time=new Date();
    	 long ElapsedTime=end_time.getTime()-start_time.getTime();
    	 System.out.print("Elapsed Time is "+ElapsedTime+" million seconds");
    	 
	}

}
