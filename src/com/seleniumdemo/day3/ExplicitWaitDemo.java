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

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		
		
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement guru99seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.guru99.com/selenium-tutorial.html']")));
		
		guru99seleniumlink.click();

		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
