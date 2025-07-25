package Chap12Exercises;
import java.util.*;
import java.io.*;
class Book{
	String title;
	int edition;
	double price;
	public Book(String title,int edition,double price)
	{
		this.title=title;
		this.edition=edition;
		this.price=price;
	}
}
public class No5 {
  
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	   
       File f=new File("D:\\YoonThiri\\JavaCS\\yoonJava\\src\\book.txt");
       BufferedReader br=new BufferedReader(new FileReader(f));
       String str="";
       String name="";
       int edition=0;
       double price=0;
       ArrayList<Book> bList=new ArrayList<Book>();
       str=br.readLine();
       while(str!=null)
       {
    	   StringTokenizer st=new StringTokenizer(str,"*");
    	   if(st.hasMoreTokens()) {
    		   name=st.nextToken();
    	   }
    	   if(st.hasMoreTokens())
    	   {
    		   edition=Integer.parseInt(st.nextToken());
    	   }
    	   if(st.hasMoreTokens())
    	   {
    		   price=Double.parseDouble(st.nextToken());
    	   }
    	   Book b=new Book(name,edition,price);
    	   bList.add(b);
    	   str=br.readLine();
       }
       br.close();
       for(Book b1:bList)
       {
    	   System.out.println(b1.title+" "+b1.edition+" "+b1.price);
       }
      
	}

}
