package basic;

public class call_constr_mul {
	private int j;
	public call_constr_mul(int num)
	{
		this.j=num;
		System.out.println(this.j=num);
	}
	public int get()
	{
		return j;
	}

	public static void main(String[] args) {
		call_constr_mul m=new call_constr_mul(25);
		System.out.println(m.get());
//		System.out.println(m.call_constr_mul(30));

	}

}
	