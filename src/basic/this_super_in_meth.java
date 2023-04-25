package basic;

public class this_super_in_meth {
		private int num;
		private String name;
		public this_super_in_meth(int num,String name)
		{
			this.num=num;
			this.name=name;
		}
		public void dosomething()
		{
			this.dosomething();
		}
		class name extends this_super_in_meth
		{
			private int n;
			public name(int n,int num,String name)
			{
				super(num,name);
				this.n=n;
			}
			public void dosomething()
			{
				super.dosomething();
			}
		}
	public static void main(String[] args) {
//		name n=new name(45,56,"jaga");
//		n.dosomething();

	}

}
