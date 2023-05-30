package seleniumsesions;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchURL("https://www.amazon.com");
		
		String actTitle= brUtil.getPageTitle();
		System.out.println("page title:"+actTitle);
		Verify.equalValues(actTitle,"Amazon.com. Spend less. Smile more.");
		
		String actUrl = brUtil.getPageURL();
		System.out.println("page url:"+actUrl);
		
		Verify.containValues(actUrl,"amazon");
		brUtil.quitBrowser();
		
//		if(actTitle.contains("Amazon.com")) {
//		System.out.println("Pass--title");
//	}
//	else {
//		System.out.println("Fail-- title");
//	}
//		if(actUrl.contains("amazon")) {
//			System.out.println("Pass--URL");
//		}
//		else {
//			System.out.println("Fail--URL");
//		}

	}

}
