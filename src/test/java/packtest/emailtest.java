package packtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emailtest {

	static WebDriver driver=null;

	@Parameters("username")

	@Test
	public static void emaillogin(String uname) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(uname);
		Thread.sleep(2000);
		driver.quit();	
		}
}
