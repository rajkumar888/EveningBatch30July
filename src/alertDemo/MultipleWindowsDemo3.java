package alertDemo;

import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowsDemo3 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("disable-popup-blocking");
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);

		// driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String url = "https://www.naukri.com/";
		driver.get(url);

		String mainwindow = driver.getWindowHandle();
		System.out.println(mainwindow);

		Set<String> setofwidnows = driver.getWindowHandles();
		System.out.println(setofwidnows.size());
		System.out.println(setofwidnows + " ...................");

		Thread.sleep(5000);
		System.out.println("=============================================");
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getCurrentUrl());
		 driver.quit();
		System.out.println("End of program......................." + new Date());
	}

}
