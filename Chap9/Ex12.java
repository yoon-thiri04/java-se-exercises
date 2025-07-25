package Chap9;
import java.util.*;

import java.util.regex.*;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        String dna;
        
        StringBuilder rna=new StringBuilder();
        Pattern p=Pattern.compile("T",Pattern.CASE_INSENSITIVE);
        while(true)
        {
           System.out.print("Enter DNA sequence:");
           dna=s.nextLine();
           if(dna.equalsIgnoreCase("Stop")) break;
           Matcher m=p.matcher(dna);
           while(m.find())
          {
        	m.appendReplacement(rna,"U");
          }
          m.appendTail(rna);
          System.out.println("RNA sequence is:"+rna);
	  }
        Pattern p1=Pattern.compile("A",Pattern.CASE_INSENSITIVE);
	  }

}
