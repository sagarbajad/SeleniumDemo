package newThings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*

ACCENTURE
About yourself
Roles & responsibilities
1. What is WebDriver in WebDriver driver=new ChromeDriver() ?
2. 2nd max salary?
3. What are the Collections in Java?
4. Have you used List, Set? Explain.
5. What is DataProvider? Explain with example.
6. If there are 10 test cases failed out of 50, how to execute those 10 in the 2nd run?
7. How many team members? How do you estimate Test Automation? What is TCP? Test Case Point Analysis
8. What is Jenkins? Explain how to set up Jenkins job?
9. Explain Selenium DB connectivity?
10. Implicit Wait and Explicit Wait?
11. What are the Selenium exceptions? Give any 10.
12. Which framework do you use? Explain?
13. What is Page Object Model design pattern?
14. What is testNG? 
15. How to read from Excel file?
16. Explain page factory used in your project.
17. Java program to print below pattern:
 	*
 	**
 	***
18. In Selenium, how will you identify that the website is HTML or AJAX?
19. TestNG - Tell me how to execute 1000 test cases out of 5000?
20. Version control? SVN/Git? Explain.
21. Do you know mobile automation?
22. Do you know SoapUI automation? What are the different assertions?
23. Do you know Groovy Script?
24. What is BDD?
25. Do you know Cucumber? Explain TestRunner.
26. How to read from config.properties file?
27. Do you know Javascript?

 */

public class checkWebsiteIsHTMLorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.guru99.com/handling-ajax-call-selenium-webdriver.html");
		
		String url=driver.getCurrentUrl();
    	
    	if(url.contains(".html")) {
    		System.out.println("Website is HTML");
    	}
    	else
    	{
    		System.out.println("Website is Ajax");
    	}

	}

}
