package packtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class emailtest {

	static WebDriver driver=null;
	
	@Test
	public static void emaillogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://mail.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']"));
	}
}
