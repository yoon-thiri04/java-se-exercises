package Chap9;

public class Example {
	
    public static void concat1(String s1)
    {
    	s1+="University";
    }
    public static void concat2(StringBuffer s1)
    {
    	s1.append("University,Yangon");
    }
    public static void concat3(StringBuilder s1)
    {
    	s1.append("University");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="Java";
       String s2="Language";
       String fun="Java";
       double f=10.55;
      /* concat1(s);
       System.out.println("String1="+s);
       StringBuffer s1=new StringBuffer(s);
       concat2(s1);
       System.out.println("String2="+s1);
       StringBuilder s2=new StringBuilder("Computer");
       concat3(s2);
       System.out.println("String3="+s2);
       String s3=s.replace("Com","p");
       System.out.print(s3);*/
       System.out.println(s.compareTo(s2));
       System.out.println(String.valueOf(f));
       StringBuffer st=new StringBuffer("java");
       System.out.println(st.capacity());
       System.out.println(st.append("programming"));
      st.setCharAt(1, 'G');
      System.out.print(st);
       
	}

}
