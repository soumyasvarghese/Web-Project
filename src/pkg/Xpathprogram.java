package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprogram {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void read()
	{
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bc12@gmail.com");
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc123");
	driver.findElement(By.xpath("//button[@name='login']")).click();;

		String actual=driver.getTitle();
		System.out.println(actual);
	}
}
