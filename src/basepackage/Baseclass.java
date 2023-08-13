package basepackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
		public WebDriver driver;
		@BeforeClass
	public void setup()
	{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ajio.com");


	}
}
