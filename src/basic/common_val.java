package basic;

public class common_val {

	public static void main(String[] args) {
		int arr[]= {1,2,34,5,6,67,};
		int arr1[]= {1,2,3,45,7,6,10};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1.length-1;j++)
			{
				if(arr[i]==arr1[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
		
	}

}
