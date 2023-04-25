package basic;
public class instacem_static_me {
	public void show()
	{
		String name="jagadeesh boina";	//instance variable
		System.out.println(name);
	}
	public static void display(instacem_static_me d)
	{
		d.show();//instance method in static
	}
	public static void main(String[] args) {
		instacem_static_me s=new instacem_static_me();
		instacem_static_me.display(s);

	}

}
