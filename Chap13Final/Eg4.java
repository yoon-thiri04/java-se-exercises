package Chap13Final;

public class Eg4 {
	void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("The sum is "+c);
	}
    void sum(int a,int b,int c)
    {
    	int sum=a+b+c;
    	System.out.println("The sum is "+sum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Eg4 obj=new Eg4();
          obj.sum(3, 5);
          obj.sum(4, 9, 1);
	}

}
