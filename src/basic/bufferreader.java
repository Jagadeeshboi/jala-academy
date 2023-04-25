package basic;
import java.io.*;
public class bufferreader {

	public static void main(String[] args) {
		try
		{
		FileWriter file=new FileWriter("example.txt",true);
		BufferedWriter filename=new BufferedWriter(file);
		filename.write("this is my name");
		file.close();
		}
		catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
		}

	}

}
