package actionsDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectableDemo {

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
		
		
		
		String url = "https://jqueryui.com/selectable/";
		driver.get(url);
		Actions actions = new Actions(driver);

//		driver.switchTo().frame(0);
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frameElement);
		
		
		List<WebElement> allItems = driver.findElements(By.xpath("//li[contains(text(),'Item')]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", allItems.get(0));

		for (int i = 0; i < allItems.size(); i++) {
			actions.keyDown(Keys.CONTROL)
			.click(allItems.get(i))
			.pause(Duration.ofSeconds(2))
			.perform();
		}
		
		
		actions.keyUp(Keys.CONTROL).build().perform();
		driver.switchTo().defaultContent();

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());

		// WebElement page = driver.findElement(By.tagName("html"));
		// page.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		// page.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT));
		// WebElement item1 = driver.findElement(By.xpath("//li[text()='Item
		// 1']"));
		// WebElement item3 = driver.findElement(By.xpath("//li[text()='Item
		// 3']"));
		// WebElement item5 = driver.findElement(By.xpath("//li[text()='Item
		// 5']"));
		// WebElement item7 = driver.findElement(By.xpath("//li[text()='Item
		// 7']"));

		// actions.sendKeys(Keys.CONTROL,Keys.SUBTRACT)
		// .pause(Duration.ofSeconds(2))
		// .sendKeys(Keys.CONTROL,Keys.SUBTRACT)
		// .build().perform();

	}

}
