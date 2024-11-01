package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class LoginPage {

	public WebDriver driver;
@Test	
public void logindetil() {
	driver =new  ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	System.out.println("launch the browser");
}

@AfterTest
public void teardown() {
	driver.quit();
}
	
}
