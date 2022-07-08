package org.school;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Asection {
public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\nandhini\\eclipse-workspace\\xlwrite\\Drivers\\edgedriver_win64\\msedgedriver.exe");
	WebDriver d = new EdgeDriver();
	String url="https://web.skype.com/";
	d.navigate().to(url);
}
}
