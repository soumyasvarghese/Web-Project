package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rediffmail {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	
	}
	@Test(groups={"smoke"})
	public void test()	
	{
		String actual=driver.getTitle();
		System.out.println(actual);	
	//	System.out.println("Test5");		

	}
	@Test(groups={"smoke"})
	public void test1()	
	{
		String ex="Check availability";
		WebElement e=driver.findElement(By.xpath("//input[@type='button']"));
		
	}
		
	@AfterMethod
	public void aftermtd()	{
			System.out.println("After Method");		}
	}
