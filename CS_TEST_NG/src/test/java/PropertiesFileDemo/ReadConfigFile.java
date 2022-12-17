package PropertiesFileDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {

	Properties properties;

	String path = "C:\\Users\\admin\\eclipse-workspace\\CS_TEST_NG\\src\\test\\java\\PropertiesFileDemo\\Config.properties";

	ReadConfigFile () throws IOException
	{	
		//to read properties file : create an object of FileInputStream class
		FileInputStream fis = new FileInputStream(path);

		//initaialize the class variable
		properties = new Properties();

		//now load properties file
		properties.load(fis);

	}

	// to read values from Config file, lets create some methods

	public String getUrl()
	{
		String url = properties.getProperty("url");
		if (url!= null)
			return url;
		else
			throw new RuntimeException("url not specified in config file");
	}

	public String getUserName ()
	{
		String username = properties.getProperty("username");
		if (username!= null)
			return username;
		else
			throw new RuntimeException("username not specified in config file");
	}

	public String getPassword ()
	{
		String password = properties.getProperty("password");
		if (password!= null)
			return password;
		else
			throw new RuntimeException("password not specified in config file");
	}
}
