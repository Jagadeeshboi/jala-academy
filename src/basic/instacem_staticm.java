package basic;

public class instacem_staticm {
	public static void show()	//static method
	{
		int number=256;
		System.out.println(number);
	}
	void show1()	//instance method
	{
		instacem_staticm.show();	//calling static method in instance method
	}

	public static void main(String[] args) {
		
		instacem_staticm v=new instacem_staticm();
		v.show1();

	}

}
