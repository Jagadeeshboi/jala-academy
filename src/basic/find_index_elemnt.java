package basic;
import java.util.*;

public class find_index_elemnt {
	public static int find(int arr[],int k)
	{
		int i=0,l=arr.length;
		while(i<l)
		{
			if(arr[i]==k)
			{
				return i;
			}
				i++;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8};
		int k;
		System.out.println("enter the value");
		Scanner sc=new Scanner(System.in); 
		k=sc.nextInt();
		int c=find(arr,k);
		System.out.print("The index number is"+c);

	}

	
}
