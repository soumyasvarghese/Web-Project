package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demofileupload {
	WebDriver driver;	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void test() 
	{
	WebElement upload = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
	upload.sendKeys("C:\\Document\\Selenium.txt");
	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	System.out.println("File is uploaded successfully.......");
	}

}
