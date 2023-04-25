package basic;
import java.util.*;
public class multiplecatch_blocks {

	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		try
		{
			int result=n1/n2;
			System.out.println("result is "+result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("error ocuured"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("message error ocuured"+e.getMessage());
		}

	}

}
 