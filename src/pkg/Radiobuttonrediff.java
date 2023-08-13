package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonrediff {
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
  boolean val = driver.findElement(By.xpath("//input[@type='radio']")).isSelected();							
	if(val)
	{
        System.out.println("Selected");

	}
	else
	{
        System.out.println("Not Selected");

	}
}
}
