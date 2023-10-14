package globalValues;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\home\\Desktop\\SeleniumConcepts\\src\\test\\java\\globalValues\\DataFile.properties");
        prop.load(file);   //.load() its load the file.
        
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
	}

}
