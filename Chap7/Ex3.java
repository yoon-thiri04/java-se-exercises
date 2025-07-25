package Chap7;
import java.util.*;
class Employee{
	 String name, department,rank,address;
	 double Salary;
	 public Employee(String name,String department,String address,String rank)
	 {
		 this.name=name;
		 this.address=address;
		 this.department=department;
		 this.rank=rank;
	 }
	 public double calculateSalary()
	 {
		 if(rank.equals("Manager"))
		 {
			 Salary=5000+5000/100*20+5000/100*40;	 
		 }
		 else if(rank.equals("Assistant-Manager"))
		 {
			 Salary=4000+4000/100*20+4000/100*40;
		 }
		 else if(rank.equals("Staff"))
		 {
			 Salary=2000+2000/100*20+2000/100*40;
		 }
		 else Salary=-1;
		 return Salary;
	 }
	/* public double rank_salary(String r)
	 {
		 if(r.equals("Manager"))
		 {
			 Salary=5000;
		 }
		 else if(r.equals("Assistant-Manager"))
		 {
			 Salary=4000;
		 }
		 else if(r.equals("Staff"))
		 {
			 Salary=2000;
		 }
		 else Salary=-1;
		 return Salary;
	 }*/
	 public void printDetail()
	 {
		 System.out.println("Name: "+name);
		 System.out.println("Department: "+department);
		 System.out.println("Address: "+address);
		 System.out.println("Rank: "+rank);
		 System.out.println("Salary: "+calculateSalary());
	 }
}
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Employee e1=new Employee("Daw Mya Mya","HR Dept","12,Pyay Road","Manager");
           e1.printDetail();
           Employee e2=new Employee("Daw Aye Aye","SE Dept","13,Mingalardon Road","Assistant-Manager");
           e2.printDetail();
           Employee e3=new Employee("Daw Ni Lar","Eng Dept","34,Taw Win Road","Staff");
           e3.printDetail();
	} 

}
