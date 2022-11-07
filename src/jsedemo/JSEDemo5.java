package jsedemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSEDemo5 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("disable-popup-blocking");
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
//		String url = "https://www.softwaretestingmaterial.com/javascriptexecutor-selenium-webdriver/#h-scenario-9-to-get-the-url-of-a-webpage";
//		driver.get(url);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		
//		System.out.println(js.executeScript("return document.title;").toString());
//		String sText =  js.executeScript("return document.URL;").toString();
//		System.out.println(sText);
//		
		
		
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 Thread.sleep(5000);
		js.executeScript("document.getElementById('email').value='SoftwareTestingMaterial.com';");
		
		
		Thread.sleep(5000);
		System.out.println("=============================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
