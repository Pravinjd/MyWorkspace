package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	String path=".\\Configuration\\config.properties";
	
	//constructor//
	public ReadConfig()
	{
		properties =new Properties();
		try
		{
		FileInputStream fis =new FileInputStream(path);
		properties.load(fis);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public String getBrowser() 
	{
		String value=properties.getProperty("browser"); //browser value copy paste karun ghyaychi config.properies file madun bcz its case sesnsitive
		
		if(value!=null)
		{
			return value;
		}
		else
		{
			throw new RuntimeException("browser not matched");
		}
	}
	
	public String getApplicationURL()
	{
		String url = properties.getProperty("baseurl");
		return url;	
	}
	
}
