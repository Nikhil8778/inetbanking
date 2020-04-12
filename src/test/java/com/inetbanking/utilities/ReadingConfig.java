package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadingConfig{ 
	Properties prop;

public ReadingConfig(){
try {
	FileInputStream fis=new FileInputStream("./Configuration\\config.properties\\Driver\\chromedriver.exe");
	
	Properties prop=new Properties();
	prop.load(fis);
}catch(Exception e) {
	System.out.println("Exception is "+ e.getMessage());
}
}
public String getURL() {
	String URL=prop.getProperty("URL");
	return URL;
}
public String getUsername() {
	String Username=prop.getProperty("Username");
	return Username;
}
public String getPassword() {
	String Password=prop.getProperty("Password");
	return Password;
}
public String getchromepath() {
	String chrome=prop.getProperty("chromedriver");
	return chrome;
}
public String getfirefoxpath() {
	String firefox=prop.getProperty("firefoxdriver");
	return firefox;
}
public String getiepath() {
	String ie=prop.getProperty("iedriver");
	return ie;
}
}