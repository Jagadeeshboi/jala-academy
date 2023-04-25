package basic;

public class return_type_int_string {
		private int num;
		public String name;
		public return_type_int_string()
		{
			this.num=25;
			this.name="jagadeesh";
		}
		public int get()
		{
			return this.num;
		}
		public String get1()
		{
			return this.name;
		}
	public static void main(String[] args) {
		return_type_int_string  v=new return_type_int_string ();
		v.get();
		v.get1();

	}

}
