package basic;
import java.util.*;
public class switch_odd {

	public static void main(String[] args) {
		 int a;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter number");
		 a=sc.nextInt();
		 switch(a%2)
		 {
			 case 0:
			 	System.out.println("even number");
			 	break; 
			 case 1:
				 System.out.println("odd number");
				 break;
		 }
			 	

	}
 
}
