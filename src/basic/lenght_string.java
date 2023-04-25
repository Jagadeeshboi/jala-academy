package basic;

public class lenght_string {

	public static void main(String[] args) {
		String name="jala academy";
		System.out.println("The lenght of the string is"+name.length());
		int c=0;
		for(int i=0;i<name.length();i++)
		{
			c+=name.charAt(i);
		}
		System.out.println(c);

	}

}
