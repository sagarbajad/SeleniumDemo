package newThings;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver", "D:\\Selenium Environment\\Drivers\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 //To launch softwaretestingmaterial.com
		 driver.get("https://www.softwaretestingmaterial.com");
		 
		String mainWindow= driver.getWindowHandle();
		
		Set<String> s= driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		it=s.iterator();
		while(it.hasNext())
		{
			String childwindow=it.next();
			if(!mainWindow.equals(childwindow)) {
				driver.switchTo().window(childwindow);
				System.out.println(driver.switchTo().window(childwindow).getTitle());
				driver.close();
			}
		}

		driver.switchTo().window(mainWindow);
	}
}