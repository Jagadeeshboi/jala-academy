package basic;
import java.io.*;
public class io_exception {

	public static void main(String[] args) {
		BufferedReader reader= null;
		try
		{
			reader=new BufferedReader(new FileReader("non.reader.text"));
			String line = reader.readLine();
		}
		catch (IOException e) {
            System.out.println("Caught I/O exception: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }

	}

}
