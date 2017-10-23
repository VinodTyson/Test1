package qsp2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoA {
	static {
	     /*String key="webdriver.chrome.driver";
	     String value="C:\\Users\\Sastry\\workspace\\Automation\\Driver\\chromedriver.exe";
		 System.setProperty(key,value);*/
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Sastry\\workspace\\Automation\\Driver\\geckodriver.exe");	
	}
	@Test
	public void testLogin()
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://sastry-pc:8080/login.do");
		String aTitle=driver.getTitle();
		String eTitle="actiTIME - Login";
		System.out.println(aTitle);
	 Assert.assertEquals(aTitle,eTitle);
	}

}
