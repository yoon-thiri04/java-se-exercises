package Chap9;
import java.util.*;
import java.util.regex.*;
public class Ex20next {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner s=new Scanner(System.in);
		Pattern p=Pattern.compile("\\s");
		while(true) {
		   System.out.print("Enter a sentence: ");
		   str=s.nextLine();
		   if(str.isEmpty()) break;
		   String[] str2=p.split(str);
		   
		   System.out.print("Transposes sentence:");
	      
		    for(String st:str2)
		    {
			StringBuilder str3=new StringBuilder(st);
			System.out.print(str3.reverse()+" ");
		    }
		    System.out.println();
		
		}  
	}

}
