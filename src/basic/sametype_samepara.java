package basic;

public class sametype_samepara {
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static double sum(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		
		System.out.println(sum(20,30));
		System.out.println(sum(20.0,50.6));

	}

}
