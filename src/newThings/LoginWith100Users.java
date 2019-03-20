package newThings;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWith100Users {

	public static XSSFSheet excelSheet;
	public static XSSFCell cell;
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		excelSheet=LoginWith100Users.readExcel("Path of the excel file", "Sheet number");
		for(int i=0;i<=50;i++) 
		{
			driver.get("http://erp.cisin.com/login.asp");
			driver.findElement(By.xpath("//*[@id=\"login-inner\"]/form/table/tbody/tr[1]/td/input")).sendKeys(excelSheet.getRow(i).getCell(0).getStringCellValue());
			driver.findElement(By.xpath("//*[@id=\"login-inner\"]/form/table/tbody/tr[2]/td/input")).sendKeys(excelSheet.getRow(i).getCell(1).getStringCellValue());
			driver.findElement(By.xpath("//*[@id=\"login-inner\"]/form/table/tbody/tr[4]/td/input[1]")).click();
		}
		driver.close();
			
	}
	
	public static XSSFSheet readExcel(String Path, String SheetName) {
		
		try {
			FileInputStream file=new FileInputStream("E:\\Selenium\\Udemy\\E2EProject\\NewThings\\src\\utility\\TestData.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(file);
			XSSFSheet sheet=workbook.getSheet(SheetName);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		return excelSheet;
	}
}