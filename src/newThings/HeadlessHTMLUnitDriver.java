package newThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessHTMLUnitDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//HtmlUnitDriver was a part of Selenium main distribution package prior to Selenium version 2.53. 
		//From 2.53 version, you need to add it separately. 
		
		// Declaring and initialize  HtmlUnitWebDriver
		WebDriver driver=new HtmlUnitDriver();
		
		driver.get("http://learn-automation.com");
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-3753\"]/a/span")).click();
		
		Thread.sleep(5000);
		
		// Print the title
		System.out.println("Title of the page "+ driver.getTitle());
		
		driver.close();		
	}
}