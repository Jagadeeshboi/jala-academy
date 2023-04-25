package basic;

public class same_type_datatype {
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		int x=40;
		int y=50;
		int z=65;
		System.out.println(sum(x,y));
		System.out.println(sum(x,y,z));

	}

}
