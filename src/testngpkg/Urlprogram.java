package testngpkg;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Urlprogram {

		String baseurl="https://www.google.com";
		String newtab,link;
		ChromeDriver driver;
		@Before
		public void setup()
		{
			WebDriver driver=new ChromeDriver();
			driver.get(baseurl);
		}
		@Test
		public void read()
		{
			newtab=Keys.chord(Keys.CONTROL,Keys.RETURN);
			link=Keys.chord(Keys.CONTROL,Keys.ENTER);
		//	driver.findElement(By.id("input")).sendKeys("www.facebook.com");
			driver.findElement(By.linkText("www.facebook.com")).sendKeys(link);
			driver.findElement(By.linkText("www.facebook.com")).sendKeys(newtab);

		}
		}

