package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
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
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("Total no:of links:"+links.size());
		 for(WebElement link:links){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
	}
}
}
