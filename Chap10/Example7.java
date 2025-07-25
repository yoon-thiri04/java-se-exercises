package Chap10;
import java.util.*;
public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> major=new HashMap<String,String>();
		String key;
		String value;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.print("Enter your majory key:");
			key=s.next();
			System.out.print("Enter value:");
			value=s.next();
			major.put(key, value);
		}
		for(Map.Entry<String, String> mm:major.entrySet())
		{
			System.out.println(mm.getKey());
			System.out.println(mm.getValue());
		}
		if(major.containsKey("CS-101"))
		{
			System.out.print(true);
		}
		else
		System.out.print(false);

	}

}
