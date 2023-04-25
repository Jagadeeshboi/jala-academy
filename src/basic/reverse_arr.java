package basic;
//import java.util.Arrays;
public class reverse_arr {
	public static void reverse(int arr[], int n)
	{
		int b=n;
		int newarr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			newarr[b-1]=arr[i];
			b-=1;
		}
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
        	System.out.print(newarr[k]+" ,");
        }
            
	}
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		int n=arr.length;
		reverse(arr,n);
	}
}
