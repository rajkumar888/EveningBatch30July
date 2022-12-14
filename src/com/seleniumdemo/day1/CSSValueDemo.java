package com.seleniumdemo.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSValueDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.facebook.com/";
		driver.get(url);
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait
		
		
		WebElement headerElemnet = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
		System.out.println(headerElemnet.getCssValue("color"));
		System.out.println(headerElemnet.getCssValue("font-size"));
		System.out.println(headerElemnet.getCssValue("font-weight"));
		System.out.println(headerElemnet.getCssValue("letter-spacing"));
		System.out.println(headerElemnet.getCssValue("background-color"));
		System.out.println(headerElemnet.getCssValue("border-bottom-color"));
		System.out.println(headerElemnet.getCssValue("border-bottom-width"));
		System.out.println(headerElemnet.getCssValue("padding"));
		
		
//		String allCssProperties= headerElemnet.getAttribute("style");
//		System.out.println("CSS Properties: "+allCssProperties);
		
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
