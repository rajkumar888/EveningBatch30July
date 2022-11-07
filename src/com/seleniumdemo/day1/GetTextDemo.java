package com.seleniumdemo.day1;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.selenium.dev/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // global

		List<WebElement> allelements = driver.findElements(By.xpath("//h2"));

		System.out.println("Total count " + allelements.size());

		for (WebElement e : allelements) {
			System.out.println(e.getText());
		}
		System.out.println("===================================================");
		
		WebElement h1ele = driver.findElement(By.xpath("//h1"));
		System.out.println(h1ele.getText());
		System.out.println(h1ele.isDisplayed());
		
		
		Thread.sleep(5000);
		System.out.println("===================================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........." + new Date());
	}
}
