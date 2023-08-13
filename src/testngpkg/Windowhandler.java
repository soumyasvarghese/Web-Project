package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;

public class Windowhandler {
	WebDriver d;
	@BeforeTest
	public void beforetest()
	{
		d=new ChromeDriver();
	}
@org.testng.annotations.Test
public void test()
{
	d.get("http://demo.guru99.com/popup.php");
	String parentwindow=d.getWindowHandle();
	System.out.println("Parent Window Title"+d.getTitle());
	d.findElement(By.xpath("/html/body/p/a")).click();
	Set<String>allWindowHandles=d.getWindowHandles();
	for(String handle:allWindowHandles)
	{
		if(!handle.equalsIgnoreCase(parentwindow))
		{
			d.switchTo().window(handle);
			String s=d.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
			System.out.println(s);
			d.close();
		}
		d.switchTo().window(parentwindow);
	}
}
}
