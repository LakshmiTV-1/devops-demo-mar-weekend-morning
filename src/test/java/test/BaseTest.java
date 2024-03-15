package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	public static WebDriver driver;
	String Url ="https://www.fb.com";
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get(Url);;
	}
	@AfterTest
	public void tearDown() {
		//close the browser
	}
	
		
		
	}


