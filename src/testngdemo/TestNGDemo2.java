package testngdemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo2 {

	@Test(priority=1)
	public void t4() {
		System.out.println("Welcome to testng t4");
	}

	@Test(priority=2)
	public void t2() {
		System.out.println("Welcome to testng t2");
	}

	@Test(priority=-10)
	public void t5() {
		System.out.println("Welcome to testng t5");
	}

	@Test(priority=-100)
	public void t3() {
		System.out.println("Welcome to testng t3");
		// Assert.assertTrue(false);
	}

	@Test
	public void t1() {
		System.out.println("Welcome to testng t1");
	}

}
