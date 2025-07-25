package Chap7;
import java.util.*;
public class Ex1 {
    double a,b;
    public Ex1 fadd(Ex1 f1,Ex1 f2)
    {
    	Ex1 ans=new Ex1();
    	ans.a=f1.a*f2.b+f1.b*f2.a;
    	ans.b=f1.b*f2.b;
    	return ans;
    }
    public Ex1 fsub(Ex1 f1,Ex1 f2)
    {
    	Ex1 ans=new Ex1();
    	ans.a=f1.a*f2.b-f1.b*f2.a;
    	ans.b=f1.b*f2.b;
    	return ans;
    }
    public Ex1 fmul(Ex1 f1,Ex1 f2)
    {
    	Ex1 ans=new Ex1();
    	ans.a=f1.a*f2.a;
    	ans.b=f1.b*f2.b;
    	return ans;
    }
    public Ex1 fdiv(Ex1 f1,Ex1 f2)
    {
    	Ex1 ans=new Ex1();
    	ans.a=f1.a*f2.b;
    	ans.b=f1.b*f2.a;
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f1,f2,op,yn;
        Ex1 obj1=new Ex1();
        Scanner s=new Scanner(System.in);
        do{
        System.out.print("Enter first fraction:");
        f1=s.next();
        String p[]=f1.split("/");
        obj1.a=Integer.parseInt(p[0]);
        obj1.b=Integer.parseInt(p[1]);
        
        System.out.print("Enter an operator:");
        op=s.next();
        
        Ex1 obj2=new Ex1();
        System.out.print("Enter second fraction:");
        f2=s.next();
        String q[]=f2.split("/");
        obj2.a=Integer.parseInt(q[0]);
        obj2.b=Integer.parseInt(q[1]);
        Ex1 obj3=new Ex1();
        
        switch(op)
        {
        case "+":obj3=obj3.fadd(obj1, obj2);
        	     System.out.println("Answer= "+obj3.a+"/"+obj3.b);break;
        case "-":obj3=obj3.fsub(obj1, obj2);
                 System.out.println("Answer= "+obj3.a+"/"+obj3.b);break;
        case "/":obj3=obj3.fdiv(obj1, obj2);
                 System.out.println("Answer= "+obj3.a+"/"+obj3.b);break;
        case "*":obj3=obj3.fmul(obj1, obj2);
                 System.out.println("Answer= "+obj3.a+"/"+obj3.b);break;
        default :System.out.println("Invalid Operator.");	    
        }
        System.out.print("Do you want to continue(y/n)?:");
        yn=s.next();
        }while(yn.equals("y"));  
        /*if u use  if,else if to condition the operator, use ".equals "method*/
        
	}

}
