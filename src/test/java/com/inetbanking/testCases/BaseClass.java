package com.inetbanking.testCases;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadingConfig;

public class BaseClass {
	ReadingConfig rc=new ReadingConfig();
	
	public String URL=rc.getURL();
	public String Username=rc.getUsername();
	public String Password=rc.getPassword();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", rc.getchromepath());
		driver=new ChromeDriver();
		}else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", rc.getfirefoxpath());
			driver=new FirefoxDriver();
		}else {
			System.setProperty("webdriver.ie.driver", rc.getiepath());
			driver=new InternetExplorerDriver();
		}
		driver.get(URL);
	}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	
}
