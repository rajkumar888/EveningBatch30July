package alertDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String url = "http://demo.guru99.com/test/delete_customer.php";
		driver.get(url);

		driver.findElement(By.name("cusid")).sendKeys("1111");
		driver.findElement(By.name("submit")).submit();

		if (driver.switchTo().alert() != null) {
			// Switching to Alert
			Alert alert = driver.switchTo().alert();

			// Displaying alert message
			System.out.println(alert.getText() + "................................");

			Thread.sleep(2000);

			// clicking on ok button on alert
			alert.accept();

			// alert.dismiss();

		}

		Thread.sleep(5000);
		System.out.println("=============================================");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
