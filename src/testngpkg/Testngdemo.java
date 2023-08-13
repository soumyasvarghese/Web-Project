package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testngdemo 
{
	ChromeDriver driver;
@BeforeTest
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com");	
}
@Test(priority=2)
public void test1()	
{
	boolean logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	if(logo)		
	{
		System.out.println("logo is present");		
	}
	else	
	{
		System.out.println("logo is not present");
	}	
}
@Test(priority=3)
public void test2()	
{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("s1222@gmail.com");	
}
@Test(priority=1)
public void test3()	
{
	String actual=driver.getTitle();
	System.out.println(actual);		
}
	
@AfterMethod
public void aftermtd()	{
		System.out.println("Test is done-----");		}
}