package org.waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsTask {
	public static void main(String[] args, WebDriver driver) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\nandhini\\eclipse-workspace\\xlwrite\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriverWait w = new WebDriverWait(driver, 30);

		
	}

}
