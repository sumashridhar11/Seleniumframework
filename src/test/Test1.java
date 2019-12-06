package test;

import main.Base;
import main.Homepage;
import main.Loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 extends Base{
	
@BeforeClass
public void beforemethod() throws InterruptedException
{
	  driver=initalize();
	  Loginpage l=new Loginpage(driver);
	  l.getdata().sendKeys("sumashridhar11@gmail.com");
	  l.cliktext().click();
	  Thread.sleep(2000);
	  l.password().sendKeys("sumasb11@");
	  l.cliktext().click();
}
	
  @Test
  public void Demo() throws InterruptedException  {
	  Thread.sleep(10000);
	  Homepage h=new Homepage(driver);
	  logout();
	  
  }



}