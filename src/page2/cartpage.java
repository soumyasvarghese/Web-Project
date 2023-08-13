package page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class cartpage {
WebDriver driver;
	By cart=By.xpath("/html/body/header/div/div[2]/div[3]/div/a[3]/div[1]/img");
	By add=By.xpath("//*[@id=\"Capa_1\"]");
	By remove=By.xpath("/html/body/ib-root/div/ib-cart/div/div[1]/div[2]/div/div[2]/ib-order-item/div/div[1]/div/div[2]/div[2]/div[2]/a");
	public cartpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void cart()
	{
		driver.findElement(cart).click();
	}
	public void add()
	{
		driver.findElement(add).click();
		driver.findElement(remove).click();

	}
	public void back()
	{
		driver.navigate().back();
	}

}

