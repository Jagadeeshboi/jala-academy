package basic;

public class operators {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("sum of the two numbers is"+add(a,b));
		System.out.println("subtraction of two numbers is"+sub(a,b));
		System.out.println("multiplication of two numbers is"+mul(a,b));
		System.out.println("division of two numbers is"+div(a,b));

	}

	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{		return a/b;
	}
}
