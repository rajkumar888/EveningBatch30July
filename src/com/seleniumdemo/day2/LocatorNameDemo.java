package com.seleniumdemo.day2;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorNameDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String url = "https://demo.guru99.com/test/newtours/";
		driver.get(url);

		driver.findElement(By.name("userName")).sendKeys("demousername");
		

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
