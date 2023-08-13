package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radioprgm {
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
		WebElement r =  driver.findElement(By.xpath("//input[@type='radio']"));    
     	if(r.isSelected()==true)
		{
		   r.click();
		    System.out.println("Male Radio button selected");
	
		}
		else 
		    System.out.println("Female Radio button selected");

		}
        		}
