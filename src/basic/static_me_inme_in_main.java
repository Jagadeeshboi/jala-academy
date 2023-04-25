package basic;

public class static_me_inme_in_main {
	public static void show()	//static method
	{
		System.out.println("hello every one");
	}
	public void show1()		//instance method
	{
		System.out.println("My name is jagadeesh");
	}
	public static void main(String[] args) {
		static_me_inme_in_main j=new static_me_inme_in_main();
		j.show1();
		static_me_inme_in_main.show();
		
	}

}
