//Write a program with finally block
package basic;

public class Final_block {

	public static void main(String[] args) {
		int n1=5,n2=0;
		try {
			int re=n1/n2;
			System.out.println("result is"+re);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("this is finall block");
		}

	}

}
