package basic;
interface Interface
{
	void dosomething();
}
class myclass implements Interface
{
	public void dosomething()
	{
		System.out.println("hello");

	}
}

public class interface_cr {

	public static void main(String[] args) {
		myclass m=new myclass();
		m.dosomething();
	}

}
