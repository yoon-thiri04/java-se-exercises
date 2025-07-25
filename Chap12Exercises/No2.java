package Chap12Exercises;
import java.io.*;
import java.util.*;
public class No2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
        File f=new File("No2.txt");
        ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream(f));
        ArrayList<String> word=new ArrayList<String>();
        Scanner s=new Scanner(System.in);
        String str;
        while(true)
        {
        	System.out.print("Enter a word:");
        	str=s.next();
        	if(str.equalsIgnoreCase("Stop"))
        	{
        		break;
        	}
        	word.add(str);
        	
        }
        o.writeObject(word);
        o.close();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream(f));
        ArrayList<String> word1=(ArrayList<String>) in.readObject();
        String shortest=word1.get(0);
        String longest=word1.get(0);
        int length=0,avg;
        for(int i=0;i<word1.size();i++)
        {
        	length+=word1.get(i).length();
        	if(word1.get(i).length()<shortest.length())
        	{
        		shortest=word1.get(i);
        	}
        	else if(word1.get(i).length()>longest.length())
        	{
        		longest=word1.get(i);
        	}
        }
        avg=length/word1.size();
        System.out.println("Longest word is "+longest);
        System.out.println("Shortest word is "+shortest);
        System.out.print("Average length of the word is "+avg);
        
	}

}
