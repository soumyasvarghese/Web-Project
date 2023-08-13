package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	By user=By.name("username");
	By pass=By.name("password");
	By btn=By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]");
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void username(String u)
	{
		driver.findElement(user).sendKeys(u,Keys.ENTER);
	}
	public void password(String p)
	{
		driver.findElement(pass).sendKeys(p,Keys.ENTER);
	}
	public void button()
	{
		driver.findElement(btn).click();


	}
}
