package basic;
import java.util.*;
public class arthematic {
	public static int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	public static int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public static int div(int a,int b)
	{
		int c=a/b;
		return c;
	}

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		System.out.println(add(a,b));
		System.out.println(sub(a,b));
		System.out.println(mul(a,b));
		System.out.println(div(a,b));
		
	}

}
