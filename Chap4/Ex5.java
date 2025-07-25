package Chap4;
import java.util.*;
public class Ex5 {
	  public static final int MAX=6;
	  public static final int MIN=1;
	  int num;
	  Random r;
	  public void roll()
	  {
		  num=r.nextInt((MAX-MIN+1)+MIN);
	  }
	  public int getNum()
	  {
		  return num;
	  }
	  public Ex5()
	  {
		  r=new Random();
		  roll();
		  roll();
		  roll();
	  }
	
	  public static void main(String[] args) {
		  Ex5 Die=new Ex5();
		  System.out.print(Die.getNum());
		  
	  }
	  }
