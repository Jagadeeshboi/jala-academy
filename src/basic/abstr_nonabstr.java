package basic;
abstract class abstractclass
{
	public abstract void abstractmethod();
	public void nonabstarct()
	{
		System.out.println("this is non abstarct ");
	}
}
class combine extends abstractclass
{
    public void abstractmethod() {
        System.out.println("This is the implementation of abstractMethod() in ConcreteClass.");
    }

    // Override non-abstract method
    public void nonabstract() {
        System.out.println("This is the implementation of nonAbstractMethod() in ConcreteClass.");
    }
}
public class abstr_nonabstr {

	public static void main(String[] args) {
		abstractclass c=new combine();
		c.abstractmethod();
		c.nonabstarct();
		combine n=new combine();
		n.abstractmethod();
		n.nonabstarct();

	}

}
