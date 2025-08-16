package week2.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nestle {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.unibicfoods.com");
		
		String pgTitle=driver.getTitle();
		if(pgTitle.contains("Unibic")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not verified");
		}
		
		String pgURL=driver.getCurrentUrl();
		if(pgURL.contains("unibicfoods")) {
			System.out.println("Verified");
		}
		else {
			System.out.println("Not verified");
		}	
		
		driver.quit();
	}

}
