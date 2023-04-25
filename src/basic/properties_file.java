package basic;
import java.io.*;
import java.util.*;
public class properties_file {

	public static void main(String[] args) {
		Properties prop=new Properties();
		FileInputStream input=null;
		try
		{
			input = new FileInputStream("config.properties");

            // load a properties file
            prop.load(input);

            // get the property value and print it out
            System.out.println(prop.getProperty("database.url"));
            System.out.println(prop.getProperty("database.username"));
            System.out.println(prop.getProperty("database.password"));
		}
		catch (IOException ex) {
            ex.printStackTrace();
		}
		finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
	}

}
