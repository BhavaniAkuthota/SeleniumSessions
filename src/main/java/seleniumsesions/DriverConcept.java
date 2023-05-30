package seleniumsesions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverConcept {

	public static void main(String[] args) {
		
		//in Windows we need to give the .exe
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Documents\\SeleniumDrivers\\geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
//		Exception in thread "main" java.lang.IllegalStateException: 
//		The path to the driver executable 
//		The path to the driver executable must be set by the webdriver.gecko.driver system property; 
//		for more information, see https://github.com/mozilla/geckodriver. 
//		The latest version can be downloaded from https://github.com/mozilla/geckodriver/releases

	}

}
