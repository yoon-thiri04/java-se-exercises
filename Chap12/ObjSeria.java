/*package Chap12;
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
}
public class ObjSeria {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
          File f=new File("sample.txt");
          ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(f));
          Person p=new Person("Aye",20,'F');
          obj.writeObject(p);
	}

}*/
