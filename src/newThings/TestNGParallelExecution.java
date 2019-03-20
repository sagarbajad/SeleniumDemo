package newThings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelExecution {
	
	@Test
	public void executeSessionOne() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/V4/");
	Thread.sleep(10000);
	driver.findElement(By.name("uid")).sendKeys("driver1");
	}
	
	@Test
	public void executeSessionTwo() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver2=new ChromeDriver();
	driver2.get("http://demo.guru99.com/V4/");
	Thread.sleep(10000);
	driver2.findElement(By.name("uid")).sendKeys("driver2");
	}
	
	@Test
	public void executeSessionThree() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver3=new ChromeDriver();
	driver3.get("http://demo.guru99.com/V4/");
	Thread.sleep(10000);
	driver3.findElement(By.name("uid")).sendKeys("driver3");
	
	}	
}