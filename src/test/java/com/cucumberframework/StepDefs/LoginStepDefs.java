package com.cucumberframework.StepDefs;

import java.util.Properties;

import com.Utils.PropertiesUtil;
import com.baseclass.BaseClass;
import com.pageobjecs.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs extends BaseClass {
	Properties properties = PropertiesUtil.loadUserProperties();

	@Given("User enters valid username in the username field")
	public void user_enters_valid_username_in_the_username_field() {
		LoginPage.enterUsername(properties.getProperty("username"));
	}

	@Given("User enter valid password in the password field")
	public void user_enter_valid_password_in_the_password_field() {
		LoginPage.enterPassword(properties.getProperty("password"));
	}

	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() throws InterruptedException {
		LoginPage.ClickLogin();
		Thread.sleep(3000);
	}

	@Then("User is logged in successfully")
	public void user_is_logged_in_successfully() {
		if (LoginPage.verifyHomepage()) {
			System.out.println("Login successfull");
		} else {
			System.err.println("Test Case failed -- Login unsuccessfull");
		}
	}

	@Given("User enters invalid username in the username field")
	public void user_enters_invalid_username_in_the_username_field() {
		LoginPage.enterUsername(properties.getProperty("uname"));
	}

	@Given("User enter invalid password in the password field")
	public void user_enter_invalid_password_in_the_password_field() {
		LoginPage.enterPassword(properties.getProperty("upass"));
	}

	@Then("User is not logged into the application")
	public void user_is_not_logged_into_the_application() {
		if (LoginPage.isErrorMessageDisplayed()) {
			System.out.println("Error message is displayed");
		} else {
			System.err.println("TestCase failed!! --Error message is not visible");
		}
	}

}
