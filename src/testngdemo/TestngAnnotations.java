package testngdemo;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	@Test(invocationCount=50,threadPoolSize=50)
	
	public void test1() throws InterruptedException {
		
		System.out.println("Test Case 1 "+new Date() +" "+Thread.currentThread().getId()+"......");
		
//		Assert.assertEquals(1, 2, "Comaparison is failed.............");
		
		
//		Assert.assertTrue(false);
		
//		Assert.assertFalse(true);
		
		System.out.println("Passsed....");
		
	}

	
}
