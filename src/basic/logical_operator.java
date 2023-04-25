package basic;
import java.util.*;

public class logical_operator {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a value");
		a=sc.nextInt();
		System.out.println("enter the value of B");
		b=sc.nextInt();
		if (a>10 && b>10)
			System.out.println(a+"and "+b+"are greater than 10");
		else if(a>20 || b>20)
			System.out.println(a+"and "+b+"are positive numbers");
		else if(a!=b)
			System.out.println(a+"not equal to"+b);
		
	}

}
