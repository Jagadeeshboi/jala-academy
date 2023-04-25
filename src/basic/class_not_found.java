package basic;

public class class_not_found {

	public static void main(String[] args) {
		try
		{
			Class.forName("class doesnot exsists");

		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
