package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Vrlbuspage;

public class Vrlbustest {
	WebDriver driver;
	@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("https://www.vrlbus.in/#/");

}
	@Test
	public void fbtest()
	{
		Vrlbuspage obj=new Vrlbuspage(driver);
		obj.setvalues();
		obj.search();
	}

}
