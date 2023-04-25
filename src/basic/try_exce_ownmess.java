package basic;

public class try_exce_ownmess {

	public static void main(String[] args) {
		try
		{
			throw new Exception("my own message is this");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
