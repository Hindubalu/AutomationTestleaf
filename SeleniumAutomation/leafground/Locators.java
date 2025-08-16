package leafground;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		//sendKeys is used to pass the value to the field
		//.click is used to click the button
		
		// id locator
		driver.findElement(By.id("email")).sendKeys("abcdefgh@gmail.com");
		
		
		//name locator
		//driver.findElement(By.name("email")).clear();
		
		//className locator
		//driver.findElement(By.className("ui-inputfield ui-inputtext ui-widget ui-state-default ui-corner-all")).sendKeys("name@gmail.com");
		
		//tagName locator
		driver.findElement(By.tagName("E-mail Address")).sendKeys("name@gmail.com");
		
		//linkText locator
		
		//partialLinkText locator
	}

}
