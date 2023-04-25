package basic;

public class arthematic_ex_try_block {

	public static void main(String[] args) {
		int x = 5, y = 0;
        try {
            int result = x / y;
            System.out.println(result); // this line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception: " + e.getMessage());
        }
        System.out.println("Program completed.");

	}

}
