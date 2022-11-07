package seleniumbrowser;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageTimeOutDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		
		
		String url = "https://www.facebook.com/";
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.findElement(By.id("u_0_d_mT")).click();
		
		WebElement element = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		
//		driver.get(url);
		driver.navigate().refresh();
		element = driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]"));
		element.click();
		

		
//		System.out.println(driver.manage().timeouts().getPageLoadTimeout().getSeconds()+" page load timeout");
//		
//		driver.findElement(By.cssSelector("button[id*='u_0_d_']")).click();
		
		
		
		
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
