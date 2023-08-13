package test2;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page2.cartpage;
import page2.home;
import page2.register;
public class industrytest {
	WebDriver driver;
	@BeforeTest
public void setup()
{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://www.industrybuying.com/");
}
	@Test
	public void test1()
	{
		register obj=new register(driver);
		obj.read("1111111111");
		obj.cntnu();
		obj.back();
	}
		@Test
		public void test2()
		 {		
	
		home h=new home(driver);
		h.clickall();
		h.clickproduct();
		h.back();
		 }
		@Test
		public void test3()
		 {	
		cartpage c=new cartpage(driver);
		c.cart();
		c.add();
		c.back();	
	}
	@Test
	public void test4() throws IOException
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println("total no of links="+links.size());
		for(WebElement u:links){
			 String link=u.getAttribute("href");
			 verify(link);
		}		
}
	private void verify(String link) throws IOException  {
		URL n=new URL(link);
		HttpURLConnection con	=(HttpURLConnection)n.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Response code is 200----"+link);
		}
		else if(con.getResponseCode()==404)
		{
			System.out.println("Response code is 404----"+link);
		}
}
}
