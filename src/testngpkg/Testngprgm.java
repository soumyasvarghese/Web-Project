package testngpkg;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprgm {
	ChromeDriver driver;
@BeforeTest(alwaysRun=true)
public void set()
{
	driver=new ChromeDriver();
}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com");	
}
@Test(groups={"smoke"})
public void test1()	
{
	
		System.out.println("Test1");		
	
}
@Test(groups={"smoke","sanity"})
public void test2()	
{
	System.out.println("Test2");		
}
@Test(groups={"sanity"})
public void test3()	
{
	System.out.println("Test3");		

}
@Test(groups={"sanity"})
public void test4()	
{
	System.out.println("Test4");		

}
@Test(groups={"smoke"})
public void test5()	
{
	System.out.println("Test5");		

}
	
@AfterMethod
public void aftermtd()	{
		System.out.println("After Method");		}
}
