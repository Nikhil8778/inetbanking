package Facebook_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Element {
	
public static void main(String[] args)	{
	System.setProperty("webDriver.chrome.driver", "C:\\New folder\\Selenium\\chromedriver_win32.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("www.facebook.com");
	
}

}
