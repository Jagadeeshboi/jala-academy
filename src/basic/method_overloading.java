package basic;

public class method_overloading {

	public static void show(int n,String name)
	{
		System.out.println("printing the values are"+n+name);
	}
	public static void show(int n,int na)
	{
		System.out.println("printing the values are"+n+na);
	}

	public static void main(String[] args) {
		
		show(25, "jagadeesh");
		show(56, 509);

	}

}
 