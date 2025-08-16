package week4.day5;

import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	//Information from the application to the user
	//Without handling the alert we can't able to perform other actions bcoz the have used javascript
	//it has two types 
	//1.Model Dialogue box--> 
	//	Simple alert(It has only one button)
	//	Confirmation alert(It has two buttons)
	//	Prompt alert(It has to type something[2 buttons,1 fields])
	//2.Non-model Dialogue box-->
	
	//leafground.com
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com");
		
	}

}
