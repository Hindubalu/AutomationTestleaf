package week3.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class DiffWaysToLaunchBrowser {
	public static void main(String[] args) {
		//for manually download the chromeDriver
		//  1st argument--->constant argument based on chrome,edge,firefox
		//  2nd argument---> location of the downloaded exe file
		System.setProperty("webdriver.chrome.driver", "./Driver/Chromedriver.exe");
		
		//for automatically install 
		ChromeDriver driver=new ChromeDriver();
		driver.quit();
	}

}
