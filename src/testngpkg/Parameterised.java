package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameterised {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloads()
	{
		driver.get("https://www.facebook.com/");
	}
	@Parameters({"username","password"})
	@Test
	public void test1(String e,String p)
	{
		driver.findElement(By.name("email")).sendKeys(e);
		driver.findElement(By.name("pass")).sendKeys(p);
		driver.findElement(By.name("login")).click();
		String exp="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1NDM3NzAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		String actual=driver.getCurrentUrl();
		if(actual.equals(exp))
		{
			System.out.println("Login Failed");
		}
		else
		{
			System.out.println("Login Successful");

		}		
}
}