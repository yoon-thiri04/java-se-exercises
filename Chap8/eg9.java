package Chap8;

public class eg9 {
    public static void chekage(int num) throws ArithmeticException{
    	if(num<18)
    	{
    		throw new ArithmeticException("Access Denied");
    	}
    	else System.out.println("You are  old enough");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       chekage(13);
	}

}
