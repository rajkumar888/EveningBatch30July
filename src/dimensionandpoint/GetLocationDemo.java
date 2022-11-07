package dimensionandpoint;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLocationDemo {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.out.print("Start of the Program.........."+new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));  // global wait or implicit wait
		
		WebElement createnewaccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createnewaccount.click();
		
		WebElement radiofemale = driver.findElement(By.xpath("//label[text()='Female']"));
		System.out.println(radiofemale.isSelected());
		
		Thread.sleep(1000);
		radiofemale.click();
		radiofemale = driver.findElement(By.xpath("//label[text()='Female']"));
		System.out.println(radiofemale.isSelected());
		
//		WebElement loginbutton = driver.findElement(By.name("login"));
//		
//		System.out.println("loginbutton is displayed "+loginbutton.isDisplayed());
//		System.out.println("loginbutton is enabled "+loginbutton.isEnabled());
		
		
//		WebElement headerElement = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));
		
		
//		System.out.println(headerElement.getLocation());
//		
//		System.out.println(headerElement.getLocation().getX());
//		System.out.println(headerElement.getLocation().getY());
////	
//		System.out.println("............................");
//		System.out.println(headerElement.getSize());
//		System.out.println(headerElement.getSize().getHeight());
//		System.out.println(headerElement.getSize().getWidth());
//
//		
//		System.out.println("............................");
//		System.out.println(headerElement.getRect());
//		System.out.println(headerElement.getRect().getX());
//		System.out.println(headerElement.getRect().getY());
//		System.out.println(headerElement.getRect().getHeight());
//		System.out.println(headerElement.getRect().getWidth());
	
		
//		System.out.println(headerElement.getTagName());
//		
		Thread.sleep(5000);
//		System.out.println("===================================================");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.print("End of the Program.........."+new Date());
	}
}
