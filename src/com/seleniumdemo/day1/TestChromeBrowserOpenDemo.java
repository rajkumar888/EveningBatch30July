package com.seleniumdemo.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestChromeBrowserOpenDemo {

	public static void main(String[] args) throws InterruptedException {

//		System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.selenium.dev/downloads/");

//		String url = "https://www.selenium.dev/downloads/";
//
//		driver.get(url);

		Thread.sleep(5000);

		driver.quit();
//		driver.quit();
//		driver.quit();
//		driver.close();
		

		System.out.println("End of the program.....");

	}

}
