package basic;
public class ins_var_instatic {
	
	int s=256;		//instance variable
	public static void show(ins_var_instatic k)	//static method
	{
		System.out.println(k.s);
	}

	public static void main(String[] args) {
		
		ins_var_instatic j=new ins_var_instatic();
		ins_var_instatic.show(j);
	}

}
