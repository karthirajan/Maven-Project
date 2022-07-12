package org.school;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class TaskSecetion {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nandhini\\eclipse-workspace\\xlwrite\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	String url="https://www.flipkart.com/";
	driver.navigate().to(url);
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	 Thread.sleep(3000);
	WebElement travel = driver.findElement(By.xpath("//div[text()='Travel']"));
 Actions a = new Actions(driver);
   a.moveToElement(travel).perform();
   
  Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@type='text']")).click();
    Thread.sleep(3000);
Robot r = new Robot();
r.keyPress(KeyEvent.VK_SPACE);
   r.keyRelease(KeyEvent.VK_SPACE);
 
 

Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).click();

   Thread.sleep(2000);
   WebElement user = driver.findElement(By.xpath("//input[@type ='text']"));
   user.sendKeys("redmi");
   
   Thread.sleep(2000);
   driver.findElement(By.xpath("//button[@type='submit']")).click();
   
   Thread.sleep(2000);
   WebElement element1 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
   element1.click();
   
   Thread.sleep(2000);
   WebElement element2 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[2]"));
   element2.click();
   
   Thread.sleep(2000);
   WebElement element3 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[3]"));
   element3.click();
   
   Thread.sleep(2000);
   WebElement element4 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[4]"));
   element4.click();
   
   Thread.sleep(2000);
   WebElement element5 = driver.findElement(By.xpath("(//div[@class='_4rR01T'])[5]"));
   element5.click();
   
   Set<String> child = driver.getWindowHandles();
   List<String> multiwindow = new ArrayList<String>(child);
  driver.switchTo().window(multiwindow.get(4));
}
}
  
