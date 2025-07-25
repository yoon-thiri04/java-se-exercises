package Chap4;

public class CoffeeBag {
		public  final double price_per_lb=5.99;
		public final double sale_Tax=7.25;
		double weight;
		int bag;
		public double totalWithTax()
		{
			double total=weight*bag*price_per_lb;
			return total+total/100*sale_Tax;
		}
	}

