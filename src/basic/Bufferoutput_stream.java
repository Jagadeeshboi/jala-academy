package basic;
import java.io.*;
public class Bufferoutput_stream {

	public static void main(String[] args) {
		String file="example.txt";
		try
		{
			InputStream input=new FileInputStream(file);
			
			BufferedInputStream Buffer=new BufferedInputStream(input);
			
			byte[] name=new byte[Buffer.available()];
			
			String output=new String(name);
			
			input.close();
		}
		catch(IOException e)
		{
            System.out.println(e.getMessage());

		}

	}

}
