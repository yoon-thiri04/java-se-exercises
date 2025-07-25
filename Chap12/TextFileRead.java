package Chap12;
import java.io.*;
public class TextFileRead {

	public static void main(String[] args){
		// TODO Auto-generated method stub
       try {
		File file=new File("sample1.txt");
        BufferedReader bf=new BufferedReader(new FileReader(file));
        String str="";
        while((str=bf.readLine())!=null)
        {
        	System.out.println(str);
        }
        bf.close();
       }catch(IOException e)
       {
    	   System.out.print("Unexcepted Error occured");
       }
	}

}
