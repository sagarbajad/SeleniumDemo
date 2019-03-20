package newThings;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IQ {
	
	/*
	 Part 1 - Selenium Tool
	 Part 2 - Selenium Framework
	 Part 3 - Core Java 
	
Part 1
1. Difference between get and navigate methods 
=> navigate() is faster than get() because navigate() does not wait for the page to load fully or completely.
2. Difference between quit and close methods
=> WebDriver.Close() This method is used to close the current open window. It closes the current open window 
on which driver has focus on. WebDriver.Quit() This method is used to destroy the instance of WebDriver. 
It closes all Browser Windows associated with that driver and safely ends the session.
3. Difference between Implicit wait and Explicit wait
4. In how many ways Frames can be handled?
5. Code to handle 3rd child window.
6. How to handle HTTPs certification?
7. Different types of locators present in WebDriver
=> xPath, cssSelector, id, classname, linkText, partialLinlText, name, tagName
8. Write syntax for xPath and css if id and tag are given.
=> xPath //tagName[@id='value'] | css=tagName[id='value']
9. How to use contains regular expression in xPath?
=> for dynamic -> //tagName[contains(id,'uo')]
10. How to use regular expression in css?
=> tagName[id*,'uo']
11. What is the class available in Selenium to handle the dropdown?
=> Select class.
12. What is the method to check if checkbox is selected?
=> isSelected() -> driver.findElement(By.id("locator")).isSelected();
13. How to validate if element is visible/hidden in webpage?
=> isDisplayed() -> driver.findElement(By.id("locator")).isDisplayed();
14. How to get count of similar object list in the webpage?
=> findElements and size() -> driver.findElements(By.className("classname")).size();
15. Importance of DesiredCapabilities?
=> Class which describes browser/OS properties. How it should react? to set behavior.
It helps to set an environment to define the behavior of the browser/environment on which the test can be executed.
In Selenium grid when we want to run the test cases on a different browser with different operating systems and versions.
16. How to enter text in CAPSLOCK?
=> using Actions class or driver.findElement(By.name("name")).sendKeys(Keys.SHIFT,"sagar");
17. How to mouse hover on the webpage?
=> using Actions class, build().perform()..See below 
18. Methods to handle JavaAlert?
=> driver.switchTo().alert(); In total, there are 3 switches - Frame, Windows, Alert
19. How to get links count in webpage?
=> driver.findElements(By.tagName("a")).size();
20. How to validate if we are navigated to child window successfully?
=> driver.getTitle();
21. Difference between Absolute and Relative xPath?
=> Absolute-> Complete path from the Root Element to the desire element(html/body), need to traverse..
Because in future any of the webelement when added/Removed then Absolute Xpath changes. So Always use Relative Xpaths.
html/body/div[1]/section/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/div/h4[1]/b
Relative -> referencing the element you want and go from there. Search the element anywhere at the webpage. 
//[@class='featured-box']
22. Write down the sample xPath syntax to handle parent to child object?
=> //parent/child
23. What driver is must to run test in Firefox browser?
=> geckoDriver (from version 43)
24. What driver is must to run test in Chrome browser?
=> chromeDriver
25. How do you set browser through script?
=> System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
26. Difference between findElement and findElements?
=> findElement - for finding element object uniquely.
findElements - for collecting similar behavior from multiple objects. eg., total links count
27. List out methods available in ExplicitWait?
=> elementToBeClickable(), textToBePresentInElement(), alertIsPresent(), titleIs(), frameToBeAvailableAndSwitchToIt()
28. How to take screenshots in selenium webdriver?
29. How to hit enter from webdriver commands?
=>driver.findElement(By.name("name")).sendKeys(Keys.ENTER); OR by using Actions class.

30. How to identify webelement which has same xPath?
=> Using position of the webelement
./Select/AddToCart[1]
./Select/AddToCart[2]
./Select/AddToCart[3]

31. difference between assert and verify?
Assert - When assertion fails, all test steps after that line of code are skipped. 
The test method is aborted as soon as failure occurs. 
Verify - When verify fails, the test will continue executing and logging the failure.
The test method to continue execution even after the failure of the assertion statements.
- TestNG does not support Verify. In TestNG, Verify is implemented using SoftAssert class. 

1. StaleElementReferenceException 
- The element has been deleted entirely.
- The element is no longer attached to the DOM.

2. ElementNotVisibleException
3. ElementNotSelectableException
4. NoSuchElementException

Edureka Questions:

TestNG Questions:
1. How to set Priority to tests in TestNG?
=> 
@Test(Priority==1)
public void tc1(){
}

@Test(Priority==0)
public void tc0(){
}

Output:
tc0
tc1

2. What are Groups in TestNG?
=>
@Test(groups={"Regression"})
@Test(groups={"Smoke"})

3. What are annotations in TestNG? //clear cache example
4. Include/Exclude methods in TestNG? //mandatory tests include as its a higher need to execute those example
5. What is XML config? //Regression or Smoke suits
6. What is parameterization?
=>
@Test
@Parameters({"Username","Password"})

7. What is dataProvider?
8. What is dependency?
@Test(dependsOnMethods={"TC3"})
@Test(dependsOnGroups={"Smoke"})

9. Explain your framework?
a. Talk about the structure
b. how you configured your XML?
c. how you are driving parameters?
d. how you built Maven?
e. Repo?
f. How CI works in your framework?
g. How you handle script failures?
h. How you share reports with broader teams?
i. How do you maintain scripts?
 
10. Why testNG?

Production Issue:
- check all email threads
- check TC executed/not and it's result
- If it's a missed, accept it.
- Why? When? Test case coverage?
- Discuss with Manager
- critical(hot fix) or deferred?
- after fix, test the change thoroughly
- set up quick call with business to review test results(optional)
- Sign off
- Support in production validation if required. 

1. Why testing?
- Passion
- Perfection
- Quality

2. Did you ever give conditional sign off?
- Yes, when you are not comfortable with the testing effort..risk based sign off..indicating some kinds of production issues in the future.
- After discussing with business team if they are ready to go with Open issues and make these open issues deferred.
- When QA has adequate time to perform regression.
- Have proper justification.

3. How do you deal with deferred defect?
- Check with business team if it's OK to defer it.
- QA responsibility to get the same fixed in next sprint.[Known issues]

4. Is unit testing necessary? Do you ask your dev to perform?
- Yes, it makes QA work easy as bugs found early in the development phase only.

5. How do you deal when requirements are not clear?
- Coordinate with BA as much as I can.
- Check with SME (Subject Matter Expert) and business team to understand the logic.
- Document everything and get it reviewed by business.
- Provide feedback to Manager and get these gaps filled for next release.

6. How do you deal with non producible defect?
- Log the defect and get it closed by dev as not reproducible.
- Make sure you have screenshot.
- Make sure you report every unusual behavior.

7. How do you coordinate QA testing progress with broader team?
- Schedule QA triage/ weekly status call with all QA team, dev, BA, Business teams.
- Discuss all my open questions with business team and document and review it.

8. Do you think testing team should involved in initial stage?
- Yes, as early as possible. It'll make us understand application better.
- May be some potential issue can be raised in design which will save time later.
- If QA engineer is occupied with multiple projects, he can be involved after development phase.

9. How do you deal when developer is not accepting your defect?
- May be he/you have misunderstood the requirement. In this case, you can send email about actual behavior 
to product team and ask if it's correct.
- Discuss this in team stand up meeting, share your screen if required and ask business if its right.

10. Do you think test cases reviews are important?
- Yes, because in case you miss any scenario, review comments might save you. [High level scenarios]

11. Do you do peer review?
- Yes, peer review test cases before submitting the same to the broader team.

12. Have you involved in the production release validation?
- Yes, I do take part in Prod validation. I come up with the test cases that need to perform on that day and post install I will execute them.
- Share the test result once complete.

13. Do you involve/assist in UAT testing?
- Yes, sometimes UAT testing team will approach me to get some help. They will leverage my test cases.

14. Explain your JIRA workflow?
- Once its "Dev Complete", the developer will say "Ready for QA" -> QA assigned and assign it to me.
- I will be notified when JIRA is assigned to my name. I will perform my validations and say "QA Approved". I will then assign to UAT.
- Begin Process -> Dev Complete -> Ready for QA -> QA Approved -> UAT Approved -> Ready for Prod -> Production

15. What is test environment?
- setup of software and hardware
- Dev, Test, UAT, Prod

16. How do you interact with BA?
- when I have questions on requirement.
- If I want requirements corrected.
- discussion on deferred defects to add in backlog list.
- If something is difficult to deliver within a time frame.

17. What is code freeze?
- Asking Dev team to maintain stable environment. 
- When code is freeze, nothing should be deployed to test environment.

18. Do you ask for a code freeze date?
- Yes. This date should be such that, at that point all the defects should be closed. 
That's when I ask for code freeze so that I can perform regression testing.

19. Do you prepare RTM?
- Yes, it helps to determine test coverage.

20. What do you mean by Production stability?
- To make sure we don't have any issues to the code that we signed off.
- Goal is to maintain 100% production stability by prioritizing QA tasks.

Tips
~70(Automation)-30(Functional/Manual)
~Tools Technologies
~front end automation 
- Selenium WebDriver with Java language binding Selenium version - 3.7 
- OOPS concepts
- designing framework
~back end - SoapUI
~Roles & Responsibilities

Selenium Challenges Faced?
1. Image verification(Bitmap comparison), Text overlapping, barcode, tool tips, captcha images.
2. Cannot automate non-web based application.
3. No direct support if face any issue, there is not market owner.
4. .No default Reporting, have to use third party tool.
5. ..Difficult to identify dynamic objects.
6. ..Handling multiple frames.
7. ..IE browser - very slow - browser resolution must be set to 100%
8. Ajax Components (For example: Drop down dependency in case of selecting Country, State, City dropdowns..have to keep wait 
till dependent contents are loaded. Use explicit wait)

Page Object Model = Page Chaining Model
Environment Variables = data config.properties

How will you initialize pageFactory?
=> PageFactory.initElements(driver, this); //This initElements method will create all WebElements

*/

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//3. Difference between Implicit wait and Explicit wait
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.google.com");
		
		//4. In how many ways Frames can be handled?
		driver.switchTo().frame("index");//index
		driver.switchTo().frame("nameOrId");//name or id
		driver.switchTo().frame("frameElement");//WebElement
		driver.switchTo().defaultContent();
		
		// 5. Code to handle 3rd child window.
		Set<String> w= driver.getWindowHandles();
		Iterator<String> it=w.iterator();
		it=w.iterator();
		it.next();
		it.next();
		int i = 1;
	    while (it.hasNext() && i < 10) {
	        String popupHandle = it.next().toString();
	        driver.switchTo().window(popupHandle);
	        System.out.println("Window title is : "+driver.getTitle());
	     //   if (i == windowCount) break;
	        i++;
	    }
	
	    	//6. How to handle HTTPs certification?
	    	DesiredCapabilities ch=new DesiredCapabilities().chrome();
	    	//Set accept SSL certs true
	    	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	    	
	    	driver.findElement(By.id("locator")).isSelected();
	    	driver.findElement(By.id("locator")).isDisplayed();
	    	driver.findElements(By.className("classname")).size();
	    	
	    	//16. How to enter text in CAPSLOCK?
	    	driver.findElement(By.name("name")).sendKeys(Keys.SHIFT,"sagar");
	    	
	    	//17. How to mouse hover on the webpage?
	    	Actions a=new Actions(driver);
	    	WebElement ele=driver.findElement(By.linkText("Product Category"));
	    	a.moveToElement(ele).build().perform();
	    	driver.findElement(By.linkText("iPads")).click();
	    	
	    	// Drag and drop
	    	WebElement source= driver.findElement(By.xpath("source"));
	    	WebElement target=driver.findElement(By.xpath("target"));
	    	a.dragAndDrop(source, target).build().perform();
	    	 	
	    	//18. Methods to handle JavaAlert?
	    	driver.switchTo().alert();
	    	
	    	//19. How to get links count in webpage?
	    	driver.findElements(By.tagName("a")).size();
	    	
	    	//20. How to validate if we are navigated to child window successfully?
	    	driver.getTitle();
	    	
	    	//27. List out methods available in ExplicitWait?
	    	WebDriverWait wait=new WebDriverWait(driver,30);
	    	wait.until(ExpectedConditions.elementToBeClickable(By.id("id")));
	    	
	    	//29. How to hit enter from webdriver commands?
	    	driver.findElement(By.name("name")).sendKeys(Keys.ENTER);
	    	
	    	if(driver.findElement(By.xpath("xpath")).isEnabled()==true)
	    	{
	    		driver.findElement(By.xpath("xpath")).click();
	    	}
	    	
	    	
	}
}