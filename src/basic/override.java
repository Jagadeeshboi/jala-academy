package basic;
 class animal
{
	void eat()
	{
		System.out.println("i am eating");
	}
	void drink()
	{
		System.out.println("i am drinking");
	}
}
class Cat extends animal
{
	@Override
	void eat()
	{
		System.out.println("cat,i am eating");
	}
	@Override
	void drink()
	{

		System.out.println("cat,i am eating");
	}
}
public class override {


	public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();
        myCat.drink();

        animal myAnimal =new animal();        
        myAnimal.eat();
        myAnimal.drink();

	}

}
