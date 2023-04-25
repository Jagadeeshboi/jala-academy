package basic;
import java.util.*;

public class even_odd {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a;
			System.out.println("enter the value of a");
			a=sc.nextInt();
			if (a%2==0)
				System.out.println("a is even number");
			else
				System.out.println("a is odd number");
	}

}
