//Create a PRIVATE or PROTECTED interface and print the values as above scenario

package basic;

public class private_protected {
	protected interface pro
	{
		public int feild=25;
		public String name="jala";
		public void method();
	}
	static class name implements pro
	{
		public void method()
		{
			System.out.println("implementd here");
		}
	}

	public static void main(String[] args) {
		name n=new name();
		System.out.println(pro.feild);
		System.out.println(pro.name);
		n.method();

	}

}
