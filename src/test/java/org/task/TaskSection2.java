package org.task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskSection2 {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nandhini\\eclipse-workspace\\xlwrite\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	String url="https://demoqa.com/alerts";
	driver.navigate().to(url);
	//driver.manage().window().maximize();
	
//PROMPT ALERT	
	
	WebElement button = driver.findElement(By.xpath("(//button[text()='Click me'])[4]"));
	button.click();
	Alert a = driver.switchTo().alert();
	a.sendKeys("javaselenium");
	a.accept();
	TakesScreenshot tk = (TakesScreenshot)driver;
     File filetype = tk.getScreenshotAs(OutputType.FILE);
     File location = new File("C:\\Users\\nandhini\\eclipse-workspace\\xlwrite\\target\\facebook");
     FileUtils.copyFile(filetype, location);

}
}