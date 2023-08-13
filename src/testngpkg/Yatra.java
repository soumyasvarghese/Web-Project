package testngpkg;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloads()
	{
		driver.get("https://www.yatra.com/");
	}
	@Test
	public void test1()
	{
List<WebElement>links=driver.findElements(By.tagName("a"));
for(WebElement link:links)
{
	System.out.println("The number of links:"+links.size());	
	System.out.println(link.getText()+"-"+link.getAttribute("href"));	
}
}
}
