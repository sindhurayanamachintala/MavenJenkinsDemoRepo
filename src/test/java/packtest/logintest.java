package packtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	static WebDriver driver;
	
	// Testcase-1: to luanch the browser
	@Parameters("browsers")
	@Test    
	public static void startBrowser(String BrowserName) throws InterruptedException
	{
       System.out.println("Brower name is :"+BrowserName);
     
		if(BrowserName.contains("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			Thread.sleep(1000);

		}
		else if(BrowserName.contains("Edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}

		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Orange"), "Title does not macth");
		driver.quit();
	}
	
	// Testcase-2: to execute in dev environment
	@Parameters("env")
	@Test
	public static void envname(String environmentName)
	{
		System.out.println("Brower name is :"+environmentName);
		
	}
	
}




