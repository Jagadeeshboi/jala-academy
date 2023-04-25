package basic;

public class nosuch_method {

	public static void main(String[] args) {
		try {
		Class<?> cls=nosuch_method.class;
		cls.getDeclaredMethod("nonExistentMethod");
		}
		catch(NoSuchMethodException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
