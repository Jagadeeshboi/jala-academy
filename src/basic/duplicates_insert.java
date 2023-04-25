package basic;

import java.util.Arrays;

public class duplicates_insert {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,1,2,3};
		int newarr[]=new int[arr.length];
		 for(int i=0;i<arr.length;i++)
		 {
			 for (int j=i;j<arr.length;j++)
			 {
				 if (arr[i]==arr[j])
				 {
					 System.out.println(arr[i]);

				 }
			 }
			 }
//		 System.out.println(Arrays.toString(newarr));

	}

}
