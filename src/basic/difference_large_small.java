package basic;

public class difference_large_small {

	public static void main(String[] args) {
		int arr[]= {1,2,4,8,9,7,10,11};
		int l=arr.length;
		int small=Integer.MIN_VALUE;
		int large=Integer.MAX_VALUE;
		for(int i=0;i<l;i++)
		{
            if (arr[i] > large)
            {
                large = arr[i];
            }
            if (arr[i] < small)
            {
                small = arr[i];
            }
        
		}
		 int diff=large-small;
		 System.out.println();

	}

}
