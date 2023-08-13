package pkg;
import org.openqa.selenium.chrome.ChromeDriver;
public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actual=driver.getTitle();
		String s="Google.com";
		System.out.println("Actual Title:"+actual);
		if(s.equals(actual))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");

		}

	}

}
