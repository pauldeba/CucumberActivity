package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\DebashisPaul\\eclipse-workspace\\ProjectCucumber\\Features",
		glue = {"stepDefinations"},
		tags = "@login",
		strict = true,
		monochrome = true,
		plugin = {"json: test-reportsjson.json"},
		publish = true
		)

public class ActivitiesRunner {}
