package dimensionandpoint;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocationWindowsDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.print("Start of the Program.........."+new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait
		
	
//		System.out.println(driver.manage().window().getPosition());
//		System.out.println(driver.manage().window().getSize());
//		
//		driver.manage().window().maximize();
//		
//		System.out.println(driver.manage().window().getPosition());
//		System.out.println(driver.manage().window().getSize());
		
//		driver.manage().window().setPosition(new Point(20,20));
//		Thread.sleep(2000);
//		driver.manage().window().setPosition(new Point(50,50));
		
		driver.manage().window().setSize(new Dimension(500,300));
		Thread.sleep(2000);
		
		driver.manage().window().setSize(new Dimension(200,100));
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(0,0));
		
		Thread.sleep(5000);
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
