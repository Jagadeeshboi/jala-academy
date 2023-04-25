// Create a PUBLIC interface with fields and methods, fields should have values assigned. 
//Implement this interface to some class and print the values of the interface fields and 
//call the interface methods

package basic;
interface interf
{
	public static final int MY_CONSTANT = 42;
	public String name="jagadeesh";
	public void show();
}
class cls implements interf
{
	public void show()
	{
		System.out.println("implemenetd here");
	}
}
public class public_interface {

	public static void main(String[] args) {
		cls cl=new cls();
		System.out.println("MY_CONSTANT = " + interf.MY_CONSTANT);
        System.out.println("MY_STRING = " + interf.name);
        cl.show();

	}

}
