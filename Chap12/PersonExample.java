package Chap12;
import java.io.*;
class Person implements Serializable{
	String name;
	int age;
	char gender;
	public Person(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public void showInfo()
	{
		System.out.println("Name is "+name+" Age is "+age+" Gender is "+gender);
	}
}
public class PersonExample {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		// TODO Auto-generated method stub
         File f=new File("person.txt");
         ObjectOutputStream obj1=new ObjectOutputStream(new FileOutputStream(f));
         Person p1,p2;
         p1=new Person("Kyaw",23,'M');
         p2=new Person("Aye",20,'F');
         obj1.writeObject(p1);
         obj1.writeObject(p2);
         obj1.close();
         
         ObjectInputStream obj2=new ObjectInputStream(new FileInputStream(f));
         Person pp1=(Person)obj2.readObject();
         Person pp2=(Person)obj2.readObject();
         obj2.close();
         pp1.showInfo();
         pp2.showInfo();
	}

}
