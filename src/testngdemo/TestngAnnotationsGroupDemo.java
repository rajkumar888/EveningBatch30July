package testngdemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

public class TestngAnnotationsGroupDemo {
	
	@Test(groups="Smoke")
	public void test1() {
		System.out.println("Test Case 1");
		Assert.assertEquals(1, 1, "Comaparison is failed.............");
	}

	@Test(groups="Smoke")
	public void test2() {
		System.out.println("Test Case 2");
		Assert.assertEquals("Hello", "Hello", "Comaparison is failed.............");
	}
	

//	@Test(dependsOnMethods={"test2"},alwaysRun=true)
	
	@Test(groups="Sanity")
	public void test3() {
		System.out.println("Test Case 3");
		Assert.assertEquals(1, 1, "Comaparison is failed.............");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("........................\nBefore Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("........................\nBefore Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("........................\nBefore Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
//
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("........................\nBefore Suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@BeforeGroups("Smoke")
	public void beforeGroupsdemo() {
		System.out.println("........................\nBefore Groups");
	}

	@AfterGroups("Sanity")
	public void afterGroupsdemo() {
		System.out.println("After Groups");
	}
}
