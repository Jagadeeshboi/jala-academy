package basic;

public class array_outof {

	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		try
		{
			int result=arr1[3];	//try to access the 3 elements from array 
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
