package Chap9;
import java.util.*;
public class countJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String word;
        int java_count=0;
        Scanner s=new Scanner(System.in);
        while(true) {
        System.out.print("Enter a setence:");
        word=s.next();
        if(word.equalsIgnoreCase("stop"))
        {
        	break;
        }
        else if(word.equalsIgnoreCase("Java"))
        {
        	 java_count++;
        }
        }
        System.out.print(java_count);
	}

}
