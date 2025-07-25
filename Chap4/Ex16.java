package Chap4;
import java.util.*;
import java.text.*;
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dd=new DecimalFormat("0.00");
        CoffeeBag c=new CoffeeBag();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of bag sold:");
        c.bag=s.nextInt();
        System.out.print("Enter weight per bag:");
        c.weight=s.nextDouble();
        System.out.println();
        System.out.println("Number of bag sold: "+c.bag);
        System.out.println("Weight per bag: "+c.weight+"lb");
        System.out.println("Price per pound: $"+c.price_per_lb);
        System.out.println("Sale Tax: "+c.sale_Tax+"%");
        System.out.print("Total price: $ "+dd.format(c.totalWithTax()));
        
	}

}
