package Chap12;
import java.io.*;
public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  File file=new File("sample.txt");
    	  FileInputStream in=new FileInputStream(file);
    	  byte[] data=new byte[(int)file.length()];
    	  in.read(data);
    	  in.close();
    	  for(int i=0;i<data.length;i++)
    	  {
    		  System.out.print((char)data[i]);
    	  }
      }catch(IOException e)
      {
    	  System.err.print(e.getMessage());
      }
	}

}
