package com.mindtree.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.Pageobject.TestScenario2;
import com.mindtree.Reusable.Reusablecomponent;

public class TestScenario2StepDefinition {
	public WebDriver driver;
	Reusablecomponent rc =new Reusablecomponent();
    @Given("^Initilaises Browser$")
    public void initilaises_browser() throws Throwable {
    	driver=rc.setup();
    	driver.get(rc.baseURL);
    }

    @Then("^Click Drag and Drop Sliders$")
    public void click_drag_and_drop_sliders() throws Throwable {
    	TestScenario2 ts2= new TestScenario2(driver);
    	ts2.ClickDragSliders();
    }

    @Then("^Select Default value 15 and drag to 95$")
    public void select_default_value_15_and_drag_to_95() throws Throwable {
    	TestScenario2 ts2= new TestScenario2(driver);
    	ts2.SelectandDrag95();
    }

    @Then("^Validate the Range Value$")
    public void validate_the_range_value() throws Throwable {
    	TestScenario2 ts2= new TestScenario2(driver);
    	ts2.ValidateSlidevalue();
    	driver.quit();
    }

}