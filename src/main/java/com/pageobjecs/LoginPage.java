package com.pageobjecs;

import com.Utils.BrowserUtils;
import com.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	public static String txtEmail = "//input[@id = 'input-email']";
	public static String txtPassword = "//input[@id = 'input-password']";
	public static String btnLogin = "//input[@value = 'Login']";
	public static String Alertmsg = "//div[@class='alert alert-danger alert-dismissible']";
	public static String affiliateAccount = "//h2[normalize-space()='My Affiliate Account']";

	public static void enterUsername(String txtUsername) {
		BrowserUtils.enterText(txtEmail, txtUsername);
	}

	public static void enterPassword(String Password) {
		BrowserUtils.enterText(txtPassword, Password);
	}

	public static void ClickLogin() {
		BrowserUtils.clickElement(btnLogin);
	}

	public static boolean isErrorMessageDisplayed() {
		return BrowserUtils.elementVisible(Alertmsg);
	}

	public static boolean verifyHomepage() {
		return BrowserUtils.elementVisible(affiliateAccount);
	}

}
