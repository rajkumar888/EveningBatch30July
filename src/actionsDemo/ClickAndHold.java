package actionsDemo;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold {

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
		
		String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
		driver.get(url);
		Actions actions = new Actions(driver);

		// Locate the element C by By.xpath.
		WebElement titleA = driver.findElement(By.xpath("//li[text()= 'A']"));
		WebElement titleB = driver.findElement(By.xpath("//li[text()= 'B']"));
		WebElement titleG = driver.findElement(By.xpath("//li[text()= 'G']"));

		// Call clickAndHold() method to perform click and hold operation on
		// element C.
		actions
		.clickAndHold(titleB)
		.pause(Duration.ofSeconds(2))
		.moveToElement(titleG)
		.pause(Duration.ofSeconds(2))
		.release()
		.build().perform();

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
