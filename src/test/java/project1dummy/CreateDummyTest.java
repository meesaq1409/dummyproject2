package project1dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateDummyTest {

	
	@Test
	
	public void demo()
	{	WebDriver driver = null;
	
//		String browser=System.getProperty("browser");
//		String url = System.getProperty("url");
//	
//		if(browser.equals("chrome"))
//		{
//			driver=new ChromeDriver();
//			driver.get(url);	
//		}
		
		
		System.out.println("hello there");
	}
	
	
	@Test(groups="regressionsuite")
	public void execute()
	{
		System.out.println("vbcbg");
	}
}
