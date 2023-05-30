package seleniumsesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

			WebDriver driver; // Class variable is declared to use in all classes - global variable
			//default value is null

		/**
		 * This method is initialize the driver on the basis of given browser. Possible
		 * browsers are chrome, firefox, safari, edge
		 * 
		 * @param browserName
		 * 
		 */
		public  void  initDriver(String browserName) {

			System.out.println("launching the browser: " + browserName);

			if (browserName == null) {
				System.out.println("browser can not be null");
				throw new MySeleniumException("BROWSERNULLEXCEPTION");
			}

			switch (browserName.toLowerCase().trim()) {
			case "chrome":
				ChromeOptions co = new ChromeOptions();
				co.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(co);
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;

			default:
				System.out.println("plz pass the right browser name...." + browserName);
				//break;
			throw new MySeleniumException("WRONGBROWSEREXCEPTION");
			}
		return;
		}
		/**
		 * This method is used launch the application. Please pass the url with the https:// http:
		 * @param url
		 */
		public void launchURL(String url) {
			if(url==null) {
				System.out.println("URL can not be null");
				throw new MySeleniumException("URL NULL EXCEPTION");
			}
			if(url.contains("http")) { //this will handle both http and https //https://www.google.com
				driver.get(url);
			}
			else {
				System.out.println("http(s) is missing");
			}
		}
		public String getPageTitle() {
			return driver.getTitle();
		}
		public String getPageURL() {
			return driver.getCurrentUrl();
		}
		public void quitBrowser() {
			driver.quit();
		}
		public void closeBrowser() {
			driver.close();
		}
}
		
