package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpageprgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Html/webpage.html");
	}
	@Test
	public void read()
	{
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		System.out.println(text);
		a.accept();
		if(text.equalsIgnoreCase("Hello! i am an alert box!!"))
		{
		System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
	
		}
		driver.findElement(By.name("firstname")).sendKeys("soumya");
		driver.findElement(By.name("lastname")).sendKeys("s");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
}
}
