package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGFeatures {

	//global pre conditions
	// pre conditions
	// test steps ->actual vs expected resuls -- PASS/FAIL
	// post steps
	// Global post steps
	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS--DB connection");
	}
	@BeforeTest
	public void createdUser() {
		System.out.println("BT--createdUser");
	}
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC--openBrowser");
	}
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM--loginToApp");
	}
	@Test
	public void searchTest() {
		System.out.println("test--searchTest");
	}
	@Test
	public void addToCartTest() {
		System.out.println("test--addToCart test");
	}
	@Test
	public void paymentTest() {
		System.out.println("test--paymentTest");
	}
	@AfterMethod
	public void logout() {
		System.out.println("AM--logout");
	}
	@AfterClass 
	public void closeBrowser() {
		System.out.println("AC--closeBrowser");
	}
	@AfterTest
	public void deleteUser() {
		System.out.println("AT--deleteUser");
	}
	@AfterSuite
	public void closedDBConnection(){
		System.out.println("AS- closedDBConnection");
	}
}

