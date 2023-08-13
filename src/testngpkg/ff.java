package testngpkg;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.datatransfer.StringSelection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class ff {
	WebDriver driver;

	

	@BeforeTest

	public void setUp()

	{

			driver=new ChromeDriver();		

	}

	@Test

	public void fileup() throws Exception

	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		fileupload("Downloads\\nandhu.docx");

		   

	}

	@Test

	public void fileupload(String p) throws AWTException {

		// TODO Auto-generated method stub

		StringSelection strSelection=new StringSelection(p);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		

		Robot robot=new Robot();

		

		robot.keyPress(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);

		

		robot.keyPress(KeyEvent.VK_ENTER);

		robot.delay(2000);

		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
