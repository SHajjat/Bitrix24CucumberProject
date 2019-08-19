package com.bitrix24.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/rerun.txt",// same value we fave rerun + @ at the beginning
		glue = "com.vytrack.step_definitions",
		plugin = {"html:target/default-cucumber-reports", // this creates the first normal report
				"json:target/cucumber2.json" // this creates the fancy report cucumber2 not to overwrite
		}

)

public class FailedTestRunner {
}
