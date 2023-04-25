package basic;
import java.util.*;
public class specified {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("enter the value of a");
		a=sc.nextInt();
		System.out.println("enter the value of a");
		b=sc.nextInt();
		int arr[]= {11,2,3,4,5,6,4,5,12,23};
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==a || arr[i]==b)
			{
				System.out.println("indexes are carrying elements:"+i);
			}
		}
	}

}
