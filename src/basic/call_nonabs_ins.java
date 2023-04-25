package basic;
abstract class a
{
	public void show()
	{
		System.out.println("this is non abstract methos");
	}
}
class child extends a
{
	public void call()
	{
		a j=new child();
		j.show();
	}
}
public class call_nonabs_ins {

	public static void main(String[] args) {
		child ch=new child();
		ch.call();

	}

}
