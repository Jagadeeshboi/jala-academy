package basic;

public class static_var_inme {
		static int num=509;		//static var
		public void show()	//instance method
		{
			System.out.println(num);
		}
	public static void main(String[] args) {
		
		static_var_inme j=new static_var_inme();
		j.show();
	}

}
