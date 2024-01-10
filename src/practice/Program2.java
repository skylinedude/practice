package practice;


public class Program2 {
	public static void main(String args[])
	{
	int a=0,b=1,c,i,count;
	System.out.println("a is"+a);
	System.out.println("b is"+b);
	for(i=2;i<=4;i++)
	{
		c=a+b;
		System.out.println("c is"+c);
		a=b;
		b=c;
		
	}
	}
}
