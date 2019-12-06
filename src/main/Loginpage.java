package main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	
	 public WebDriver driver;
		
	 public Loginpage(WebDriver driver)
	 {
		 this.driver=driver;
	 }
		
    By ele1= By.id("identifierId");
	By ele2=By.xpath("//span[text()='Next']");
	By ele3=By.name("password");
    
 public WebElement getdata()
 {
	 WebElement e1= driver.findElement(ele1);
	  return e1;
	 
}
 
 public WebElement cliktext()
 {
 WebElement e2= driver.findElement(ele2);
 return e2;
 }
 
 
 public WebElement password()
 {
	 WebElement e3=driver.findElement(ele3);
	 return e3;
 }
}


