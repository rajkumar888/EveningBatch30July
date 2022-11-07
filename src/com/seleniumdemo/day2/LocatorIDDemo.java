package com.seleniumdemo.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorIDDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://demo.guru99.com/test/facebook.html";
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("...........................");
		
//		driver.findElement(By.id("email")).sendKeys("helloworld@gmail.com");
		
		WebElement eleemail = driver.findElement(By.id("email"));
		eleemail.sendKeys("helloworld@gmail.com");

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
