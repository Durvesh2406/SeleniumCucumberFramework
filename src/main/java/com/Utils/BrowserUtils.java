package com.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclass.BaseClass;

public class BrowserUtils extends BaseClass {

	public static void clickElement(String element) {
		try {
			findAndWaitforElement(element).click();
		} catch (Exception e) {
			System.out.println("Unable to click Element" + e.getMessage());
		}
	}

	public static void enterText(String element, String text) {
		try {
			findAndWaitforElement(element).sendKeys(text);
		} catch (Exception e) {
			System.out.println("Unable to input text" + e.getMessage());
		}
	}

	public static WebElement findAndWaitforElement(String xpath) {
		WebElement element = null;
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			element = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(xpath))));
		} catch (Exception e) {
			System.out.println("Element not Found!!" + e.getMessage());
		}
		return element;
	}

	public static boolean elementVisible(String xpath) {
		WebElement element = findAndWaitforElement(xpath);
		if (element == null) {
			throw new AssertionError("Element not found" + xpath);
		}
		return element.isDisplayed();
	}
}
