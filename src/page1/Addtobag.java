package page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addtobag {
	WebDriver driver;
	By link=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/div[2]");
	By dlt=By.xpath("/html/body/div[1]/div/div/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/div[1]/div[2]/div");
	public Addtobag(WebDriver driver)
	{
		this.driver=driver;
	}
	public void links()
	{
		driver.findElement(link).click();
		
	}
	public void delete() 
	{
		driver.findElement(dlt).click();

	}

}
