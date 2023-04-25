package basic;
import java.util.*;
public class logical_not {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		if (a>10 &&b>10)
		{
			System.out.println(a+"and"+b+"are greter than 10");
		}
		else if (a>10 || b>10)
		{
			System.out.println("either of greter than 10");
		}
		else
		{
			System.out.println("is equal");
		}

	}

}
