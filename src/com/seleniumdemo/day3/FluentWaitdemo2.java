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
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitdemo2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		driver.findElement(By.xpath("//*[@id='post-body-5280210221385817166']/div[1]/button")).click();

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(100)).ignoring(TimeoutException.class)
				.ignoring(NoSuchElementException.class).ignoring(RuntimeException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id='myAnchor']"));
			}
		});

		System.out.println(element.getText() + ".......................");

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
