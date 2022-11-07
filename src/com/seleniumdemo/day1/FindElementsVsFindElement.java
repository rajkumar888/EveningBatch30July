package com.seleniumdemo.day1;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsVsFindElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/";
		driver.get(url);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		// driver.findElement(By.xpath("//span[text()='Downloads']")).click();

		WebElement ele = driver.findElement(By.xpath("//*[contains(text(),'Object')]"));

		System.out.println(ele.getText());

		System.out.println(".................................");

		List<WebElement> elementlist = driver.findElements(By.xpath("//*[contains(text(),'Objdfgsdfg22ect')]"));
		System.out.println(elementlist);
		System.out.println(elementlist.size());

		// System.out.println(elementlist.get(0).getText());
		// System.out.println(elementlist.get(elementlist.size()-1).getText());

		Thread.sleep(5000);

		driver.quit();
		System.out.print("End of the Program.........." + new Date());
	}
}
