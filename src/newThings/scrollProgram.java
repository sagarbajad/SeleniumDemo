package newThings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Environment\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //To launch softwaretestingmaterial.com
		 driver.get("https://www.softwaretestingmaterial.com");
		 
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");//executeScript("window.scrollBy(x-pixels,y-pixels)");
		 
		 WebElement element=driver.findElement(By.xpath("locator"));
		 js.executeScript("arguments[0].scrollIntoView();", element);//This will scroll the page till the element is found
		 
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
	}
}