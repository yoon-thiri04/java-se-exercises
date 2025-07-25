package Chap10;
import java.util.*;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> N=new ArrayList<Integer>();
        int size;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter an array size:");
        size=scan.nextInt();
        int num;
        double sum=0;
        for(int i=0;i<size;i++)
        {
        	System.out.print("Enter num"+(i+1)+":");
        	num=scan.nextInt();
        	N.add(num);
        }
        for(int Num:N)
        {
        	sum+=Num;
        }
        double x=sum/N.size();
        double result=0;
        for(int Num:N)
        {
        	result+=Math.pow((Num-x),2);
        }
        double s=Math.sqrt(result/N.size());
        System.out.print("Standard Deviation s is "+s);
	}

}
