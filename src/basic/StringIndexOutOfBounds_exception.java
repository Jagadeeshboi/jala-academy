package basic;

public class StringIndexOutOfBounds_exception {

	public static void main(String[] args) {
		String name="jala academy";
		try
		{
			System.out.println(name.charAt(20));
		}
		catch( StringIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
