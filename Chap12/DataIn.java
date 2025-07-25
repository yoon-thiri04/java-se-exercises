package Chap12;
import java.io.*;
public class DataIn {

	public static void main(String[] args) throws IOException {
	 File file=new File("sample1.txt");
	 FileInputStream in=new FileInputStream(file);
	 DataInputStream inDate=new DataInputStream(in);
	 System.out.print(inDate.readInt());
	 System.out.print(inDate.readDouble());
	 System.out.print(inDate.readChar());
	 inDate.close();
	}

}
