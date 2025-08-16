package leafground;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			
			// get method is used to pass the url that is to be opened in browser
			driver.get("https://www.leafground.com");
			
			//implicit wait--> it applies globally to all actions
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			// to maximize the window
			driver.manage().window().maximize();
			
			// to minimize the window
			driver.manage().window().minimize();
			
			//to fullscreen view of the window
			driver.manage().window().fullscreen();
			
			//to normal view from fullscreen
			driver.manage().window().minimize();
			
			//to close the window
			driver.close();
			
			//to close the entire webdriver(browser)
			driver.quit();
			
		}

}
