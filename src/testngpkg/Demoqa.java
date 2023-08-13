package testngpkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demoqa {
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun=true)
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	@Test
	public void test1()	
	{
		Actions act=new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));	 
		act.dragAndDrop(drag, drop).perform();
		String textTo = drop.getText();
		if(textTo.equals("Dropped!")) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
	}
}
