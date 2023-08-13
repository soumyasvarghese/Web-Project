package testngpkg;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Justdial {
	ChromeDriver driver;
@BeforeTest
public void setup()
{
	ChromeOptions op=new ChromeOptions();
	op.addArguments("---Disabled Notifications---");
	driver=new ChromeDriver(op);
	
}
@Test
public void test1()
{
	driver.get("https://www.justdial.com/");
}
}
