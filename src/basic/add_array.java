package basic;
import java.util.Arrays;
public class add_array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int n=arr.length;
		int newarr[]=new int[n+1];
		int value=7;
		for(int i=0;i<n;i++)
		{
			newarr[i]=arr[i];
		}
		newarr[n]=value;
		System.out.println(Arrays.toString(newarr));

	}

}






