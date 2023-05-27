package com.mavenproject.Maven_Project;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrangeHrm {
	WebDriver driver;

	FileInputStream FRead;

	FileOutputStream FWrite;

	XSSFWorkbook wb;

	XSSFSheet sh;

	String d1, d2;

	String login, pwd;

	String wbmsg, xlmsg;

	String pass="Test case is Passed";

	String fail="Test case is Failed------";

	int rowval, rowcount;

	@BeforeTest
	public void beforeTest() throws Exception, Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();

	/*File*/ FRead=new FileInputStream("C:\\Users\\SUMAHALI\\Downloads\\M2\\Excel for maven Automation\\orange_hrm.xlsx");

	/*XSSFWorkbook*/ wb=new XSSFWorkbook(FRead);

	/*XSSFSheet*/ sh= wb.getSheetAt(0); 



	//XSSFSheet sh= wb.getSheet("Login");

	/*String*/ d1=sh.getRow(0).getCell(0).getStringCellValue();

	/*String*/ d2=sh.getRow(0).getCell(1).getStringCellValue();
	rowcount=sh.getPhysicalNumberOfRows();

	System.out.println(d1);// username
	System.out.println(d2);//password
	System.out.println(rowcount);//5

	}


	@Test 
	public void ReadWrite() throws InterruptedException, Exception {

	for(rowval=1;rowval<rowcount;rowval++)
	{
	login=sh.getRow(rowval).getCell(0).getStringCellValue();

	pwd=sh.getRow(rowval).getCell(1).getStringCellValue();
	xlmsg=sh.getRow(rowval).getCell(2).getStringCellValue();

	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(4000);
	driver.findElement(By.name("username")).clear();
	driver.findElement(By.name("username")).sendKeys(login);
	driver.findElement(By.name("password")).clear();
	driver.findElement(By.name("password")).sendKeys(pwd);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(3000);
	wbmsg=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
	System.out.println(wbmsg);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Logout")).click();

	System.out.println(" ");
	System.out.println(" ");

	System.out.println("Login id used is " + login);
	System.out.println("Password used is " + pwd);
	System.out.println("The user name is " + wbmsg);



	FWrite=new FileOutputStream("C:\\Users\\SUMAHALI\\Downloads\\M2\\Excel for maven Automation\\orange_hrm.xlsx");
	sh.getRow(rowval).createCell(3).setCellValue(wbmsg);

	if(wbmsg.equals(xlmsg))
	{
	System.out.println(pass);
	sh.getRow(rowval).createCell(4).setCellValue(pass);
	}
	else
	{
	System.out.println(fail);
	sh.getRow(rowval).createCell(4).setCellValue(fail);
	}
	wb.write(FWrite);
	}
	}



	@AfterTest
	public void afterTest() throws Exception {
	Thread.sleep(2000);
	driver.close();
	wb.close();

	}
}
