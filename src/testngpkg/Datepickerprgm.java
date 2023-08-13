package testngpkg;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickerprgm {
	WebDriver driver;
	String baseurl="http://www.expedia.com";
	@BeforeTest
	public void beftest()
	{
		driver=new ChromeDriver();	
	}
	@BeforeMethod
	public void setup() {
		
		driver.get(baseurl);

	}
	@Test
	public void datepick()
	{
	driver.findElement(By.xpath("//*[@id=\"d1-btn\"]")).click();
	while(true)
	{
		WebElement month=driver.findElement(By.xpath("//*[@id=\"app-layer-datepicker-check-in-out-start\"]/section/div[2]/div[2]/div/div[2]/h2"));
		String month1=month.getText();
		if(month1.equals("July 2023"))
		{
			System.out.println(month1);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@class='uitk-calendar']/div/button")).click();;
	
		}
	}
	List<WebElement>alldates1=	driver.findElements(By.xpath("//*[@id=\"app-layer-datepicker-check-in-out-start\"]/section/div[2]/div[2]/div/div[1]/table/tbody/tr/td/button"));
for(WebElement dateelement:alldates1)
{
	String date=dateelement.getAttribute("data-day");
	System.out.println(date);
	if(date.equals("18"))
	{
		dateelement.click();
		System.out.println("Date Selected");
	}
}
	}
}