package Chap12Exercises;
import java.io.*;
import java.util.*;
public class No1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f=new File("No1.txt");
        PrintWriter pw=new PrintWriter(new FileWriter(f));
        Scanner s=new Scanner(System.in);
        String str;
        int count=0;
        
        while(true)
        {
        	System.out.print("Enter a word:");
        	str=s.next();
        	if(str.equalsIgnoreCase("Stop"))
        	{
        		break;
        	}
        	pw.println(str);
        	count++;
        }
        pw.close();
        int length=0,avg;
        /*BufferedReader br=new BufferedReader(new FileReader(f));
        String[] word=new String[count];
        
        for(int i=0;i<count;i++)
        {
        	word[i]=br.readLine();
        	length+=word[i].length();
        }
        String longest=word[0];
        String shortest=word[0];
        for(int i=0;i<count;i++) {
        
        	if(word[i].length()<shortest.length())
        	{
        		shortest=word[i];
        	}
        	if(word[i].length()>longest.length())
        	{
        		longest=word[i];
        	}
        }*/
        Scanner sc=new Scanner(f);
        String str2;
        String[] word1=new String[count];
        int i=0;
        while(sc.hasNext()) {
             word1[i]=sc.nextLine();
             i++;
        }
        String longest=word1[0];
        String shortest=word1[0];
        for(int j=0;j<word1.length;j++)
        {
        	length+=word1[j].length();
        	if(word1[j].length()<shortest.length())
        	{
        		shortest=word1[j];
        	}
        	else if(word1[j].length()>longest.length())
        	{
        		longest=word1[j];
        	}
        }
        
        avg=length/count;
        System.out.println("Longest Word is "+longest);
        System.out.println("Shortest Word is "+shortest);
        System.out.print("Average length of the words: "+avg);
        
        
	}

}
