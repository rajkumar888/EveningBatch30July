package com.seleniumdemo.day2;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectListOptionPrinting {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://www.facebook.com/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.findElement(By.cssSelector("a[id*='u_0_0_']")).click();

		
		WebElement elemonth = driver.findElement(By.cssSelector("#month"));
		
		Select month = new Select(elemonth);
		
		List<WebElement> alloptions = month.getOptions();
		
			for( WebElement opt : alloptions){
				
				System.out.println(opt.getText());
			}
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
