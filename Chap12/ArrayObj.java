/*package Chap12;
import java.io.*;
public class ArrayObj {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
         Person per1,per2,per3;
         File f=new File("array.txt");
         ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(f));
         per1=new Person("Aye",20,'F');
         per2=new Person("Yoon",19,'F');
         per3=new Person("Toe",18,'M');
         obj.writeObject(per1);
         obj.writeObject(per2);
         obj.writeObject(per3);
         obj.close();
         ObjectInputStream obj2=new ObjectInputStream(new FileInputStream(f));
         Person pp1=(Person) obj2.readObject();
         Person pp2=(Person) obj2.readObject();
         Person pp3=(Person) obj2.readObject();
         System.out.print(pp1.name+" "+pp1.age);
	}

}*/
