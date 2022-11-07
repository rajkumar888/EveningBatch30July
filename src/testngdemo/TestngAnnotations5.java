package testngdemo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngAnnotations5 {
	
	@Test()
	public void test1() throws InterruptedException {
		System.out.println("Test Case 1 "+new Date() );
		
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(1, 2);
		System.out.println(Thread.currentThread().getId()+"...........");
		System.out.println("Test Case 1 "+new Date() );
		
		
		softAssert.assertEquals("Hello", "1Hello");
		System.out.println("Test Case 1 "+new Date() );
		
		softAssert.assertEquals("abc1", "abc");
		System.out.println("Test Case 1 "+new Date() );
		
		
		System.out.println("End of Program...............");
		softAssert.assertAll();
		
	}

	
}
