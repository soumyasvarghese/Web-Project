package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlelink {
	String baseurl="https://www.google.com";
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void read() throws Exception
	{
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		String Current=driver.getCurrentUrl();
		URL n=new URL(baseurl);
			HttpURLConnection c=(HttpURLConnection)n.openConnection();
			c.connect();
			 System.out.println(" Response Code: " +c.getResponseCode());
	}	
}
