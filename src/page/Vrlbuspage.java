package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Vrlbuspage {
	WebDriver driver;
//	By links=By.xpath("//*[@id=\"demopopup\"]/div[2]/div[1]/img");
//	By btncls=By.xpath("//*[@id=\"largeModal\"]/div/div/button");
	By vsource=By.xpath("//*[@id=\"FromCity\"]");
	By vdestintion=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[1]/div[3]");
	By vdeparture=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[2]");
	By vsearch=By.xpath("//*[@id=\"demo\"]/section[2]/div/div/div[1]/div/div/div/div/div[3]/button");

	public Vrlbuspage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues()
	{
	//	driver.findElement(links).click();
	//	driver.findElement(btncls).click();
		driver.findElement(vsource);
		driver.findElement(vdestintion);
		driver.findElement(vdeparture);


	}
	public void search()
	{
		driver.findElement(vsearch).click();

	}
	public void contract()
	{
		driver.findElement(vsearch).click();

	}
}
