package page1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Searchpage {
	WebDriver driver;
	By search=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/div/input");
	By searchbtn=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[3]/div[2]/form/div/button/span");
	By link=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/a");
	By bagbtn=By.xpath("/html/body/div[1]/div/div/div[2]/div/div/div[2]/div/div[3]/div/div[9]/div[1]/div[1]");
	public Searchpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void searchitem(String item)
	{
		driver.findElement(search).sendKeys(item);
		 driver.findElement(searchbtn).click();	  
		  }  
	public void pickitem()
	{
		driver.findElement(link).click();
	}
	public void button()
	{
		driver.findElement(bagbtn).click();
	}
	public void back()
	{
		driver.navigate().to("https://www.ajio.com/");

	}
	}

