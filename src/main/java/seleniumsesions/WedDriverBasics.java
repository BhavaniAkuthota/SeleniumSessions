package seleniumsesions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WedDriverBasics {

	public static void main(String[] args) {
		
		//chrome 111.x
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		// Automation Steps:
		WebDriver driver = new ChromeDriver(co);// launch safari

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

	}

}
