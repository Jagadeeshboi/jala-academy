  package basic;

public class constructor_of_the_parent_class {
		private int number;
		private String name;
		public constructor_of_the_parent_class(int number,String name)
		{
			this.name=name;
			this.number=number;
		}
		class child extends constructor_of_the_parent_class
		{
			private int y;
			public child(int number,String name,int y)
			{
			super(number,name);
			this.y=y;
			}
			
		}
	public static void main(String[] args) {
//		child ch=new child(45,"jaga",65);
//		ch.dosomething();
		

	}

}
