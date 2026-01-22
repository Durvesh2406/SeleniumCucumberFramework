package com.cucumberframework;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features/Login.feature" }, plugin = { "pretty",
		"html: target/cucumber.html", "json: target/cucumber.json" }, publish = true)
public class TestRunner {
}
