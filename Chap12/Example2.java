package Chap12;
import java.io.*;
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   File file=new File("sample.txt");
    	   FileOutputStream out=new FileOutputStream(file);
    	  byte[] data= {97,98,99,100,101};
    	  out.write(data);
    	  out.close();
       }catch(IOException e)
       {
    	   System.err.print(e.getMessage());
       }
	}

}
