package test1;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import basepackage.Baseclass;
import page1.Signuppage;
import page1.Searchpage;
import page1.Addtobag;
public class Ajiotest extends Baseclass{
	@Test
	public void testpages()throws InterruptedException
	{
Signuppage s=new Signuppage(driver);
		s.links();
		s.read("9944111111");
		Thread.sleep(1000);
		s.login();
		Thread.sleep(1000);
		s.password("abc22");
		Thread.sleep(1000);
		
		Searchpage sp=new Searchpage(driver);
		sp.searchitem("Bedsheet");
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");
		sp.pickitem();
		Thread.sleep(1000);
		sp.button();
		sp.back();

		Addtobag ab=new Addtobag(driver);
		ab.links();
		ab.delete();		
	}
		@AfterMethod
		public void CloseBrowser()
		{
		driver.quit();
		}
}
