package testngpkg;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileInputStream;

public class Datadriventest {
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
@Test
public void test() throws Exception
{
	FileInputStream f=new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Luminar\\prgm1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet sh=wb.getSheet("Sheet1");//sheet details
	int row=sh.getLastRowNum();//row details
	for(int i=1;i<=row;i++)
	{
	String	username=sh.getRow(i).getCell(0).getStringCellValue();
	double	pswd=sh.getRow(i).getCell(1).getNumericCellValue();
	int p=(int)pswd;
	String password=String.valueOf(p);
System.out.println("Username="+username+"\n"+"Password="+password);
driver.findElement(By.name("email")).clear();
driver.findElement(By.name("email")).sendKeys(username);
driver.findElement(By.name("pass")).clear();
driver.findElement(By.name("pass")).sendKeys(password);
driver.findElement(By.name("login")).click();
	}	
}
}
