package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Demopage;

public class Demotest {
	
		WebDriver driver;
		@BeforeTest
	public void setup()
	{
			driver=new ChromeDriver();
			driver.get("http://www.facebook.com");

	}
		@Test
		public void fbtest()
		{
			Demopage obj=new Demopage(driver);
			obj.setvalues("abc12@gmail.com", "abcd");
			obj.login();
		}

	}

