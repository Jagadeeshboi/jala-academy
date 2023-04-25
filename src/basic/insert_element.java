package basic;
import java.util.Arrays;

public class insert_element {
	public static int[] insert(int arr[],int val,int pos)
	{
		int s=arr.length;
		int newarr[]=new int[s+2];
		for(int i=0;i<s;i++)
		{
			if (i < pos - 1)
			{
                newarr[i] = arr[i];
			}
            else if (i == pos - 1)
            {
                newarr[i] = val;
            }
            else
            {
                newarr[i] = arr[i - 1];
            }
		}
		return newarr;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,6};
		int val=10,pos=3;
		arr=insert(arr,val,pos);
		System.out.println(Arrays.toString(arr));

	}

}
