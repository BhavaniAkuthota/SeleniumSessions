package seleniumsesions;

public class FlipkartTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchURL("https://www.flipkart.com");
		
		String actTitle= brUtil.getPageTitle();
		System.out.println("page title:"+actTitle);
		Verify.equalValues(actTitle,"Online Shopping Site");
		
		String actUrl = brUtil.getPageURL();
		System.out.println("page url:"+actUrl);
		
		Verify.containValues(actUrl,"flipkart");
		brUtil.quitBrowser();
	}

}
