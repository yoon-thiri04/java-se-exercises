package Chap10;
import java.util.*;
public class Example5 {

	public static int search_min(int num[])
	{
		int number=num[0];
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<number)
			{
				number=num[i];
			}
		}
		return number;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]=new int[6];
		Scanner s=new Scanner(System.in);
		for(int j=0;j<number.length;j++)
		{
			System.out.print("Enter number"+(j+1)+":");
			number[j]=s.nextInt();
		}
        int num=search_min(number);
        System.out.print("Enter Minimum number is "+num);
	}

}
