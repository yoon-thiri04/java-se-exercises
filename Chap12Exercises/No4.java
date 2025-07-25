package Chap12Exercises;
import java.io.*;
import java.util.*;
public class No4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       File f=new File("integers.txt");
       Scanner s=new Scanner(System.in);
       int N,max,min,random=0;
       System.out.print("Enter number of integers to generate:");
       N=s.nextInt();
       System.out.print("Enter maximum number to generate:");
       max=s.nextInt();
       System.out.print("Enter minimum number to generate:");
       min=s.nextInt();
       PrintWriter pw=new PrintWriter(new FileWriter(f));
       for(int i=0;i<N;i++)
       {
    	   random=(int)(Math.random()*max)+min;
    	   pw.println(random);
       }
       pw.close();
       BufferedReader br=new BufferedReader(new FileReader(f));
       int[] r=new int[N];
       for(int i=0;i<N;i++)
       {
    	   r[i]=Integer.parseInt(br.readLine());
       }
       int smallest=r[0];
       int largest=r[0];
       int sum=0,avg;
       for(int i=0;i<r.length;i++)
       {
    	   sum+=r[i];
    	   if(r[i]<smallest)
    	   {
    		   smallest=r[i];
    	   }
    	   else if(r[i]>largest)
    	   {
    		   largest=r[i];
    	   }
       }
       avg=sum/r.length;
       System.out.print("Largest Number is "+largest);
       System.out.print("Smallest Number is "+smallest);
       System.out.print("Average is "+avg);
       
	}

}
