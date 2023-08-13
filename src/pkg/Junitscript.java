package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitscript {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
@Test
public void read()
{
	driver.findElement(By.id("APjFqb")).sendKeys("Books",Keys.ENTER);
//	driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
	String actual=driver.getTitle();
	System.out.println(actual);
}
}
