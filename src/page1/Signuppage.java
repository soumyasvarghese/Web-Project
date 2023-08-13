package page1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Signuppage {
WebDriver driver;
By link=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/span");
By phn=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/form/div[2]/div[1]/label/input");
By cbtn=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/form/div[2]/div[2]/input");
By lbtn=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/div/div[2]/form/div[3]");
By pass=By.id("pwdInput");
By back=By.xpath("/html/body/div[1]/div/div/div[1]/div/header/div[1]/ul/li[1]/div/div/div/div[2]/div/div/div[1]");
public Signuppage(WebDriver driver)
{
	this.driver=driver;
}
public void links()
{
	driver.findElement(link).click();
}
public void read(String phnno) 
{
	driver.findElement(phn).sendKeys(phnno);
	driver.findElement(cbtn).click();
}
public void login()
{
   driver.findElement(lbtn).click();
}
public void password(String pwd)
{
driver.findElement(pass).sendKeys(pwd);
driver.findElement(back).click();
driver.navigate().to("https://www.ajio.com/");
}
}