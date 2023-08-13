package page2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class home {
	WebDriver driver;
	
	By logo=By.xpath("/html/body/header/div/div[2]/div[1]/div[3]/a/img");
	By all=By.xpath("//*[@id=\"search_concept\"]");
	By product=By.xpath("//*[@id=\"AH_CarouselWidget_18\"]/div/div/div[5]/div/div[2]");
	By cart=By.xpath("//*[@id=\"addToCartButton\"]");		
	
	public home (WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickall()
	{
		driver.findElement(all).click();
	}
	
	public void clickproduct()
	{
		driver.findElement(product).click();
		driver.findElement(cart).click();

	}
	public void back()
	{
		driver.navigate().back();
	}


}
