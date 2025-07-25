package Chap10;
import java.util.*;
public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
       int[][] number=new int[4][5];
      for(int i=0;i<number.length;i++)
      {
    	  for(int j=0;j<number[i].length;j++)
    	  {
    		  System.out.print("Enter a num for TwoD array:");
    		  number[i][j]=s.nextInt();
    	  }
      }
      for(int i=0;i<number.length;i++)
      {
    	  for(int j=0;j<number[i].length;j++)
    	  {
    		  System.out.println(number[i][j]);
    	  }
      }
        
	}

}
