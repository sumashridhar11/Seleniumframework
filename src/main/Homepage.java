package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By ele1= By.xpath("//*[@id='gb']/div[2]/div[3]/div/div[2]/div/a/span");
	By ele2=By.xpath("//a[@class='gb_zb gb_6f gb_eg gb_Pe gb_pb']");
	By ele3=By.xpath("//span[@class='gb_xa gbii']");

	

 public WebElement logout()
 {
	 WebElement e1=driver.findElement(ele1);
	  return e1;
 
}
 
 public WebElement clicklogout()
 {
	 WebElement e2=driver.findElement(ele2);
	  return e2;
	 
 }
 
 public WebElement checkboxclick()
 {
	 WebElement e3=driver.findElement(ele3);
	 return e3;
 }
 
 
}




