package com.mindtree.Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import com.mindtree.UiStore.TestScenario3Ui;


public class TestScenario3 extends TestScenario3Ui {
public WebDriver driver;
	
	public TestScenario3(WebDriver driver)
	{
		this.driver=driver;
	}

	public void ValidateSubmit() throws InterruptedException
    {
		try
		{
			Actions a=new Actions(driver);
			WebElement ClickPro1=driver.findElement(List2);
			a.moveToElement(ClickPro1).contextClick().build().perform();
			Thread.sleep(3000);
			WebElement ClickComp1=driver.findElement(List1);
			ClickComp1.click();
		WebElement ButtonClick=driver.findElement(Button);
		ButtonClick.click();
		
		}
	catch(Exception e)
		{
			//System.out.println("cannot able to From");
			
		}
		
    }
	public void EnterName()
    {
		try
		{

			WebElement Firstname=driver.findElement(Firstnameenter);
			Firstname.sendKeys("GnanaMuthu");
		}
		catch(Exception e)
		{
			System.out.println("Name is not entered");
			
		}
		
    }
	public void EnterMailPassword()
    {
		try
		{

			WebElement Email=driver.findElement(Emailid);
			Email.sendKeys("gnanamuthupam@gmail.com");
			WebElement Password=driver.findElement(Pass);
			Password.sendKeys("muthuGMAHA0810");

		}
		catch(Exception e)
		{
			System.out.println("Email or Password is not entered");
			
		}
		
    }
	public void CompanyNamemaildetails()
    {
		try
		{

			WebElement company=driver.findElement(Companyui);
			company.sendKeys("Mindtree");
			WebElement companyaddress=driver.findElement(CompanyaddressUi);
			companyaddress.sendKeys("gnanamuthugmg@gmail.com");
		}
		catch(Exception e)
		{
			System.out.println("CompanyNamemaildetails is not entered");
			
		}
		
    }
	public void CountryCity()
    {
		try
		{

			Select country=new Select(driver.findElement(Countryui));
			country.selectByVisibleText("United States");
			WebElement city=driver.findElement(Cityui);
			city.sendKeys("California");
		}
		catch(Exception e)
		{
			System.out.println("CountryCity is not entered");
			
		}
		
    }
	public void Address()
    {
		try
		{

			WebElement Address1=driver.findElement(Address1Ui);
			Address1.sendKeys("xyz");
			WebElement Address2=driver.findElement(AddressUi2);
			Address2.sendKeys("xyz");
		}
		catch(Exception e)
		{
			System.out.println("Address is not entered");
			
		}
		
    }
	public void StateZip()
    {
		try
		{

			
			WebElement State=driver.findElement(StateUi);
			State.sendKeys("America");
			WebElement Zip=driver.findElement(Zipui);
			Zip.sendKeys("12345");
			
		}
		catch(Exception e)
		{
			System.out.println("StateZip is not entered");
			
		}
		
    }
	public void Submit()
    {
		try
		{

			WebElement ButtonClick=driver.findElement(Button);
			ButtonClick.click();
			driver.quit();
		}
		catch(Exception e)
		{
			System.out.println("Not Submited");
			
		}
		
    }
}
