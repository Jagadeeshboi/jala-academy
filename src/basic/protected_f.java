package basic;
class s
{
	protected int feild;
	protected String name;
	protected void show()
	{
		System.out.println("this protected method");
	}
}
public class protected_f {

	public static void main(String[] args) {
		s a =new s();
		a.feild=25;
		a.name="jala";
		System.out.println(a.feild);
		System.out.println(a.name);
		a.show();
	}

}
