package basic;
import java.util.*;
public class prime {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		for (int i=3;i<=a;i++)
		{
			if (a%i==0)
				System.out.println(a+"is not prime");
			else
				System.out.println(a+"prime number");
				break;
		}
	}

}
