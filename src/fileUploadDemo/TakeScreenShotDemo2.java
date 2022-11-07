package fileUploadDemo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShotDemo2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.out.print("Start of the Program.........." + new Date());
		Runtime.getRuntime().exec("taskkill /F /T /IM chromedriver.exe");
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("test-type");
		options.addArguments("disable-popup-blocking");
		options.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		String url = "https://www.selenium.dev/downloads/";
		driver.get(url);

		SimpleDateFormat dateformat = new SimpleDateFormat("EEE dd_MMM_yyyy HH_mm_ss");
		String filename = dateformat.format(new Date());
		
		WebElement javalogo = driver.findElement(By.cssSelector("img[src='/images/programming/java.svg']"));
		File srcfilename = ((TakesScreenshot) javalogo).getScreenshotAs(OutputType.FILE);
		
		File destinationFileName = new File("./Screenshots/" + filename + ".png");
//		Files.copy(srcfilename, destinationFileName);
		FileUtils.copyFile(srcfilename, destinationFileName);
		
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("End of program......................." + new Date());

	}

}
