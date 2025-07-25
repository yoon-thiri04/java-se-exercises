package Chap6;
import java.util.*;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int N;
        int a=1,b=0,ans=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number N>=1:");
        N=s.nextInt();
        System.out.print("The first "+N+" fibonacci sequences are:");
        for(int i=1;i<=N;i++)
        {
        	b=a;
        	a=ans;
        	ans=a+b;
        	System.out.print(" "+ans);
        }
	}

}
