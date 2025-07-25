package Chap5;
import java.util.*;
public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int pow;
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter the power of 10:");
        pow=s.nextInt();
        switch(pow)
        {
        case 6:System.out.print("It's One Million.");break;
        case 9:System.out.print("It's One Billion.");break;
        case 12:System.out.print("It's One Trillion");break;
        case 15:System.out.print("It's One Quadrillion");break;
        case 18:System.out.print("It's One Quintillion.");break;
        case 21:System.out.print("It's One Sextillion.");break;
        case 30:System.out.print("It's One Nonillion.");break;
        case 100:System.out.print("It's One Googol.");break;
        default:System.out.print("Out of range.");
        }
        
	}

}
