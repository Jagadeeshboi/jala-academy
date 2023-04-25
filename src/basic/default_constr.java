 package basic;

public class default_constr {
		private int x;
		private int y;
		public default_constr ()
		{
			x=0;
			y=0;
		}
		public default_constr (int x)
		{
			this.x=x;
			y=0;
		}
		public default_constr (int x,int y)
		{
			this.x=x;
			this.y=y;
		}
		public int getx()
		{
			return x;
		}
		public int gety()
		{
			return y;
		}
	public static void main(String[] args) {
		default_constr  d=new default_constr ();
		System.out.println("the x value is"+d.getx()+" "+d.gety());
		default_constr d1=new default_constr (5);
		System.out.println("the x value is"+d1.getx()+" "+d1.gety());
		default_constr d2=new default_constr (5,25);
		System.out.println("the x value is"+d2.getx()+" "+d2.gety());
	}

} 
