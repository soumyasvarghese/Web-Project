package testngpkg;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertionprgm {
	ChromeDriver driver;	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test() 
	{
		String actual=driver.getTitle();
		String exp="Facebook";

		if(exp.equals(actual))
		{
			System.out.println("PASS.....");	
	}
		else
		{
		System.out.println("FAIL.....");	
		}
		System.out.println("Comprison");	
	}
}
