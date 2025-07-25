package Chap8;
import java.io.FileInputStream;
public class CheckedEg {
    public static void openfile(String filename)
    {
    	try {
    		FileInputStream f=new FileInputStream(filename);
    		
    		
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
    	System.out.print("File not found Example");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        openfile("textfile.txt");
	}

}
