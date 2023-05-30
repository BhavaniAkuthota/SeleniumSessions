package testngsessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionConcept {

	@Test
	public void searchTest() {
		String name = "macbook";
		Assert.assertEquals(name, "macbook");
	}
	@Test
	public void printTest() {
		String name = "book";
		Assert.assertEquals(name, "macbook");
	}
	@Test
	public void sumTest() {
		int a= 10;
		int b=20;
		int sum = a+b;
		Assert.assertEquals(sum, 30);
	}
	@Test
	public void nameTest() {
		String userName = "Bhavani";
		Assert.assertNotNull(userName);
	}
	@Test
	public void isEleDisplayed() {
		String loginBtn = "loginAmazonButton";
		Assert.assertTrue(loginBtn.contains("loginAmazon"));
	}
	@Test
	public void isUserInActive() {
		boolean inactiveFlag=false;
		Assert.assertFalse(inactiveFlag);
	}
	@Test
	public void divTest() {
		double c=30;
		double d=4;
		double div= c/d;
		Assert.assertEquals(div, 7.5);
		
	}
	@Test
	public void charTest() {
		char a1='a';
		Assert.assertEquals(a1, 'a');
	}
}
