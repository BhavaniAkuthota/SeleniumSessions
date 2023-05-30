package testngsessions;

import org.testng.annotations.Test;

public class TestWithPriority {
	@Test(priority=0)
	public void searchTest() {
		System.out.println("test--searchTest");
	}
	@Test(priority=1)
	public void addToCartTest() {
		System.out.println("test--addToCart test");
	}
	@Test(priority=2)
	public void paymentTest() {
		System.out.println("test--paymentTest");
	}
	@Test(priority=-1)
	public void aTest() {
		System.out.println("test--aTest");
	}
	@Test(priority=2)
	public void bTest() {
		System.out.println("test--bTest");
	}
}
