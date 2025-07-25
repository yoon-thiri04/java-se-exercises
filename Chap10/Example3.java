package Chap10;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double[] rainfall=new double[12];
        String[] month= {"J","F","M","A","MA","June","July","Au","Sep","Oct","Nov","Dec"};
        Scanner s=new Scanner(System.in);
        double sum=0.0,avg;
        for(int i=0;i<rainfall.length;i++)
        {
        	System.out.print("Rainfall for "+month[i]+":");
        	rainfall[i]=s.nextDouble();
        	sum+=rainfall[i];
        }
        avg=sum/rainfall.length;
        System.out.print("Average Rainfall:"+avg);
	}

}
