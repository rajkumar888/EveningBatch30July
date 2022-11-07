package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String url = "https://www.google.co.in/";
		driver.get(url);

//		 WebElement googlesearch =driver.findElement(By.xpath("//input[@name='q' and @title='Search']"));
//		 WebElement googlesearch =driver.findElement(By.xpath("//input[@name='q']"));
//		 WebElement googlesearch =driver.findElement(By.xpath("//input[@name='q'][@title='Search']"));
//		 WebElement googlesearch =driver.findElement(By.xpath("//*[@name='q'][@title='Search']"));
		 WebElement googlesearch =driver.findElement(By.xpath("//*[@name='q' or @title='Search']"));
//		WebElement googlesearch = driver.findElement(By.cssSelector("input[name='q']"));
		googlesearch.clear();
		googlesearch.sendKeys("Selenium", Keys.ENTER);

		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
