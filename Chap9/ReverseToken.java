package Chap9;
import java.util.*;

public class ReverseToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
        String str;
        Scanner s=new Scanner(System.in);
        while(true) {
        System.out.print("Enter a senetence:");
        str=s.nextLine();
        if(str.isEmpty()) break;
        StringTokenizer st=new StringTokenizer(str," ");
        System.out.print("The transponse sentence is ");
        while(st.hasMoreTokens())
        {
        	StringBuffer sb=new StringBuffer(st.nextToken());
        	sb.reverse();
        	System.out.print(sb.toString()+" ");
        	
        }
        System.out.println();
        }
        StringBuffer buf=new StringBuffer("Lisa");
        StringBuffer b1;
        b1=buf;
        System.out.print(b1.insert(0,buf));	}

}
