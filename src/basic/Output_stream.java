package basic;
import java.io.*;
import java.io.IOException;
import java.io.OutputStream;

public class Output_stream {

	public static void main(String[] args) {
		String file="exmple.txt";
		
		try
		{
			OutputStream output=new FileOutputStream(file);
			
			String text="jala academy";
			
			byte[] name=text.getBytes();
			
			output.write(name);
			
			output.close();
			
		}  
		catch(IOException e)
		{
            System.out.println(e.getMessage()); 

		}

	}

}
