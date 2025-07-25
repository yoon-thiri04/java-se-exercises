package Chap10;
import java.util.*;
public class Example6 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> fruit=new ArrayList<String>();
        fruit.add("Mango");
        fruit.add("Apple");
        fruit.add("Orange");
        
        fruit.remove(2);
        for(String a:fruit)
        {
        	System.out.println(a);
        }
        System.out.print(fruit.size());
        ArrayList<Integer> num=new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        int N;
        for(int i=0;i<4;i++)
        {
        	System.out.print("Enter a number:");
        	N=s.nextInt();
        	num.add(N);
        }
        System.out.println(num.size());
        for(Integer a:num)
        {
        	System.out.println(a);
        }
        List<Person> pList=new ArrayList<Person>();
        Person p=new Person("Su Su",20,'F');
        pList.add(p);
        p=new Person("Aung",45,'M');
        pList.add(p);
        p=new Person("Oak",18,'M');
        pList.add(p);
        for(Person p1:pList)
        {
        	System.out.println(p1.getName()+"  "+p1.getAge()+" "+p1.getGender());
        }
        /*Person[] p=new Person[2];
        for(int i=0;i<p.length;i++)
        {
        	System.out.print("Enter name:");
        	String name=s.next();
        	System.out.print("Enter age:");
        	int age=s.nextInt();
        	System.out.print("Enter gender:");
        	String gender=s.next();
        	p[i]=new Person();
        	p[i].setName(name);
            p[i].setAge(age);
            p[i].setGender(gender.charAt(0));
            pList.add(p[i]);
        }
        for(Person pp:pList)
        {
        	System.out.print("Name is "+pp.getName()+" , Age is "+pp.getAge()+" , Gender is "+pp.getGender());
        }*/
	}

}
