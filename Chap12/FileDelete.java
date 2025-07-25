package Chap12;
import java.io.*;
public class FileDelete {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
       File f=new File("sample1.txt");
       if(f.delete())
       {
    	   System.out.print("Deleted the file:"+f.getName());
       }
       else System.out.print("Fail to delete");
	}

}
