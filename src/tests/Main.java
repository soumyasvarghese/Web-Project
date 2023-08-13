package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Loginpage;

public class Main {
	WebDriver driver;
	@BeforeTest
public void setup()
{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("https://hrm.flourisense.in/web/index.php/auth/login");
}
	@Test
	public void test1()
	
	{
		Loginpage obj=new Loginpage(driver);
		obj.username("Admin"); 
		obj.password("admin123");
		obj.button();
		
	}

}
