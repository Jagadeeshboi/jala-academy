package basic;
import java.io.*;
public class Buffered_output {

	public static void main(String[] args) {
		String file="example.txt";
		
		try
		{
			OutputStream output=new FileOutputStream(file);
			 BufferedOutputStream buffer=new  BufferedOutputStream(output);
			 
			 
			 String msg="hello world";
			 
			 byte[] name=msg.getBytes();			 
			 buffer.flush();
	         buffer.close();
	         System.out.println("Text written to file successfully.");
		}
		
		catch(IOException e)
		{
            System.out.println(e.getMessage());

		}

	}

}
