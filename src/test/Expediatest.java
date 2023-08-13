package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Expediapage;

public class Expediatest {
	WebDriver driver;
	@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.get("http://www.expedia.com");

}
	@Test
	public void fbtest()
	{
		Expediapage obj=new Expediapage(driver);
		obj.flight();
		obj.travel();
		obj.economy();
		obj.done();
		
	}
}
