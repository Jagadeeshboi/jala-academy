package basic;
import java.util.Arrays;
public class remove_element {
	public static int[] remove(int arr[],int k)
	{
		if(arr==null|| k<0 || k>arr.length)
		{
			return arr;
		}
		int newarr[]=new int[arr.length-1];
		for(int i=0,s=0;i<arr.length;i++)
		{
			if(i==k)
			{
				continue;
			}
			newarr[s++]=arr[i];
			
		}
		return newarr;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,6,4,5,6,7};
		int k=0;
		arr=remove(arr,k);
		System.out.println( Arrays.toString(arr));

	}

}
