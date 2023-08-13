package test;

import org.testng.annotations.Test;

import page.Fbcreatepage;
import basepkg.Baseclass;


public class Fbcreatetest extends Baseclass {
	
	@Test
	public void fbtest()
	{
		Fbcreatepage obj=new Fbcreatepage(driver);
		obj.setvalues();
		obj.login();
		
	}
}
