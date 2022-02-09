package com.mindtree.StepDefinition;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.Pageobject.TestScenario1;
import com.mindtree.Pageobject.TestScenario3;
import com.mindtree.Reusable.Reusablecomponent;

public class TestScenario3StepDefinition {
	public WebDriver driver;
	Reusablecomponent rc =new Reusablecomponent();
    @Given("^Loggin Browser$")
    public void loggin_browser() throws Throwable {
    	driver=rc.setup();
    	driver.get(rc.baseURL);
    }

    @Then("^Validate Submit Before entering Data$")
    public void validate_submit_before_entering_data() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.ValidateSubmit();
    }

    @Then("^Enter Name$")
    public void enter_name() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.EnterName();
    }

    @Then("^Enter Email and Password$")
    public void enter_email_and_password() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.EnterMailPassword();
    }

    @Then("^Enter Company Name and Mail ID$")
    public void enter_company_name_and_mail_id() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.CompanyNamemaildetails();
    }

    @Then("^Enter Country and City$")
    public void enter_country_and_city() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.CountryCity();
    }

    @Then("^Enter Address$")
    public void enter_address() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.Address();
    }

    @Then("^Enter State and Zip$")
    public void enter_state_and_zip() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.StateZip();
    }

    @Then("^Click Submit and Validate details$")
    public void click_submit_and_validate_details() throws Throwable {
    	TestScenario3 t3=new TestScenario3(driver);
    	t3.Submit();
    }

}
