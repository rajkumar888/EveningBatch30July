package com.seleniumdemo.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrapDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.cssSelector("#menu1")).click();
		Thread.sleep(2000);
		List<WebElement> listOfOptions = driver.findElements(By.xpath("//li/a[@role='menuitem']"));
		
			for(  WebElement option: listOfOptions){
				
				if(option.getText().equals("JavaScript")){
					option.click();
					break;
				}	
			}
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
