package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import basepkg.Baseclass;
import page.Fbloginpage;
import utilies.Excleutilies;
public class Fblogintest extends Baseclass{
	@Test
	public void verifyLoginWithValidCred()throws Exception
	{
		Fbloginpage p1=new Fbloginpage(driver);
String x1="C:\\Users\\Lenovo\\Desktop\\Luminar\\prgm1.xlsx";
String Sheet="Sheet1";
int rowCount=Excleutilies.getRowCount(x1,Sheet);
for(int i=1;i<=rowCount;i++)
{
	String UserName=Excleutilies.getcellvalue(x1, Sheet, i, 0);
	System.out.println("Username----"+UserName);
	String Pwd=Excleutilies.getcellvalue(x1, Sheet, i, 1);
	System.out.println("Password----"+Pwd);
	p1.setvalues(UserName, Pwd);
	p1.login();
	String exp="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg2NjM3OTA3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
	String actual=driver.getCurrentUrl();
	if(actual.equals(exp))
	{
		System.out.println("PASS");

	}
	else
	{
		System.out.println("FAIL");
	}
}
	}

}
