package basic;

import java.util.Arrays;

public class second_large {

	public static void main(String[] args) {
		int arr[]= {2,4,1,5,3,4,2,1,5,6,3,4};
		int l=arr.length;
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<l-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("the second largest number is :"+arr[l-2]);
	}

}
