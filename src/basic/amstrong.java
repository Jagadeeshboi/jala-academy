package basic;
import java.util.*;
import java.lang.Math;
public class amstrong {
	public static boolean isamt(int num)
	{
		int temp,digit=0,last=0,sum=0;
		temp=num;
		while(temp>0)
		{
			temp/=10;
			digit++;
		}
		temp=num;
		while(temp>0)
		{
			last=temp%10;
			sum+=(Math.pow(last,digit));
			temp/=10;
		}
		if (num==sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int a;
		 a=sc.nextInt();
		 if(isamt(a))
		 {
			 System.out.print("amstrong");
		 }
		}
		
}
 