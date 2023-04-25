package basic;
class D
{
	void show()
	{
		System.out.println("i am show");
	}
	void display()
	{
		System.out.println("i am display");
	}
	void c()
	{
		System.out.println("i am c");
	}
}
class E extends D
{
	void  show1()
	{
		System.out.println("i am show1");
	}
	void display1()
	{
		System.out.println("i am display1");
	}
	void c()
	{
		System.out.println("i am c1");
	}
}
class F extends E
{
	void  show2()
	{
		System.out.println("i am shoq2");
	}
	void display2()
	{
		System.out.println("i am display2");
	}
	void c()
	{
		System.out.println("i am c2");
	}	
}
public class threeclass_me {

	public static void main(String[] args) {
		D a=new D();
		a.c();
		E b=new E();
		b.c();
		F F=new F();
		F.c();
 
	}

}
