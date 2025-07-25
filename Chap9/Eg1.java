package Chap9;

import java.util.*;
import java.util.regex.*;

public class Eg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /* StringBuffer word1,word2;
      word1=new StringBuffer("Lisa");
      word2=word1;
      word2.insert(0, "Mona");
      System.out.println(word1);
      StringBuffer text=new StringBuffer();
      /*Pattern p=Pattern.compile("is",Pattern.CASE_INSENSITIVE);
      String[] str=p.split(text);
      for(String s:str)
      {
    	  System.out.print(s+" ");
      }
     Pattern p1=Pattern.compile("\\s+");
     Matcher m=p1.matcher("This    is   my  first  time   n them.");
     while(m.find())
     {
    	 m.appendReplacement(text," ");
     }
     m.appendTail(text);
     System.out.println(text.toString());
     String sr1;
     StringTokenizer st=new StringTokenizer("University Of Computer Studies");
     while(st.hasMoreElements())
     {
    	sr1=st.nextToken();
    	StringBuilder sb=new StringBuilder(sr1);
    	sb.reverse();
    	System.out.print(sb+" ");
    	
     }*/
		/*String text3="redisyellowIsgreenisblue";
		Pattern p1=Pattern.compile("is", Pattern.CASE_INSENSITIVE);    
		String [] result=p1.split(text3);
		for(String s: result)
		{
			System.out.print(s+" ");
		}*/
		int sum=0;
		int j=0;
		do {
			j++;
			for(int i=5;i>j;i--)
			{
				sum+=(i+j);
			}
		}while(j<11);
		System.out.print(sum);
	}

}
