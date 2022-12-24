package com.inetBanking.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties properties;
	String path=".\\Configuration\\config.properties";
	//String path1="./Configuration/config.properties";
	
	// constructor//
	public ReadConfig()
	{
		properties =new Properties();
		
		//open config.properties file to read & load that file
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(path);
		} 
		catch (FileNotFoundException e) 
		{	
			e.printStackTrace();
		}
		try 
		{
			properties.load(fis);
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
	}
	
	public String getBrowser() 
	{
		String Browservalue=properties.getProperty("browser"); //browser value copy paste karun ghyaychi config.properies file madun bcz its case sesnsitive
		
		if(Browservalue!=null)
		{
			return Browservalue;
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
	
	public String getUsername()
	{
		String username = properties.getProperty("username");
		return username;	
	}
	
	public String getPassword()
	{
		String password = properties.getProperty("password");
		return password;	
	}
}
