package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemoRightClickFireFox2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM geckodriver.exe");
//		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		Actions actions = new Actions(driver);
		WebElement txtUsername = driver.findElement(By.id("email"));

		actions
		.moveToElement(txtUsername)
		.pause(Duration.ofSeconds(2))
		.click()
		.pause(Duration.ofSeconds(2))
				.keyDown(txtUsername, Keys.SHIFT)
				.pause(Duration.ofSeconds(2))
				.sendKeys(txtUsername, "hello")
				.pause(Duration.ofSeconds(2))
				.keyUp(txtUsername, Keys.SHIFT)
				.pause(Duration.ofSeconds(2))
				.doubleClick(txtUsername)
				.pause(Duration.ofSeconds(2))
				.contextClick()
				.pause(Duration.ofSeconds(2))
				.sendKeys(txtUsername,Keys.DOWN)
				.pause(Duration.ofSeconds(2))
				.sendKeys(txtUsername,Keys.DOWN)
				.pause(Duration.ofSeconds(2))
				.sendKeys(txtUsername,Keys.ENTER)
				.pause(Duration.ofSeconds(5))
				.build()
				.perform();

//		WebElement forgottenpasswordLink = driver.findElement(By.linkText("Forgotten password?"));
//		WebElement marketplaceLink = driver.findElement(By.linkText("Marketplace"));
//
//		actions
//		.keyDown(Keys.CONTROL)
//		.click(forgottenpasswordLink)
//		.pause(Duration.ofSeconds(2))
//		.click(marketplaceLink)
//		.keyUp(Keys.CONTROL)
//		.build().perform();
//
//		Set<String> allwinIds = driver.getWindowHandles();
//		System.out.println(allwinIds.size());
//
//		for (String id : allwinIds) {
//			driver.switchTo().window(id);
//
//			System.out.println(driver.getTitle());
//			System.out.println(driver.getCurrentUrl());
//			Thread.sleep(2000);
//			System.out.println();
//		}

		Thread.sleep(5000);
		System.out.println("=============================================");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getCurrentUrl());
//		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
