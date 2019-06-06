package com.bookit.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {
		"@amazon"}, features = "src/test/resources/features", glue = "com/bookit/step_definitions", dryRun = false, plugin = {
				"pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports"}
// monochrome = true

)
public class CukesRunner {

}
