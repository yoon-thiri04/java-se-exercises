package Chap4;
import java.util.*;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num_seatA,num_seatB,num_seatC;
       double price_per_A,price_per_B,price_per_C,total;
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the number of seat A and price per seat A:");
       num_seatA=s.nextInt();
       price_per_A=s.nextDouble();
       System.out.print("Enter the number of seat B and price per seat B:");
       num_seatB=s.nextInt();
       price_per_B=s.nextDouble();
       System.out.print("Enter the number of seat C and price per seat C:");
       num_seatC=s.nextInt();
       price_per_C=s.nextDouble();
       total=num_seatA*price_per_A+num_seatB*price_per_B+num_seatC*price_per_C;
       System.out.print("The total ticket sales of a concert="+total);
       
       
	}

}
