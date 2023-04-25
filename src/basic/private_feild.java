package basic;
class superclass
{
	private int feild;
	protected void setvalue()
	{
		System.out.println("setting the values");
	}
	protected int getval(int val)
	{
		 feild=val;
		 return feild;
	}
	
}
class subclass extends superclass
{
	void access()
	{
		int f=getval(45);
		System.out.println(f);
		setvalue();

		
	}
}
public class private_feild {

	public static void main(String[] args) {
		subclass s=new subclass();
		s.access();


	}

}
