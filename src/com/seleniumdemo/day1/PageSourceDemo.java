package com.seleniumdemo.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSourceDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait
		
//		System.out.println(driver.getPageSource());
		
//		System.out.println(driver.getPageSource().contains("Copyright The Closure Library Authors."));
		System.out.println(driver.getWindowHandle());
		System.out.println(".....................");
		Set<String> setdemo = driver.getWindowHandles();
		
		System.out.println(setdemo.size());
		
		System.out.println(setdemo);
		
		
		WebElement emailid = driver.findElement(By.cssSelector("#email"));
		
		emailid.sendKeys("HelloWorld@gmail.com");
		
		Thread.sleep(2000);
		emailid.clear();
		Thread.sleep(2000);
		emailid.sendKeys("Welcome@gmail.com");
		Thread.sleep(2000);
		emailid.clear();
		emailid.sendKeys("Computer");
		Thread.sleep(2000);
		emailid.clear();
	
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
