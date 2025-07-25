package Chap13Final;
import java.util.*;
class Student{
	protected final int NUM_OF_TEST=3;
	protected String name;
	protected int[] test=new int[3];
	protected String courseGrade="";
	
	public Student()
	{
		this("No Name");
	}
	public Student(String name)
	{
		this.name=name;
	}
	public String getCourseGrade() {
		return courseGrade;
		
	}
	public String getName()
	{
		return name;
	}
	public int getTestScore(int t)
	{
		return test[t-1];
	}
	public void setName(String str)
	{
		this.name=str;
	}
	public void setTestScore(int testN,int score)
	{
		test[testN-1]=score;
	}
	public void computeCourseGrade()
	{
		
	}
}
class underGraduate extends Student{
	public underGraduate()
	{
		super();
	}
	public underGraduate(String name)
	{
		super(name);
	}
	public void computeCourseGrade()
	{
		int total=0;
	  for(int i=0;i<NUM_OF_TEST;i++)
	  {
		  total+=test[i];
	  }
	  if(total/NUM_OF_TEST>=70)
	  {
		  courseGrade="Pass";
	  }
	  else courseGrade="Fail";
	}
}
class graduate extends Student{
	public graduate()
	{
		super();
	}
	public graduate(String name)
	{
		super(name);
	}
	public void computeCourseGrade() {
		int total=0;
		for(int i=0;i<NUM_OF_TEST;i++)
		{
			total+=test[i];
		}
		if(total/NUM_OF_TEST>=80)
		{
			courseGrade="Pass";
		}
		else courseGrade="Fail";
	}
}
class graduate1 extends Student{
	public graduate1() {
		super();
	}
	public graduate1(String name)
	{
		super(name);
	}
	public void computeCourseGrade() {
		int total=0;
		for(int i=0;i<NUM_OF_TEST;i++)
		{
			total+=test[i];
		}
		if(total/NUM_OF_TEST>=80)
		{
			courseGrade="Pass";
		}
		else courseGrade="Fail";
	}
}
public class Undergraduate1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student[] stu=new Student[40];
        String type;
        Scanner s=new Scanner(System.in);
        
        for(int i=0;i<stu.length;i++)
        { 
        	System.out.print("Enter Student type 'U' or 'G' :");
        	type=s.next();
        	if(type.equalsIgnoreCase("Stop"))
        	{
        		break;
        	}
        	if(type.equalsIgnoreCase("U"))
        	{
        		String name;
        		int test1,test2,test3;
        		stu[i]=new underGraduate();
        		System.out.print("Enter name:");
        		name=s.next();
        		stu[i].setName(name);
        		System.out.print("Enter score for test 1:");
        		test1=s.nextInt();
        		stu[i].setTestScore(1, test1);
        		System.out.print("Enter score form test 2:");
        		test2=s.nextInt();
        		stu[i].setTestScore(2, test2);
        		System.out.print("Enter score for test 3:");
        		test3=s.nextInt();
        		stu[i].setTestScore(3, test3);
        		
        			stu[i].computeCourseGrade();
        	
        		
        			System.out.println("The student name is "+stu[i].getName()
        	        		+" Test score are "+stu[i].getTestScore(1)+" "+
        	        		stu[i].getTestScore(2)+" "+stu[i].getTestScore(3)+"  The result is "
        	        		+stu[i].getCourseGrade());
        		
        	}
        	else if(type.equalsIgnoreCase("G"))
        	{
        		String name;
        		int t1,t2,t3;
        		stu[i]=new graduate1();
        		System.out.print("Enter name:");
        		name=s.next();
        		stu[i].setName(name);
        		System.out.print("Enter score for test 1:");
        		t1=s.nextInt();
        		System.out.print("Enter score for test 2:");
        		t2=s.nextInt();
        		System.out.print("Enter score for test 3:");
        		t3=s.nextInt();
        		stu[i].setTestScore(1, t1);
        		stu[i].setTestScore(2, t2);
        		stu[i].setTestScore(3, t3);
        		stu[i].computeCourseGrade();
        		System.out.println("The student name is "+stu[i].getName()
        		+" Test score are "+stu[i].getTestScore(1)+" "+
        		stu[i].getTestScore(2)+" "+stu[i].getTestScore(3)+"  The result is "
        		+stu[i].getCourseGrade());
        		
        }
        }
	}

}
