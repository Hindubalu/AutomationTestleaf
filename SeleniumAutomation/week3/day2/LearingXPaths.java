package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearingXPaths {
	
	public static void main(String[] args) {
		
		/*
		 * XPath---> to identify the elements 
		 * Two types of XPath:
		 *  1.Absolute XPath--starts from root node and traverse through every node 
		 *                    till it reaches destination(/-single back slash is used)
		 *  2.Relative XPath--starts with current node(//-double back slash is used)
		 *  
		 *    Two types of relative XPath:
		 *    	1.Basic XPath:
		 *    		==>Attributes based - //tagName[@attributeName='attributeValue']
		 *    		==>Text based - //tagName[text()='taxtValue'] 
		 *    		==>contains Attributes based - //tagName[contains(@attributeName,'attributeValue')]
		 *    		==>contains text based - //tagName[contains(text(),'textValue')]
		 *    		==>Index based - (//tagName[@attributeName='attributeValue'])[2]
		 *    	2.Advanced XPath:
		 *    		==>Parent to child
		 *    		==>Grandparent to GrandChild
		 */
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
	}

}
