package week2.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserChrome {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("#jke3948");
		driver.findElement(By.name("login")).click();
		driver.quit();

	}

}
