package basic;

public class call_constractor {
	private int x;
	public call_constractor()
	{
		this.x=0;
	}
	public call_constractor(int x)
	{
		this.x=x;
	}
	class b extends call_constractor
	{
		String name;
		public b()
		{
			super();	//call default constractor
			this.name="jagadeesh";
		}
		public b(int x,String name)
		{
			super(x);	//call argument constructor
			this.name="jagadeesh";
		}
	}
	//created method and call them
	public static void main(String[] args) {
		

	}

}
