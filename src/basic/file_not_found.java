
package basic;
import java.util.*;
import java.io.*;
public class file_not_found {

	public static void main(String[] args) {
		try
		{
			File f=new File(".ext not found");
			Scanner scanner = new Scanner(f);
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
