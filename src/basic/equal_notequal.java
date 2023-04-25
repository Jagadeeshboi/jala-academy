package basic;

import java.util.Scanner;

public class equal_notequal {

	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
		if (a!=b)
			System.out.println("the values or not equal");
		else if (a==b)
			System.out.println("the values are equal");
		else
			System.out.println("error occur");
			

	}

}
