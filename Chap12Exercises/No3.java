package Chap12Exercises;
import java.io.*;

import java.util.*;
public class No3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
        int N,MAX,MIN;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter numbers of integers to generate:");
        N=s.nextInt();
        System.out.print("Enter Maximun integer to generate:");
        MAX=s.nextInt();
        System.out.print("Enter Minimum integer to generate:");
        MIN=s.nextInt();
        File f=new File("integers.dat");
        FileOutputStream o=new FileOutputStream(f);
        byte[] b=new byte[N];
        int random;
        for(int i=0;i<N;i++)
        {
        	random=(int)(Math.random()*MAX)+MIN;
        	b[i]=(byte)random;
        	
        }
        o.write(b);
        o.close();
        byte[] r=new byte[N];
        FileInputStream in=new FileInputStream(f);
        in.read(r);
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
        System.out.println("Largest Random integers is "+largest);
        System.out.println("Samllest Random integers is "+smallest);
        System.out.print("Average of the integers is "+avg);
	}

}
