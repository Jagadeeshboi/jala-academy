package basic;

public class without_try {
	public static void dosomething() throws Exception
	{
		System.out.println("something went wrong");
	}

	public static void main(String[] args)throws Exception {
		dosomething();
		System.out.println("program completed");
		
	}

}
