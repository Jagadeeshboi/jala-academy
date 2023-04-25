package basic;

public class average_array {

	public static void main(String[] args) {

				int n;
				int arr[] = {1, 2, 3, 4, 5,6};
				n = arr.length;
				int sum = 0;
				int cnt = 0;
				for (int i = 0; i < n; i++) {
					sum += (double) arr[i];
				}
				averageNumbers(arr, n, sum);


		}
		static void averageNumbers(int arr[], int n, int sum) {
	
			int cnt = 0;
			sum /= (double) n;
	
			System.out.println(count(arr, sum));
			for (int i = 0; i < n; i++) {
				if ((double) arr[i] == sum) {
	
					System.out.print(i + " ");
					cnt++;
				}
			}
		}
	
		static int count(int[] array, int sum) {
			int count = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == sum) {
					count++;
				}
			}
			return count;
	}


	}
