package Chap5;
import java.util.*;
import java.text.*;

public class Ex13 {
    final double WAGE=7.25;
    double total_sale;
    int worked_hour;
    
    public double calculate_wage()
    {
    	if(worked_hour>40)
    	{
    	   int over_time=worked_hour-40;
    	   double over_time_wage=over_time*7.25*1.5;
    	   double  total=over_time_wage+(40*WAGE);   
    	   return total;
    	}
    	else
    	{
    		return worked_hour*WAGE;
    	}
    }
    public double Total_Wage()
    {
    	if(total_sale>=1.00 && total_sale<=99.99)
    	{
    		return calculate_wage()+total_sale/100*5;
    	}
    	else if(total_sale>=100.00 && total_sale<=299.99)
    	{
    		return calculate_wage()+total_sale/100*10;
    	}
    	else return calculate_wage()+total_sale/100*15;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat dd=new DecimalFormat("0.00");
        Ex13 employee=new Ex13();
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the employee's worked hours:");
        employee.worked_hour=s.nextInt();
        System.out.print("Enter the total sales:");
        employee.total_sale=s.nextDouble();
        System.out.print("The Employee's Total Wage is "+dd.format(employee.Total_Wage()));
	}

}
