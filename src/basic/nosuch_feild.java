package basic;

public class nosuch_feild {
		private int  feild=45;
	public static void main(String[] args) {
		
		try
		{
			Class<?> cls=nosuch_feild.class;
			cls.getDeclaredField("no such feild exists");
		}
		catch(NoSuchFieldException e)
		{
			System.out.println(e.getMessage());
		}
		 

	}

}
