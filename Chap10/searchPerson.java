package Chap10;
import java.util.*;
public class searchPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p=new Person[4];
		String name;
		int age;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<p.length;i++)
		{
			System.out.print("Enter name of person "+(i+1)+": ");
			name=s.next();
			System.out.print("Enter age of person "+(i+1)+": ");
			age=s.nextInt();
			p[i]=new Person();
			p[i].setAge(age);
			p[i].setName(name);
		}
		Person youngest=p[0];
		Person oldest=p[0];
		for(int j=0;j<p.length;j++)
		{
			if(youngest.getAge()>p[j].getAge())
			{
				youngest=p[j];
			}
			else if(oldest.getAge()<p[j].getAge())
			{
				oldest=p[j];
			}
		}
		System.out.println(oldest.getName()+" is the oldest person, "+"age is "+oldest.getAge() );
		System.out.println(youngest.getName()+" is the youngest person, "+"age is "+youngest.getAge() );
		System.out.print("Enter person name you want to find:");
		String search_person=s.next();
	    
	    int k=0;
	    while( k<p.length && !p[k].getName().equals(search_person))
	    {
	        k++;
	    }
	    if(k==p.length)
	    {
	    	System.out.print("Your search person dones't find in the array.");
	    }
	    else System.out.print(search_person+" is found at the "+k+" of the person array.");
		
		
	}
}
