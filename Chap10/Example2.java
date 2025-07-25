package Chap10;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double[] rainfall= {2.3,4.4,44.5,33,44,22,33,45,67,12,34,56};
       String[] month= {"January","February","March","April","May","June","July","August"
    		   ,"September","October","November","December"};
       double sumq,avg;
       double[] qRainfall=new double[4];
       for(int i=0;i<4;i++)
       {
    	   sumq=0;
    	   for(int j=0;j<3;j++)
    	   {
    		   sumq+=rainfall[i*3+j];
    	   }
    	   avg=sumq/3;
    	   qRainfall[i]=avg;
       }
       for(int k=0;k<qRainfall.length;k++)
       {
    	   System.out.println("Each quarter Average Rainfall:"+qRainfall[k]);
       }
	}
}


