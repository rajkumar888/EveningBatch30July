package alertDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemoPrompt {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		String url = "https://demoqa.com/alerts";
		driver.get(url);

		
//			if(driver.findElements(By.id("cbb")).size()>0){
//				driver.findElements(By.id("cbb")).get(0).click();
//			}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert promptAlert  = new WebDriverWait(driver, Duration.ofSeconds(20))
									.until(ExpectedConditions.alertIsPresent());
		
		
		String inputtext="Accepting the alert";
		promptAlert.sendKeys(inputtext);
		Thread.sleep(5000);
		promptAlert.accept();
		
//		Alert alert = driver.switchTo().alert();
		
//		if(alert!=null){
//			System.out.println(alert.getText()+".........................alert box text message");
//			alert.sendKeys("Test User");
//			Thread.sleep(5000);
//			alert.accept();
//		}
//
		WebElement textele = driver.findElement(By.xpath("//span[contains(.,'You entered') and contains(.,'"+inputtext+"')]"));

		System.out.println(textele.isDisplayed()+"......................");
		
		Thread.sleep(15000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
