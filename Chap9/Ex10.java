package Chap9;
import java.util.*;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String str;
        while(true) {
        	
        System.out.print("Enter a sentence:");
        str=s.nextLine();
        
        if(str.isEmpty()) break;
        StringBuilder stb=new StringBuilder(str);
        System.out.println(stb.reverse().toString());
        }
       
        
	}

}
