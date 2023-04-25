package basic;

class car
{
	static int n=25;	//static variable
	int name=50; 		//instance variable
	public void show()		//instance method
	{
		System.out.println(n+" "+name);
	}
	public static void show1(car s)		//static method
	{
		System.out.println(n+" "+s.name);
	}
}
public class static_instance_var {

	public static void main(String[] args) {
		car c=new car();
		c.show();
		car.show1(c);	//static method accessing
	}

}
 