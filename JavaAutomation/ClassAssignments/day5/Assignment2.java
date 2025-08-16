package week2.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String pgURL=driver.getCurrentUrl();
		System.out.println(pgURL);
		if(pgURL.contains("dashboard")) {
			System.out.println("The current page is on dashboard-page ");
		}
		else {
			System.out.println("Not in dashboard-page");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.className("oxd-userdropdown-img")).click();
		driver.findElement(By.partialLinkText("Logout")).click();
		
		String pg1URL=driver.getCurrentUrl();
		System.out.println(pg1URL);
		if(pg1URL.contains("login")) {
			System.out.println("Login page is displayed again");
		}
		else {
			System.out.println("Login page is not displayed again");
		}
	}
}

