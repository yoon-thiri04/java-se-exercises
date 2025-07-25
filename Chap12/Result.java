package Chap12;
import java.io.*;
import java.util.*;
class Student implements Serializable{
	String name;
	int roll;
	int sub1,sub2,sub3;
	public Student(int roll,String name,int sub1,int sub2,int sub3)
	{
		this.name=name;
		this.roll=roll;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
}
public class Result {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
        File f=new File("D:\\YoonThiri\\JavaCS\\yoonJava\\src\\exam.txt");
        BufferedReader br=new BufferedReader(new FileReader(f));
        String name="";
        int roll=0,sub1=0,sub2=0,sub3=0;
        String str="";
        str=br.readLine();
        Student[] stu=new Student[10];
        int num=0;
        while(str!=null)
        {
        	StringTokenizer s=new StringTokenizer(str,"#");
        	if(s.hasMoreTokens())
        	{
        		roll=Integer.parseInt(s.nextToken());
        	}
        	if(s.hasMoreTokens())
        	{
        		name=s.nextToken();
        	}
        	if(s.hasMoreTokens())
        	{
        		sub1=Integer.parseInt(s.nextToken());
        		
        	}
        	if(s.hasMoreTokens())
        	{
        		sub2=Integer.parseInt(s.nextToken());
        	}
        	if(s.hasMoreTokens())
        	{
        		sub3=Integer.parseInt(s.nextToken());
        	}
        	stu[num++]=new Student(roll,name,sub1,sub2,sub3);
        	str=br.readLine();
        }
        br.close();
        PrintWriter pw=new PrintWriter(new FileWriter("result.txt"));
        double[] avg=new double[stu.length];
       for(int i=0;i<num;i++)
        {
    	    if(stu[i].sub1>=80 && stu[i].sub2>=80 && stu[i].sub3>=80 )
       	{
       		pw.println(stu[i].roll+"-"+stu[i].name+"=>"+" pass with distinction.");
       	}
           else if(stu[i].sub1>=65 && stu[i].sub2>=65 && stu[i].sub3>=65 )
        	{
        		pw.println(stu[i].roll+"-"+stu[i].name+"=>"+" pass.");
        	}
        	
        	else if(stu[i].sub1>=50 && stu[i].sub2>=50 && stu[i].sub3>=50 )
        	{
        		pw.println(stu[i].roll+"-"+stu[i].name+"=>"+" pass with credit.");
        	}
        	
        }
        pw.close();
	}

}
