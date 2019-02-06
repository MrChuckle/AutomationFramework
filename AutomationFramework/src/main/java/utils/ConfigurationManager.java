package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationManager {
	
	public static Properties config = new Properties();
	
	public static void loadConfig() {
		FileInputStream file;
		try {
			file = new FileInputStream("./src/main/resources/config.properties");
			config.load(file);
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
