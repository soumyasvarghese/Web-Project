package page2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class register {
	WebDriver driver;
	By link=By.xpath("//*[@id=\"AH_loginRegisterBtn\"]");
	By Email=By.xpath("//*[@id=\"exampleFormControlInput1\"]");
	By cntnu=By.xpath("//*[@id=\"AH_sendOTP\"]");	
	public register(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.driver=driver;
	}
	public void read(String e)
	{
		driver.findElement(link).click();
		driver.findElement(Email).sendKeys(e,Keys.ENTER);


	}
	public void cntnu()
	{
		driver.findElement(cntnu).click();

	}
	public void back()
	{
		driver.navigate().to("https://www.industrybuying.com/");
	}

}
