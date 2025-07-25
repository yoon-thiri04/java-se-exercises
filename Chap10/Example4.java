package Chap10;
import java.util.*;
import java.util.regex.*;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Person[] p=new Person[3];
		String name;
		for(int i=0;i<p.length;i++)
		{
			System.out.print("Enter name:");
			name=s.next();
			p[i]=new Person();
			p[i].setName(name);
		}
		for(Person p2:p)
		{
			System.out.print(p2.getName());
		}
	}

}
