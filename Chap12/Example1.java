package Chap12;
import java.io.*;
public class Example1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File obj=new File("D:\\doc");
       System.out.println("File:"+obj.getName()+(obj.isFile()?"is a file":"is a named pipe"));
       System.out.println("Size: "+obj.length());
       System.out.println("Path:"+obj.getPath());
       System.out.println("Absolute Path:"+obj.getAbsolutePath());
       System.out.println("File was last modified "+obj.lastModified());
       System.out.println("My file exits?"+(obj.exists()?" is exists":"is not exists"));
       System.out.println("Can read?"+(obj.canRead()?"can read":"can not read"));
       System.out.println("Is a directory?"+(obj.isDirectory()?"is directory.":"is not directory"));
	}

}
