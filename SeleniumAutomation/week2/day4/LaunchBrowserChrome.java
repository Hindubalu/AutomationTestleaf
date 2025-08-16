package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome {
	
	public static void main(String[] args) {
		
		// to launch a browser(any browser)
		ChromeDriver driver=new ChromeDriver();
		
		//to maximize(or minimize) the window 
		driver.manage().window().maximize();
		
		//to load the URL in the browser
		driver.get("https://www.google.com");
		
		
		//getTitle method is to get the page title and it's return type is string
		String pageTitle=driver.getTitle();
		
		// to check whether the opened page is correct or not
		if(pageTitle.equals("Google")) {
			System.out.println("The opened page is Google");
		}
		else {
			System.out.println("Not a google page");
		}
		
		//getCurrentURL method is to get the URL of current window and it's return type is string 
		String pageURL=driver.getCurrentUrl();
		
		// to check whether the URL is correct or not
		if(pageURL.contains("google.com")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not verified");
		}
		
		
		//close method is to close the current window/session
		driver.close();
		
		//quit method is to close the entire browser
		driver.quit();
	}

}
