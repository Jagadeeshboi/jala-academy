package basic;

public class numberformate_exception {

	public static void main(String[] args) {
		String name="abc";
		try
		{
			int num=Integer.parseInt(name);
		}
		catch( NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
