package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
	WebDriver driver;
	By fbcreate=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By fbbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button");
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues()
	{
		driver.findElement(fbcreate).click();

	}
	public void login()
	{
		driver.findElement(fbbutton).click();

	}
}
