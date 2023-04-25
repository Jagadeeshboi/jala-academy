package basic;
import java.util.*;
public class pallindrome {

	public static void main(String[] args) {
		int a,rev=0,rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		int b=a;
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
		}
		if (b==rev)
			System.out.println(b+"is pallindrome number");

	}

}
