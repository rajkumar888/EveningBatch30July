package com.seleniumdemo.day1;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetArrtibuteDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.selenium.dev/downloads/";
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("...........................");

		WebElement element = driver.findElement(By.xpath("//a[text()='4.4.0']"));
		
		System.out.println(element.getAttribute("href"));

		Thread.sleep(5000);

		driver.quit();
		System.out.print("End of the Program.........." + new Date());
	}
}
