package com.seleniumdemo.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IsSelectedDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.print("Start of the Program.........."+new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://demo.guru99.com/test/radio.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait
		
		WebElement option1 = driver.findElement(By.xpath("//input[@value='Option 1']"));
		System.out.println(option1.isSelected());
		Thread.sleep(1000);
		option1.click();
		System.out.println(option1.isSelected());
		
		Thread.sleep(5000);
//		System.out.println("===================================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
