package Chap10;

public class PayScaleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] sum= new double[4];
		double[] avg=new double[4];
         double[][] paySkill= {{10.50,12.00,14.50,16.75,18.00},{20.50,22.25,24.00,26.25,28.00},{34.00,36.50,38.00,40.35,43.00},{50.00,60.00,70.00,80.00,99.99}};
         for(int i=0;i<paySkill.length;i++)
         {
        	 for(int j=0;j<paySkill[i].length;j++)
        	 {
        		 sum[i]+=paySkill[i][j];
        		 
        	 }
        	 avg[i]=sum[i]/paySkill[i].length;
        	 
         }
         for(int k=0;k<paySkill.length;k++)
         {
        	 System.out.println("Average for level"+k+":"+avg[k]);
         }
		
	}

}
