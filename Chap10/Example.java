package Chap10;
import java.util.*;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] rainfall=new double[12];
        double sum=0.0;
        Scanner s=new Scanner(System.in);
        for(int i=0;i<12;i++)
        {
        	System.out.print("RainFall for month "+(i+1));
        	rainfall[i]=s.nextDouble();
        	sum+=rainfall[i];
        }
        System.out.print("Average Rainfall:"+sum/12);
	}

}
