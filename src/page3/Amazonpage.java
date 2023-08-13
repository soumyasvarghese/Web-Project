package page3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Amazonpage {
WebDriver driver;
	
	By sn=By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/div/div/div[2]/div[3]/div");
	By email=By.name("email");
	By pass=By.id("ap_password");
	By sign=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/form/div/div/div/div[3]/span/span");
	By icon=By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/div/div/div[2]/div[1]");
	By search=By.xpath("/html/body/div[1]/div[1]/header/div[1]/div/div/div/div[2]/div[1]/div/div/form/input[2]");
	By iru=By.xpath("//*[@id=\"a-page\"]/div[2]/main/div/div[5]/div[2]/div/article[1]/section/div/a");
	By res=By.xpath("//*[@id=\"dv-action-box\"]/div/div/div/div/div[2]/div/div[1]/div[1]/a[2]/span[1]/svg/svg/path");
	
	
	public Amazonpage(WebDriver driver2)
	{
		this.driver=driver2;
	}
	public void sigin()
	{
		driver.findElement(sn).click();
	}
	public void setvalues(String a,String b)
	{
		driver.findElement(email).sendKeys(a);
		driver.findElement(pass).sendKeys(b);
		driver.findElement(sign).click();
		driver.navigate().to("https://www.primevideo.com/offers/nonprimehomepage/ref=dv_web_force_root");
		
		
	}
	public void search1(String c)
	{
		driver.findElement(icon).click();
		driver.findElement(search).sendKeys(c,Keys.ENTER);
		driver.findElement(iru).click();
		driver.findElement(res).click();
	}
}

