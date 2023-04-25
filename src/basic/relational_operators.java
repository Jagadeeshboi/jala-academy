package basic;
import java.util.*;
public class relational_operators {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		if (a==b)
			System.out.println("the numbers are equal");
		else if(a>b)
			System.out.println(a+"is greater");
		else if(a<b)
			System.out.println(b+"is greater");

	}

}
