package Chap8;



public class Eg4 {
    public void method1()
    {
    	try {
    		method2();
    	}catch(Exception e)
    	{
    	  e.printStackTrace();
    	}
    	finally {
    		System.out.println("Finally");
    	}
    }
    public void method2()
    {
    	method3();
    }
    public void method3()
    {
    	String str="Yoon";
    	System.out.print(str.charAt(10));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Eg4 Num=new Eg4();
         Num.method1();
	}

}
