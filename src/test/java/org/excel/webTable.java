package org.excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webTable {
	
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\eclipse-workspace\\UniversityIformation\\Driver\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver();
			String url = ("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
			Driver.get(url);;
			Driver.manage().window().maximize();
			
			WebElement single = Driver.findElement(By.xpath("(//select)[1]"));
			WebElement multiple = Driver.findElement(By.xpath("(//select)[3]"));
			Select s = new Select(single);
			s.selectByIndex(0);
			s.selectByValue("Google");
			s.selectByVisibleText("Bing");
			boolean multiple1 = s.isMultiple();
			System.out.println(multiple1);
			List<WebElement>option = s.getOptions();
			for(int i=0;i<option.size();i++) {
				WebElement Element = option.get(i);
				String text = Element.getText();
				System.out.println(text);
			}
			Select e = new Select(multiple);
			e.selectByIndex(0);
			e.selectByValue("donut");
			e.selectByVisibleText("Bonda");
			e.deselectByIndex(1);
			boolean multiple2 = e.isMultiple();
			System.out.println(multiple2);
			WebElement first = e.getFirstSelectedOption();
			String text1 = first.getText();
			System.out.println(text1);
			List<WebElement> all = e.getAllSelectedOptions();
			for(int i=0;i<all.size();i++) {
				WebElement element = all.get(i);
				String text2 = element.getText();
				System.out.println(text2);
			}
			
	}
	}

