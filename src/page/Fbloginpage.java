package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
	WebDriver driver;
By fbemail=By.id("email");
By fbpswd=By.id("pass");
By fbloginbtn=By.name("login");
public Fbloginpage(WebDriver driver)
{
	this.driver=driver;
}
public void setvalues(String email,String pswd)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpswd).sendKeys(pswd);

}
public void login()
{
	driver.findElement(fbloginbtn).click();

}
}
