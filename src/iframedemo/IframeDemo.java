package iframedemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("disable-popup-blocking");
		options.addArguments("--start-maximized");
		options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//		options.addArguments("--headless");
		options.addArguments("--incognito");
		options.addArguments("--disable-infobars");
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		String url="http://demo.guru99.com/test/guru99home/";
		driver.get(url);
		
//		 driver.switchTo().frame(8);  // index
//		 driver.switchTo().frame("a077aa5e");  // id or name is same here
		 
		 WebElement frameEle = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		 driver.switchTo().frame(frameEle);
		
		 System.out.println("********We have switched to the iframe*******");
		 driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		 driver.switchTo().defaultContent();
//		 driver.switchTo().parentFrame();
		 
		 
		 
		
		 System.out.println(driver.findElement(By.xpath("//h3[text()='Email Submission']")).isDisplayed());
		

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
