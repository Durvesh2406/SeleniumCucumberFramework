package com.baseclass;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utils.PropertiesUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void initializeDriver() {
		Properties properties = PropertiesUtil.loadApplicationProperties();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		String url = properties.getProperty("application.url");
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void closeDriver() {
		driver.quit();
	}

}
