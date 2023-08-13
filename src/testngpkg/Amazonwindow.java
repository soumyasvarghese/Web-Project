package testngpkg;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
public class Amazonwindow {
	WebDriver d;
	@BeforeTest
	public void beforetest()
	{
		d=new ChromeDriver();
	}
@org.testng.annotations.Test
public void test()
{
	d.get("https://www.amazon.in/");
	d.manage().window().maximize();
	d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("apple iphone 14 pro max");
	d.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	Set<String>s=d.getWindowHandles();
	ArrayList ar=new ArrayList(s);
	System.out.println(ar.get(0));
	System.out.println(ar.get(1));
	d.switchTo().window((String) ar.get(1));
d.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
d.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]")).click();		
			d.close();
		}
}

