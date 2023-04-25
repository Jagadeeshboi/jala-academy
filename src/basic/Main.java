package basic;
class lamp
{
	public void jaga()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(i+",");
		}
	}
}

public class Main {
	public static void main(String args[])
	{
		lamp la=new lamp();
		la.jaga();
	}

}
