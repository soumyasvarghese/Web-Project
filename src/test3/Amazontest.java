package test3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page3.Amazonpage;

public class Amazontest {
WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		
	}
	@Test
	public void tst1()
	{
		Amazonpage ob=new Amazonpage(driver);
		ob.sigin();
		ob.setvalues("9400074822", "Mad@amazon2022");
		ob.search1("iruvar");
		
	}
}
