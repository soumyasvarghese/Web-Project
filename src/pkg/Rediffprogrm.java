package pkg;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Rediffprogrm {
	ChromeDriver driver;
	@Before
	public void setup()	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");	}
@Test
	public void read()	{
		boolean logo=driver.findElement(By.xpath("//img[@title='Rediff.com']")).isDisplayed();
		if(logo)		{
			System.out.println("logo is present");		}
		else	{
			System.out.println("logo is not present");
		}}
	@Test
	public void dropdown()	{
		WebElement  date =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(date);
        day.selectByVisibleText("21");
        WebElement  month =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
          Select months =new Select(month);
          months.selectByVisibleText("JUL");
          WebElement  Year =driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]"));
            Select years =new Select(Year);
            years.selectByVisibleText("2010");
	}
     @Test
        	public void dropdowncount()       	{
    	 Select d = new Select(driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]")));
    	 List<WebElement> a = d.getOptions();
        		System.out.println("Count of date:"+a.size());
        		Select m = new Select(driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]")));
           	 List<WebElement> b  = m.getOptions();
               		System.out.println("Count of month:"+b.size());
               		Select y = new Select(driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[3]")));
               	 List<WebElement> c = y.getOptions();
                   		System.out.println("Count of year:"+c.size());     		 
	}}