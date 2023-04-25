package basic;
import java.io.*;
public class filereader {

	public static void main(String[] args) {
		String name="example.txt";
		char[] buffer=new char[1024];
		try
		{
			FileReader filename=new FileReader(name);
			int bufferch;
			while((bufferch=filename.read(buffer))!=-1)
			{
				String n=new String(buffer,0,bufferch);
				System.out.println(n);
			}
			filename.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		

	} 

}
