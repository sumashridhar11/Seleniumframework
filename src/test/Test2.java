package test;

import main.Base;
import main.Homepage;
import main.Loginpage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 extends Base {
	
	
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
public void DemoTest2() throws InterruptedException
{
	//driver=initalize();
	Homepage h=new Homepage(driver);
	Thread.sleep(2000);
	h.checkboxclick().click();
	Thread.sleep(2000);
    h.logout().click();
	h.clicklogout().click();
    logout();
	  
  }
}
