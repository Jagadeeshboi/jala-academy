package basic;
class customerexc extends Exception
{
	public customerexc(String me)
	{
		super(me);
	}
}
public class own_exce {

	public static void main(String[] args) {
		try {
			throw new customerexc("your own exception");
		}
		catch (customerexc e)
		{
			System.out.print(e.getMessage());
		}

	}

}
