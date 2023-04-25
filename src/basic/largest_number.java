package basic;
import java.util.*;

public class largest_number {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of b");
		b=sc.nextInt();
		System.out.println("enter the value of c");
		c=sc.nextInt();
		if (a>b && a>c)
			System.out.println(a+" is bigger");
		else if (b>a &&b>c)
			System.out.println(b+" is bigger");
		else
			System.out.println(c+" is bigger");
			
		
	}

}
