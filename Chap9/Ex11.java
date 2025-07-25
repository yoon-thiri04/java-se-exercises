package Chap9;
import java.util.*;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str;
        char ch;
        int a=0,e=0,i=0,o=0,u=0;
        while(true)
        {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a sentence:");
        str=s.nextLine();
        if(str.isEmpty()) break;
        for(int j=0;j<str.length();j++)
        {
        	ch=str.charAt(j);
        	if(ch=='a') a++;
        	if(ch=='e') e++;
        	if(ch=='i') i++;
        	if(ch=='o') o++;
        	if(ch=='u') u++;
        	
        }
        System.out.println("Volwel counts for sentence:");
        System.out.println("# of 'a' : "+a);
        System.out.println("# of 'e' : "+e);
        System.out.println("# of 'i' : "+i);
        System.out.println("# of 'o' : "+o);
        System.out.println("# of 'u' : "+u);
	}
	}
}
