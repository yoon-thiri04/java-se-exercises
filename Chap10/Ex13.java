package Chap10;
import java.util.*;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
        double[][] payScale= {{10.50,12.00,14.50,16.75,18.00},{20.50,22.25,24.00,26.25,28.00},{34.00,36.50,38.00,40.35,43.00},{50.00,60.00,70.00,80.00,99.99}};
        double[] avg=new double[4];
        double[] sum=new double[4];
        for( i=0;i<payScale.length;i++)
        {
        	for( j=0;j<payScale[i].length;j++)
        	{
        		sum[i]+=payScale[i][j];
        	}
        	avg[i]=sum[i]/payScale[i].length;
        }
        for(int k=0;k<payScale.length;k++)
        {
       	 System.out.println("Average for level-"+k+" = "+avg[k]);
        }
		
        double[] sum2=new double[5];
        double[] avg2=new double[5];
        for( i=0;i<payScale[0].length;i++)
        {
        	for( j=0;j<payScale.length;j++)
        	{
        		sum2[i]+=payScale[j][i];
        	}
        	avg2[i]=sum2[i]/payScale.length;
        }
        for(int k=0;k<payScale[0].length;k++)
        { 
       	 System.out.println("Average for Step-"+k+" = "+avg2[k]);
        }
	
	}

}
