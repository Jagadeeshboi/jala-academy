//Create an interface with a default method and implement it in a class. Do not provide 
//implementation to the default method and call the method.


package basic;
interface jala
{
	public void mymethod();
	default void display()
	{
		System.out.println("this is default method");
	}
}
class academy implements jala
{
	public void mymethod()
	{
		System.out.println("implemeted here");
	}
}

public class default_met {

	public static void main(String[] args) {
		jala j=new academy();
		j.mymethod();
		j.display();

	}

}
