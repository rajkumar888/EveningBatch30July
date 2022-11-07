package com.seleniumdemo.day3;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitdemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String url = "https://www.happiness.com/";

		driver.get(url);

		// driver.findElement(By.name("regEmail")).sendKeys("warren");
		// driver.findElement(By.name("regPassword1")).sendKeys("warren");
		// driver.findElement(By.className("btn-success")).click();

		driver.findElement(By.xpath("//button[text()='Accept all'][@role='button']")).click();

		// WebDriverWait wait = new
		// WebDriverWait(driver,Duration.ofSeconds(20));
		// WebElement nameElement
//		 =wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("regEmail")));
		//
		// nameElement.sendKeys("warren");

		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(TimeoutException.class)
				.ignoring(RuntimeException.class);

		WebElement nameElementdemo = fwait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.name("regEmail"));
			}
		});

		nameElementdemo.sendKeys("warren");

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
