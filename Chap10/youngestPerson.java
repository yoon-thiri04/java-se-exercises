package Chap10;
import java.util.*;
public class youngestPerson {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Person[] p=new Person[3];
          Scanner s =new Scanner(System.in);
          String name,gender,search;
          int age;
          for(int i=0;i<p.length;i++)
          {
        	  System.out.print("Enter name of person "+(i+1)+":" );
        	  name=s.next();
        	  System.out.print("Enter age :");
        	  age=s.nextInt();
        	  System.out.print("Enter gender:");
        	  gender=s.next();
        	   p[i]=new Person();
        	   p[i].setName(name);
        	   p[i].setAge(age);
        	   p[i].setGender(gender.charAt(0));     
          }
          Person youngest,oldest;
          youngest=p[0];
          oldest=p[0];
          for(int j=0;j<p.length;j++)
          {
        	  if(p[j].getAge()<youngest.getAge())
        	  {
        		  youngest=p[j];
        	  }
        	  else if(p[j].getAge()>oldest.getAge())
        	  {
        		  oldest=p[j];
        	  }
          }
          System.out.println("Youngest Person is "+youngest.getName()+","+youngest.getGender()+","+youngest.getAge());
          System.out.println("Olders Person is "+oldest.getName()+","+oldest.getGender()+","+oldest.getAge());
          System.out.print("Enter name of the person you want to search:");
          search=s.next();
          int k=0;
          while(k<p.length && !p[k].getName().equals(search))
          {
        	k++;
          }
          if(k==p.length)
          {
        	  System.out.print(search+" doesn't exit in the array.");
          }
          else System.out.print(search+" is found at the "+k+" of the person array.");
        		  
	}

}
