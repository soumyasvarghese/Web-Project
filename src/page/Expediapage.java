package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Expediapage {
	WebDriver driver;
	By eflight=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[5]/div[1]/div/div/div/div/div/ul/li[2]/a");
	By etraveller=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[5]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[1]/div/div[1]/div/div/button\r\n");
	By eadult=By.xpath("/html/body/div[1]/div[1]/div[2]/section/div[3]/div/div[1]/section/div[1]/div[1]/div\r\n");
	By eage=By.xpath("/html/body/div[1]/div[1]/div[2]/section/div[3]/div/div[2]/section/div[1]/div[3]/div/div/select");
	By ebutton=By.xpath("/html/body/div[1]/div[1]/div[2]/section/div[3]/div/div[3]/button");
	By efirstclass=By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div[1]/div[5]/div[1]/div/div/div/div/div/div/div/div/form/div[2]/div/div[1]/div[1]/div/div[2]/div/div/div/a[4]\r\n");

	public Expediapage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void flight()
	{
		driver.findElement(eflight).click();

	}
	public void travel()
	{
		driver.findElement(etraveller).click();
		driver.findElement(eadult).click();
		driver.findElement(eage).click();
	}
	public void economy()
	{
		driver.findElement(efirstclass).click();

	}

	public void done()
	{
		driver.findElement(ebutton).click();

	}

}
