package com.seleniumdemo.day3;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitDemo4 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// Start application
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");

		// Click on timer button to start
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();

		// By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		WebElement element = wait
								.until(
						ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Selenium Practise')]")));

		boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== Selenium Practise is visible======");
		} else {
			System.out.println("===== Selenium Practise is not visible======");
		}

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
