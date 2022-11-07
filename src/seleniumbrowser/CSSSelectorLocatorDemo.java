package seleniumbrowser;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSSelectorLocatorDemo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.print("Start of the Program.........." + new Date());

		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String url = "https://www.firstflight.com.sg/";
		driver.get(url);

		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("#track_awbs"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector(".t-area"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("textarea[id='track_awbs']"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("[id='track_awbs']"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("textarea[id='track_awbs'][name='AWB']"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("textarea[id='track_awbs'],[name='AWB']"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("textarea[id^='track']"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("textarea[id$='awbs']"));
		// WebElement textareaTrack =
		// driver.findElement(By.cssSelector("textarea[id*='ck_aw']"));
		WebElement textareaTrack = driver.findElement(By.cssSelector("form[name='trackback'] > textarea"));

		textareaTrack.clear();
		textareaTrack.sendKeys("Hello World");

		System.out.println(textareaTrack.getAttribute("value") + "  .........................");

		Thread.sleep(5000);
		textareaTrack.clear();

		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
