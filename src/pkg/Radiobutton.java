package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void read()
	{
	 WebElement m = driver.findElement(By.xpath("//input[@value='m']"));

     WebElement f = driver.findElement(By.xpath("//input[@value='f']"));
     String Gender="Female";
     if(Gender.equalsIgnoreCase("Male"))
     {
    	 m.click();
    	 System.out.println("Male is selected");
     }
     else if(Gender.equalsIgnoreCase("Female"))
     {
    	 f.click();    	 
    	 System.out.println("Female is selected");

     }
	}

}
