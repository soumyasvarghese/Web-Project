package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitscript1 {
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
	driver.findElement(By.name("email")).sendKeys("soumya12@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("soumya@23");
	driver.findElement(By.name("login")).click();;

		String actual=driver.getTitle();
		System.out.println(actual);
	}
}
