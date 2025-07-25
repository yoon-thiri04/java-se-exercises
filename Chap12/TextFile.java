package Chap12;
import java.io.*;

public class TextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        int random;
        //File file=new File("TextFile.txt");
        PrintWriter pw=new PrintWriter(new FileWriter("sample1.txt"));
        for(int i=1;i<=10;i++)
        {
        	random=(int)(Math.random()*100)+1;
        	pw.println("Random number #"+i+":"+random);
       }
        pw.close();
	}

}
 