package Exam;

public class ExChap10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double[][] payScale= {{10.50,12.00,14.50,16.75,18.00},{20.50,22.25,24.00,26.25,28.00},{34.00,36.50,38.00,40.35,43.00},{50.00,60.00,70.00,80.00,99.99}};
        /* double[] sum=new double[4];
         double[] avg=new double[4];
         //For grade
         for(int i=0;i<payScale.length;i++)
         {
        	 for(int j=0;j<payScale[i].length;j++)
        	 {
        		 sum[i]+=payScale[i][j];
        	 }
        	 avg[i]=sum[i]/payScale[i].length;
         }
         int i=0;
         for(double average:avg)
         {
        	 System.out.println("Average of grade level "+i+" Employees "+average );
        	 i++;
         }*/
         double[] sum=new double[5];
         double[] avg=new double[5];
         for(int i=0;i<payScale[0].length;i++)
         {
        	for( int j=0;j<payScale.length;j++)
        	{
        		sum[i]+=payScale[j][i];
        	}
        	avg[i]=sum[i]/payScale.length;
         }
         for(int k=0;k<payScale[0].length;k++)
         {
        	 System.out.println("Average of step level"+k+"Employee :"+avg[k]);
        	 
         }
         
        
 	
         
	}

}
