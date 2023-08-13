package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Rediffassertion {
	ChromeDriver driver;	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() 
	{
	WebElement a = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[1]/td"));
	String actual=driver.getTitle();
	String exp="Create a Rediffmail account";	
	Assert.assertEquals(exp, actual);
    if(a.isDisplayed())
    {
        System.out.println("Displayed");

        a.click();

        System.out.println("Element is Clicked");
    }
   else {
        System.out.println("Element not present");
    } 
	}
}
