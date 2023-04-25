package basic;
import java.io.*;
import java.io.InputStream;

public class input_stream {

	public static void main(String[] args) {
		String file="exmple.txt";
		try
		{
			InputStream input=new FileInputStream(file);
			byte[] inputstream=new byte[input.available()];
			
			input.read(inputstream);
			
			String name=new String(inputstream);
			
			System.out.println(name);
			
			input.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}

	}

}
