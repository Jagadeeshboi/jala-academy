package basic;
import java.util.Arrays;
public class max_min {

	public static void main(String[] args) {
		int arr[]= {5,6,7,3,2,5,9,10};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if( arr[j]>arr[j+1])
						{
							int temp=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=temp;
						}
			}
		}
		System.out.println("minimum number in  array is:"+Arrays.toString(arr));
		System.out.println("maximum number in  array is:"+arr[arr.length-1]);
		
	}

}
