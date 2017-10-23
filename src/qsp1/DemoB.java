package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DemoB {
	static {
	     String key1="webdriver.chrome.driver";
	     String value1="C:\\Users\\Sastry\\workspace\\Automation\\Driver\\chromedriver.exe";
		 System.setProperty(key1,value1);
		 
		 String key2="webdriver.gecko.driver";
	     String value2="C:\\Users\\Sastry\\workspace\\Automation\\Driver\\geckodriver.exe";
		 System.setProperty(key2,value2);	
	}
    @Parameters("browser")
	@Test
	public void test(String browser)
	{
		WebDriver driver;
		if(browser.equals("chrome")) {
			driver=new ChromeDriver();			
		}
		else {
			driver=new FirefoxDriver();	
		}
		driver.get("http://sastry-pc:8080/login.do");
		WebElement unTB=driver.findElement(By.id("username"));
		for(int i=1;i<=50;i++)
		{
			unTB.sendKeys("admin");
			unTB.clear();
		}
	}
}
