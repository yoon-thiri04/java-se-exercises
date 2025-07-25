package Chap10;
import java.util.*;
public class Person {
        private int age;
        private char gender;
        private String name;
        public void setAge(int age)
        {
        	this.age=age;
        }
        public int getAge()
        {
        	return age;
        }
        public void setGender(char gender)
        {
        	this.gender=gender;
        }
        public char getGender()
        {
        	return gender;
        }
        public void setName(String name)
        {
        	this.name=name;
        }
        public String getName()
        {
        	return name;
        }
        public Person(String name,int age,char gender)
        {
        	this.name=name;
        	this.age=age;
        	this.gender=gender;
        }
        public Person() {
        	
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person[] p=new Person[3];
        Scanner s=new Scanner(System.in);
        String name,gender;
        char ch;
        int age;
        for(int i=0;i<p.length;i++)
        {
        	
        	System.out.print("Enter name:");
        	name=s.next();
        	System.out.print("Enter age:");
        	age=s.nextInt();
        	System.out.print("Enter Gender:");
        	gender=s.next();
        	ch=gender.charAt(0);
        	p[i]=new Person();
        	
        	p[i].setName(name);
        	p[i].setAge(age);
        	p[i].setGender(ch);
        	
        	System.out.println("Name is "+p[i].getName());
        	System.out.println("Age is "+p[i].getAge());
        	System.out.println("Gender is "+p[i].getGender());
        }
	}

}
