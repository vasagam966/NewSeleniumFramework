package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Baseclass {
	public static WebDriver driver;

	//public  WebElement element;
	public static void startChrome() {
		if (driver == null) { // Ensure driver is only set up once
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	}

	public static void startEdge() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		
	}
	public static void maxmimizeBrowser() {
		driver.manage().window().maximize();
	}
	public static void openTheUrl(String url) {
		driver.get(url);
	}
	public static void closeThebrowser() {
		driver.close();
	}
	public static void selectValueIndropdown(WebElement element,String value){
		Select s = new Select(element);
		s.selectByVisibleText(value);

	}
	public static void waitAndSetText(WebElement element, String text) {
		element.sendKeys(text);
	}

	}




