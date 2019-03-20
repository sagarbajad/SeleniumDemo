package newThings;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	@Test
	public void myfirst() {
		// Set the Chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32//chromedriver.exe");
		
		// Create Object of ChromeOption Class
		ChromeOptions c=new ChromeOptions();
		
		//Set the setHeadless is equal to true which will run test in Headless mode
		c.setHeadless(true);
		
		// pass the option object in ChromeDriver constructor
		WebDriver driver=new ChromeDriver(c);
		
		driver.get("http://learn-automation.com/");
		
		System.out.println("Page Title is "+driver.getTitle());
		
		driver.close();
	}
}