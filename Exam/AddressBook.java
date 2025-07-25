package Exam;
import java.util.*;
class Person{
	String name;
	String address;
	char gender;
	int age;
	public Person(String name,int age,char gender,String address)
	{
		this.name=name;
		this.address=address;
		this.gender=gender;
		this.age=age;
	}
}

public class AddressBook{
     ArrayList<Person> person=new ArrayList<Person>();
     Scanner s;
     public void add() {
    	 String name,address,gender;
    	 int age;
    	 s=new Scanner(System.in);
    	 
    	 System.out.print("Enter name:");
    	 name=s.next();
    	 System.out.print("Enter age:");
    	 age=s.nextInt();
    	 System.out.print("Enter address:");
    	 address=s.next();
    	 System.out.print("Enter gender:");
    	 gender=s.next();
    	 Person p=new Person(name,age,gender.charAt(0),address);
    	 person.add(p);
     }
     public void display(int i) {
    	 System.out.println("Name is "+person.get(i).name);
    	 System.out.println("Age is "+person.get(i).age);
    	 System.out.println("Address is "+person.get(i).address);
    	 System.out.println("Gender is "+person.get(i).gender);
     }
     public void search() {
    	 String n;
    	 System.out.print("Enter name you want to search:");
    	 n=s.next();
    	 if(person.size()==0) {
    		 System.out.print("The arraylist is null");
    	 }
    	 int i;
    	 for( i=0;i<person.size();i++)
    	 {
    		 if(n.equals(person.get(i).name))
           {
	          System.out.print("The person is found at "+i+"position of the arrayllist");
	          display(i);
	          break;
           }
    	 }
    	 if(i==person.size())
    	 {
    		 System.out.print(n+" doesn't exist in the arrayList");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AddressBook b=new AddressBook();
        
        for(int j=0;j<3;j++)
        {
        	b.add();
        }
        for(int i=0;i<3;i++)
        {
        	b.display(i);
        }
        b.search();
	}

}
