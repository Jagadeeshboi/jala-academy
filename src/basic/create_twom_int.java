package basic;

interface z
{
	void show();
	void display();
}
class newclass implements z
{
	public void show()
	{
		System.out.print("here is the implemantation starts");
	}
	public void display()
	{
		
	}
}
public class create_twom_int {

	public static void main(String[] args) {
		newclass l=new newclass();
		l.show();

	}

}
