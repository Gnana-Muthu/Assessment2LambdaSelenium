package com.mindtree.Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@Test
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue={"com.mindtree.StepDefinition"},
		dryRun=false,
		monochrome=true,
		strict=true
	
		)


public class Runner extends AbstractTestNGCucumberTests {
	
}
