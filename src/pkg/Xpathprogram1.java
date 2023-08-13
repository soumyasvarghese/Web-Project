package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathprogram1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
}
	@Test
	public void read()
	{
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("phone",Keys.ENTER);
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abcd1232@gmail.com");
		driver.findElement(By.xpath("//span[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
		String actual=driver.getTitle();
		System.out.println(actual);
	}
}
