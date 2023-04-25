// Create an interface with private, public and protected fields.

package basic;

public class pu_pri_pro {
	interface academy
	{
	    public static final int PUBLIC_CONSTANT = 42;
	     static final String PROTECTED_STRING = "This is a protected string";
	     static  int DEFAULT_INT = 123;

	    public void publicMethod();
//	    protected void protectedMethod();
	    private  void defaultMethod() {
	    	
	    } 
	    
	}

	public static void main(String[] args) {
		

	}

}
