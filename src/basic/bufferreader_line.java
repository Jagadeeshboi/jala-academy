 package basic;
import java.io.*;
public class bufferreader_line {

	public static void main(String[] args) {
		BufferedReader reader=null;
		try
		{
			reader=new BufferedReader(new FileReader("filename.txt"));
			String line=reader.readLine();
			
			while(line!=null)
			{
				System.out.println(line);
				line=reader.readLine();
			}
		}
		catch(IOException e)
		{

		}
		finally
		{
			try
			{
				if(reader!=null)
				{
					reader.close();
				}
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

}
