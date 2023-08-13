package testngpkg;

	import java.awt.AWTException;

	import java.awt.Robot;

	import java.awt.event.KeyEvent;

	import java.util.List;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;

	import org.openqa.selenium.JavascriptExecutor;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.WebDriverException;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

	import org.testng.annotations.Test;

	public class makemytrip  

	{

	WebDriver driver;

	@BeforeClass

	public void OpenBrowser()

	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test

	public void TripDetails() throws InterruptedException, AWTException

	{

	

	try

	{

	/*String frameStatus = driver.findElement(By.id(“webklipper-publisher-widget-container-notification-frame”)).getTagName();

	System.out.println(frameStatus);

	driver.switchTo().frame(“notification-frame-31764456”);

	driver.findElement(By.xpath(“.//*[@id=’webklipper-publisher-widget-container-notification-close-div’]/i”)).click();

	driver.switchTo().defaultContent();

	Thread.sleep(3000); */

	driver.findElement(By.xpath("//input[@id=’hp-widget__sfrom’]")).click();

	driver.findElement(By.xpath("//input[@id=’hp-widget__sfrom’]")).clear();

	//driver.findElement(By.xpath(“//input[@id=’hp-widget__sfrom’]”)).sendKeys(“Goa”);

	Thread.sleep(2000);

	List<WebElement> fromCities = driver.findElements(By.xpath("//ul[@id=’ui-id-1′]/li/div/p/span[1]"));

	System.out.println(fromCities.size()+"\n");

	for(int i=0;i<fromCities.size();i++)

	{

	WebElement element=fromCities.get(i);

	System.out.println(element.getAttribute("innerHTML"));

	}

	//driver.findElement(By.xpath(“//ul[@id=’ui-id-1′]/li/div/p/span”)).click();

	driver.findElement(By.xpath("//li[contains(@aria-label,’Top Cities : Goa, India ‘)]/div/p/span[1]")).click();

	driver.findElement(By.xpath("//input[@id=’hp-widget__sTo’]")).click();

	driver.findElement(By.xpath("//input[@id=’hp-widget__sTo’]")).clear();

	//driver.findElement(By.xpath(“//input[@id=’hp-widget__sTo’]”)).sendKeys(“Mumbai”);

	Thread.sleep(2000);

	List<WebElement> toCities = driver.findElements(By.xpath("//ul[@id=’ui-id-2′]/li/div/p/span[1]"));

	System.out.println(toCities.size()+"\n");

	for(int i=0;i<toCities.size();i++)

	{

	WebElement element=toCities.get(i);

	System.out.println(element.getAttribute("innerHTML"));

	}

	//driver.findElement(By.xpath(“//ul[@id=’ui-id-2′]/li/div/p/span”)).click();

	driver.findElement(By.xpath("//ul[@id=’ui-id-2′]/li[3]/div/p/span[1]")).click();

	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@id=’hp-widget__depart’]")).click();

	Thread.sleep(2000);

	String date = "10-OCTOBER-2018";

	String splitter[] = date.split("-");

	String month_year = splitter[1];

	String day = splitter[0];

	System.out.println(month_year);

	System.out.println(day);

	selectDate(month_year,day);

	Thread.sleep(3000);

	driver.findElement(By.xpath("//button[@id=’searchBtn’]")).click();

	Thread.sleep(5000);

	Thread.sleep(2000);

	JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("window.scrollBy(0,3000)");

	/*Robot robot = new Robot();

	robot.keyPress(KeyEvent.VK_PAGE_DOWN);

	robot.keyRelease(KeyEvent.VK_PAGE_DOWN);*/

	Thread.sleep(5000);

	driver.findElement(By.xpath("//div[@id=’aln_AI_dep’]/span[3]")).click();

	Thread.sleep(5000);

	List<WebElement> flights = driver.findElements(By.xpath("//div[@class=’top_first_part clearfix’]/div/span/span[2]/span[1]"));

	System.out.println("No. of Air India flight search results: —"+flights.size());

	}catch(WebDriverException e)

	{

	System.out.println("Exception is: —“+e+”\n");

	}

	}

	public void selectDate(String monthyear, String Selectday) throws InterruptedException

	{

	List<WebElement> elements = driver.findElements(By.xpath("//div[@class=’ui-datepicker-title’]/span[1]"));

	for (int i=0; i<elements.size();i++)

	{

	System.out.println(elements.get(i).getText());

	//Selecting the month

	if(elements.get(i).getText().equals(monthyear))

	{

	//Selecting the date

	List<WebElement> days = driver.findElements(By.xpath("//div[@class=’ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2′]/div[2]/table/tbody/tr/td/a"));

	for (WebElement d:days)

	{

	System.out.println(d.getText());

	if(d.getText().equals(Selectday))

	{

	d.click();

	Thread.sleep(10000);

	return;

	}

	}

	}

	}

	driver.findElement(By.xpath("//div[@class=’ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all ui-datepicker-multi ui-datepicker-multi-2′]/div[2]/div/a/span")).click();

	selectDate(monthyear,Selectday);

	}

	@AfterMethod

	public void CloseBrowser()

	{

	driver.quit();

	}

	}

