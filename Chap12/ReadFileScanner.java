package Chap12;
import java.io.*;
import java.util.*;
public class ReadFileScanner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File file=new File("sample1.txt");
        Scanner s=new Scanner(file);
        String str="";
        while(s.hasNext())
        {
        	str=s.nextLine();
        	System.out.print(str);
        }
        s.close();
	}

}
