package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {
	
	static WebDriver driver;
	static long start;
	@BeforeClass
	public static void launch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace1\\Selenium\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	
	}
	@Before
	public void starttime() {
		System.out.println("Before");
		start = System.currentTimeMillis();
		
	}
	@AfterClass
	public static void browserquit() {
		
		driver.quit();
		System.out.println("Browserquite");	
}
	@After
	public void endtime() {
		long end = System.currentTimeMillis();
		System.out.println("After time :"+(+end-start));
	
	}
	
	
	@Test
	public void method1() {
		
		WebElement t=driver.findElement(By.xpath("//button[text()='✕']"));
		t.click();
	}
	@Test
	public void method2() throws InterruptedException {
	WebElement s=driver.findElement(By.xpath("//input[@type='text']"));
	s.sendKeys("iphone 12");
	WebElement o=driver.findElement(By.xpath("//button[@type='submit']"));
	o.click();
	Thread.sleep(3000);
	
	}
	
	@Test
	public void method3() {
		WebElement a=driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		a.click();
	String q=a.getText();
	System.out.println(q);
	}
	
	@Test
	public void method4() throws Exception {
		String pWin=driver.getWindowHandle();
		Set<String>allWin=driver.getWindowHandles();
		for(String x : allWin){
			if(!x.equals(pWin)) {
				driver.switchTo().window(x);
			}}
		Thread.sleep(3000);
			
			WebElement c=driver.findElement(By.xpath("//span[@class='B_NuCI']"));
			String text=c.getText();
			
			
			File f=new File("C:\\Users\\Administrator\\eclipse-workspace\\Flipkart\\src\\main\\resources\\Excel\\New Microsoft Office Excel Worksheet (2).xlsx");
			FileOutputStream d=new FileOutputStream (f);
			Workbook w=new XSSFWorkbook(); 
			Sheet sh=w.createSheet("Flipkart");
			Row r=sh.createRow(1);
			Cell c1= r.createCell(1);
			c1.setCellValue(text);
			w.write(d);	
			
		}

	
	@Test
	public void method5() throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src =ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img.png");
		FileHandler.copy(src, dest);	
		
		
		
	}
	}


