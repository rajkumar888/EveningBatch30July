package testngdemo;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethodParallelExecution {

	WebDriver driver;

	@BeforeMethod
	@Parameters(value = "browser")

	public void setUp(String browser) throws Exception {

		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Current Date and time is " + new Date() + " for browser name " + browser);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.out.println("Current Date and time is " + new Date() + " for browser name " + browser);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("Current Date and time is " + new Date() + " for browser name " + browser);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			throw new RuntimeException("Invalid broswername");
		}
	}

	@Test
	public void login() {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		if (driver != null) {
			Thread.sleep(5000);
			driver.quit();
		}
	}
}
