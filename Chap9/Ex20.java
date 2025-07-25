package Chap9;
import java.util.*;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1;
        Scanner s=new Scanner(System.in);
        
        while(true) {
        	System.out.print("Enter a sentence: ");
            str1=s.nextLine();
            if(str1.isEmpty()) break;
            StringTokenizer t=new StringTokenizer(str1);
            System.out.print("Transpones sentence: ");
            while(t.hasMoreTokens())
           {
        	StringBuilder str2=new StringBuilder(t.nextToken());
        	System.out.print(str2.reverse().toString()+" ");
           }
            System.out.println();
        }
   
	}

}
