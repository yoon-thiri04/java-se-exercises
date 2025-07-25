package Chap6;
import java.util.*;
public class Ex17 {
    public void isArmStrong(int num)
    {
    	double sum=0;
    	int k=0;
    	int i=num;
    	int j=num;
    	while(i>0)
    	{
    		int ans=i%10;
    		k++;
    		i/=10;
    	}
    	while(j>0)
    	{
    		int result=j%10;
    		sum+=Math.pow(result,k);
    		j/=10;
    	}
    	if(sum==num)
    	{
    		System.out.print("It is ArmStrong Number.");
    	}
    	else System.out.print("It is not ArmStrong Number.");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex17 Num=new Ex17();
        int num;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        num=s.nextInt();
        Num.isArmStrong(num);

}
}
