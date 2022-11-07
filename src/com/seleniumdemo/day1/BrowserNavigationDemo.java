package com.seleniumdemo.day1;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigationDemo {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.out.print("Start of the Program.........."+new Date());
		
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		
//		System.setProperty("webdriver.chrome.driver", "D:/Project/BrowserDriver/chromedriver.exe");
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		String url = "https://www.selenium.dev/";
		driver.get(url);
		

		Thread.sleep(5000);
		
		
		driver.quit();
//		driver.close();
		
		
		System.out.print("End of the Program.........."+new Date());
	}
}
