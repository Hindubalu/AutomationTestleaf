package leafground;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Dropdown']")).click();
		//driver.findElement(By.xpath("//span[text()='Dropdown']")).getDomProperty("");
		
		//sdriver.findElement(By.id(""));
		//driver.switchTo().frame("");
		
	}

}
