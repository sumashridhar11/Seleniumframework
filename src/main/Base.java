package main;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.reflections.vfs.CommonsVfs2UrlType.File;

import com.sun.jna.platform.FileUtils;

public class Base {

	public WebDriver driver;
	public WebDriver initalize()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Tenjin\\client\\browser_driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://gmail.com");
		return driver;
	}	
		
	public void logout()
	{
		driver.close();
	}
 
	public void getscreenshot()
	{
		File src= ((TakesScreenshot)webdriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//screenshot.png"));
		
	}
}
	
	 