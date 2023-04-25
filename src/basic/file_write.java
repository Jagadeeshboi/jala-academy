package basic;
import java.io.*;
import java.io.FileWriter;

public class file_write {

	public static void main(String[] args) {
			String file="example.txt";
			String name="hello world";
			try
			{
				FileWriter flw=new FileWriter(file);
				flw.write(name);
				flw.flush();
				flw.close();// TODO Auto-generated method stub
			}
			catch(IOException  e)
			{
				System.out.println(e.getMessage());
			}

	}

}
