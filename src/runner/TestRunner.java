package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/Test.feature",
        glue = {"steps"},
//        tags = "@smoke",
        monochrome=true
        )

public class TestRunner extends AbstractTestNGCucumberTests{

	
	@BeforeSuite
	public void initsuite(){
		System.out.println("@BeforeSuite annotation");
	}

	
	@BeforeTest
	public void initTest(){
		System.out.println("@BeforeTest annotation");
	}
	
	
	@BeforeClass
	public void initClass(){
		System.out.println("@BeforeClass annotation");
	}
	
	
	@AfterSuite
	public void tearsuite(){
		System.out.println("@AfterSuite annotation");
	}

	
	@AfterTest
	public void tearTest(){
		System.out.println("@AfterTest annotation");
	}
	
	
	@AfterClass
	public void tearClass(){
		System.out.println("@AfterClass annotation");
	}
	
}
