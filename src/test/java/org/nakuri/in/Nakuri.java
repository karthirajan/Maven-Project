package org.nakuri.in;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nakuri {

	public static void main(String[]args) throws Exception
	{
		
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.naukri.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement Reg = driver.findElement(By.xpath("//div[text()='Register']"));
	    Reg.click();
	    
	    String pwin =driver.getWindowHandle();
	    Set<String> allwin = driver.getWindowHandles();
	    for (String x : allwin)
	    {
	    	if(!x.equals(pwin))
	    	{
	    		driver.switchTo().window(x);
	    	}
	    }
	    
	   
	    WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
	    name.sendKeys("Radha");
	    
	    WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
	    email.sendKeys("Radha37632@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8596734586");
	    driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("8596734586");
	    driver.findElement(By.xpath("(//div[@class='textWrap'])[2]")).click();
	    driver.findElement(By.xpath("//span[text()='Chennai']")).click();
	    //driver.findElement(By.xpath("//input[@id='currentCity']")).sendKeys("Chennai");
	    Robot r = new Robot();
	    //r.keyPress(KeyEvent.VK_DOWN);
	    //r.keyRelease(KeyEvent.VK_DOWN);
	    //r.keyPress(KeyEvent.VK_ENTER);
	    //r.keyRelease(KeyEvent.VK_ENTER);
	   WebElement register = driver.findElement(By.xpath("//button[text()='Register Now']"));
	    Actions a= new Actions(driver);
	    a.doubleClick(register).perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Skip']")).click();
	    driver.findElement(By.xpath("//span[text()='Graduation/Diploma']")).click();
	    driver.findElement(By.xpath("//span[text()='B.Tech/B.E.']")).click();
	    driver.findElement(By.xpath("//input[@name='course-suggestor']")).sendKeys("Computers");
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    driver.findElement(By.xpath("//input[@name='institute-suggestor']")).sendKeys("Madras University");
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    driver.findElement(By.xpath("//span[text()='Full Time']")).click();
	    driver.findElement(By.xpath("//span[text()='2020']")).click();
	    driver.findElement(By.xpath("//input[@class='suggestor-input ']")).sendKeys("java");
	    r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    driver.findElement(By.xpath("//button[text()='Save and Continue']")).click();
	    driver.findElement(By.xpath("//textarea[@id='resumeHeadline']")).sendKeys("Based On Java And Selenium");
	    driver.findElement(By.xpath("(//div[@class='textWrap'])[1]")).click();
	    driver.findElement(By.xpath("//span[text()='Permanent']")).click();
	    driver.findElement(By.xpath("//span[text()='Full Time']")).click();
	    driver.findElement(By.xpath("//span[text()='Chennai']")).click();
	    driver.findElement(By.xpath("//span[text()='Female']")).click();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
