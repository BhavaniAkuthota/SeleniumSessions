package seleniumsesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFireFox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Automation Steps:
				WebDriver driver = new FirefoxDriver();// launch firefox

				driver.get("https://www.amazon.com");// enter url
				String title = driver.getTitle();// get the title
				System.out.println(title);

				// verification point/checkpoint/act vs exp result
				if (title.contains("Amazon.com")) {
					System.out.println("correct title");
				} else {
					System.out.println("incorrect title");
				}

				System.out.println(driver.getCurrentUrl());
				driver.quit(); // to close the browser
				//driver.close(); // to close the browser
	}

}
