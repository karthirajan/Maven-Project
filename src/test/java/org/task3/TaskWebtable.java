package org.task3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskWebtable {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nandhini\\eclipse-workspace\\Selenium\\Driver\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.navigate().to("https://www.techlistic.com/p/demo-selenium-practice.html");
	List<WebElement> table = driver.findElements(By.xpath("//table"));
	for (int i = 0; i < table.size()-1; i++) {
		WebElement table1 = table.get(i);
		WebElement tbody= table1.findElement(By.tagName("tbody"));
		List<WebElement> trow = tbody.findElements(By.tagName("tr"));
		for (int j = 0; j < trow.size(); j++) {
			WebElement row = trow.get(j);
		 List<WebElement> tdata = row.findElements(By.tagName("td"));
		 for (int k = 0; k < tdata.size(); k++) {
			WebElement Data = tdata.get(k);
			String text = Data.getText();
			System.out.println(text);
		}
		}
	}

	//List<WebElement> table2 = driver.findElements(By.xpath("//table"));
	//for (int i = table.size()-1; i < table.size(); i++) {
		//WebElement table1 = table.get(i);
	WebElement table1 = driver.findElement(By.xpath("(//table)[2]"));
		WebElement tbody= table1.findElement(By.tagName("tbody"));
		List<WebElement> trow = tbody.findElements(By.tagName("tr"));
		for (int j = 0; j < trow.size(); j++) {
			
			WebElement row = trow.get(j);
		 List<WebElement> tdata = row.findElements(By.tagName("td"));
		 for (int k = 0; k < tdata.size(); k++) {
			WebElement Data = tdata.get(k);
			String text = Data.getText();
			System.out.println(text);
			System.out.println("Row No of Text:"+j);
			System.out.println("Column No of Text:"+k);
		}
		}
	}
}
//}
