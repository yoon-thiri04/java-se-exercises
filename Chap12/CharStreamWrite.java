package Chap12;
import java.io.*;
public class CharStreamWrite {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 FileWriter writer=null;
      try {
    	  File file=new File("input.txt");
    	  writer=new FileWriter(file);
    	  char[] chars= {'a','e','i','o','u'};
    	  writer.write(chars);
    	  
    	  System.out.print("Data sucessfully written in file.");
      }
      finally {
    	  if(writer!=null)
    	  {
    		  writer.close();
    	  }
      }
	}

}
