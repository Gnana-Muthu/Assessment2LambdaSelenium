package com.mindtree.StepDefinition;




import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.Pageobject.TestScenario1;
import com.mindtree.Reusable.Reusablecomponent;

public class TestScenario1StepDefinition  {
	public WebDriver driver;
	Reusablecomponent rc =new Reusablecomponent();
    @Given("^Open Browser$")
    public void open_browser() throws Throwable {
    	driver=rc.setup();
    	driver.get(rc.baseURL);
    	
    }

    @Then("^Navigate to Simple Form Demo$")
    public void navigate_to_simple_form_demo() throws Throwable {
    	TestScenario1 fs=new TestScenario1(driver);
    	fs.ValidateURL();
    }

    @Then("^Enter Message$")
    public void enter_message() throws Throwable {
    	TestScenario1 fs=new TestScenario1(driver);
    	fs.EnterMessage();
    }

    @Then("^Click GetMessage$")
    public void click_getmessage() throws Throwable {
    	TestScenario1 fs=new TestScenario1(driver);
    	fs.GetMessage();
    }

    @Then("^Validate Message$")
    public void validate_message() throws Throwable {
    	TestScenario1 fs=new TestScenario1(driver);
    	fs.ValidateMessage();
    	driver.quit();
    }

}