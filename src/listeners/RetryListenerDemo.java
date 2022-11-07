package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class RetryListenerDemo {
	
	@Parameters({"browser", "username", "password" })

	@Test()
	public void test1(String browser,String username, String password) {
		// Negative Scenario
//		System.out.println("failed test case.....");
		System.out.println("browser is "+browser);
		System.out.println("Username is "+username);
		System.out.println("password is "+password);
		Assert.assertFalse(true);

	}

	@Parameters({"username", "password" })
	@Test()
	public void test3(String username, String password) {
		// Postive Scenario
		// Assert. assertEquals(4,4,"Addition Problem! 2+2 must be 4!\n");
		// Assert.assertTrue(false);
//		System.out.println("pass test case test case.....");
		
		System.out.println("Username is "+username);
		System.out.println("password is "+password);
		Assert.assertFalse(false);
	}

}
