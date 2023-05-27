package com.mavenproject.Maven_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;






public class RediffMail {
	WebDriver driver;
	FileInputStream FRead ;
	FileOutputStream FWrite;
	XSSFWorkbook wb;
	XSSFSheet sh;
	String fullName,id, pwd, re_pwd, email, mob, day, mon, year, country, city; 
	//String r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11;
	int rowCount, rowVal;
	
	@BeforeTest
	
	public void launch_browser() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		FRead = new FileInputStream("C:\\Users\\SUMAHALI\\Downloads\\M2\\Excel for maven Automation\\Book1.xlsx");
		
		wb=new XSSFWorkbook(FRead);

		sh= wb.getSheetAt(0); 
		
		/*r1= sh.getRow(0).getCell(0).getStringCellValue();
		r2= sh.getRow(0).getCell(1).getStringCellValue();
		r3= sh.getRow(0).getCell(2).getStringCellValue();
		r4= sh.getRow(0).getCell(3).getStringCellValue();
		r5= sh.getRow(0).getCell(4).getStringCellValue();
		r6= sh.getRow(0).getCell(5).getStringCellValue();
		r7= sh.getRow(0).getCell(6).getStringCellValue();
		r8= sh.getRow(0).getCell(7).getStringCellValue();
		r9= sh.getRow(0).getCell(8).getStringCellValue();
		r10= sh.getRow(0).getCell(9).getStringCellValue();
		r11= sh.getRow(0).getCell(10).getStringCellValue();*/
		
		rowCount = sh.getPhysicalNumberOfRows();
		
		System.out.println("Number of Rows : " + rowCount);
		
	}
	
	@Test
	public void rediff() throws InterruptedException {
		
		
		for(rowVal=1; rowVal<rowCount; rowVal++) {
			
			fullName = sh.getRow(rowVal).getCell(0).getStringCellValue();
			id= sh.getRow(rowVal).getCell(1).getStringCellValue();
			pwd= sh.getRow(rowVal).getCell(2).getStringCellValue();
			re_pwd= sh.getRow(rowVal).getCell(3).getStringCellValue();
			email= sh.getRow(rowVal).getCell(4).getStringCellValue();
			mob= sh.getRow(rowVal).getCell(5).getStringCellValue();
			day= sh.getRow(rowVal).getCell(6).getStringCellValue();
			mon= sh.getRow(rowVal).getCell(7).getStringCellValue();
			year= sh.getRow(rowVal).getCell(8).getStringCellValue();
			country= sh.getRow(rowVal).getCell(9).getStringCellValue();
			city= sh.getRow(rowVal).getCell(10).getStringCellValue();
			
			driver.navigate().to("http://register.rediff.com/register/register.php?FormName=user_details");
			
			WebElement FN = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
			FN.sendKeys(fullName);
			
			WebElement ID = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
			ID.sendKeys(id);
			
			driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
			Thread.sleep(1000);
			
			String act_msg = driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font/b")).getText();
			String exp_msg = "Yippie! The ID you've chosen is available.";
			
			if(act_msg.equals(exp_msg)) {
		 
			
				WebElement PWD = driver.findElement(By.xpath("//*[@id=\"newpasswd\"]"));
				PWD.sendKeys(pwd);
				
				WebElement REPWD = driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]"));
				REPWD.sendKeys(re_pwd);
				
				WebElement EMAIL = driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input"));
				EMAIL.sendKeys(email);
				
				WebElement MOB = driver.findElement(By.xpath("//*[@id=\"mobno\"]"));
				MOB.sendKeys(mob);
				
				Thread.sleep(1000);
				WebElement DAY= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
				Select s1 = new Select(DAY);
				s1.selectByVisibleText(day);
				
				Thread.sleep(1000);
				WebElement MON= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
				Select s2 = new Select(MON);
				s2.selectByVisibleText(mon);
				
				Thread.sleep(1000);
				WebElement YEAR= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
				Select s3 = new Select(YEAR);
				s3.selectByVisibleText(year);
				
				
				WebElement COUNTRY= driver.findElement(By.xpath("//*[@id=\"country\"]"));
				Select s4 = new Select(COUNTRY);
				s4.selectByVisibleText(country);
				
				WebElement CITY=driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
				Select s5 = new Select(CITY);
				s5.selectByVisibleText(city);
							
			}
		}
		
		
	}
	@AfterTest
	public void close_browser() throws IOException {
		driver.quit();
		wb.close();
	}
	

}
