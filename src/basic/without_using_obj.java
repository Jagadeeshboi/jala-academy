//Print the fields/instance members of the current class using this and without using object
package basic;
class mycl
{
	private int k;
	private String name;
	public void  call(int k,String name)
	{
		System.out.println(this.k);
		System.out.println(this.name);
	}
}

public class without_using_obj {

	public static void main(String[] args) {
		mycl m=new mycl();
		m.call(45,"jaga");

	}

}
 