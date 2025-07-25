//package Chap13Final;
//import java.util.*;
//
//class Student{
//	protected final int NUM_OF_TEST=3;
//	protected String name;
//	protected int[] test=new int[3];
//	protected String courseGrade="";
//	
//	public Student()
//	{
//		this("No Name");
//	}
//	public Student(String name)
//	{
//		this.name=name;
//	}
//	public String getCourseGrade() {
//		return courseGrade;
//		
//	}
//	public String getName()
//	{
//		return name;
//	}
//	public int getTestScore(int t)
//	{
//		return test[t-1];
//	}
//	public void setName(String str)
//	{
//		this.name=str;
//	}
//	public void setTestScore(int t,int score)
//	{
//		test[t-1]=score;
//	}
//	public void computerCourseGrade()
//	{
//		
//	}
//}
//class underGraduate extends Student{
//	public underGraduate()
//	{
//		super();
//	}
//	public underGraduate(String name)
//	{
//		super(name);
//	}
//	public void computeCourseGrade()
//	{
//		int total=0;
//	  for(int i=0;i<NUM_OF_TEST;i++)
//	  {
//		  total+=test[i];
//	  }
//	  if(total/NUM_OF_TEST>=70)
//	  {
//		  courseGrade="Pass";
//	  }
//	  else courseGrade="Fail";
//	}
//}
//class UnderG extends Student{
//	public UnderG()
//	{
//		super();
//	}
//	public UnderG(String name)
//	{
//		super(name);
//	}
//	public void computeGrader()
//	{
//		int total=0;
//		for(int i=0;i<NUM_OF_TEST;i++)
//		{
//			total+=test[i];
//		}
//		if(total/NUM_OF_TEST>=80)
//		{
//			courseGrade="Pass";
//		}
//		else courseGrade="Fail";
//	}
//}
//public class UnderG {
//    
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        Student[] stu=new Student[40];
//        String type;
//        Scanner s=new Scanner(System.in);
//        
//        for(int i=0;i<stu.length;i++)
//        {
//        	System.out.print("Enter student type 'U' for UnderGraduate and 'G' for Graduate:");
//            type=s.next();
//            if(type.equalsIgnoreCase("Stop"))
//            {
//            	break;
//            }
//        	if(type.equalsIgnoreCase("U"))
//        	{
//        		String name;
//        		int test1,test2,test3;
//        		stu[i]=new underGraduate();
//        		System.out.print("Enter name:");
//        		name=s.next();
//        		stu[i].setName(name);
//        		System.out.print("Enter score for test 1:");
//        		test1=s.nextInt();
//        		stu[i].setTestScore(1, test1);
//        		System.out.print("Enter score form test 2:");
//        		test2=s.nextInt();
//        		stu[i].setTestScore(2, test2);
//        		System.out.print("Enter score for test 3:");
//        		test3=s.nextInt();
//        		stu[i].setTestScore(3, test3);
//        		stu[i].computerCourseGrade();
//        		System.out.println("The student name is "+stu[i].getName()+
//        		"Test 1 mark is "+stu[i].getTestScore(1)+"\nTest 2 mark is "+
//        		stu[i].getTestScore(2)+"\nTest 3 Mark is "+stu[i].getTestScore(3));
//        		System.out.print("The result is "+stu[i].getCourseGrade());
//        		
//        	}
//        }
//	}
//
//}
//
