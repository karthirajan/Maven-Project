package org.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskJavaScript {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nandhini\\eclipse-workspace\\xlwrite\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	String url="https://www.facebook.com/";
	driver.navigate().to(url);
	WebElement user = driver.findElement(By.id("email"));
	WebElement scrolldown = driver.findElement(By.xpath("//a[text()='Careers']"));
	   JavascriptExecutor js =  (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].setAttribute('value','java')",user);
	js.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
	
	Object executeScript = js.executeScript("return arguments[0].getAttribute('value')",user);
	System.out.println(executeScript);
}
}
