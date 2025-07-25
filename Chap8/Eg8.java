package Chap8;
import java.io.*;
public class Eg8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         FileWriter file=new FileWriter("D:\\Data1.txt");
         file.write("Hello");
         file.close();
	}

}
