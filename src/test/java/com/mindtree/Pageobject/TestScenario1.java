package com.mindtree.Pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import com.mindtree.UiStore.TestScenario1Ui;


public class TestScenario1 extends TestScenario1Ui {
public WebDriver driver;
	
	public TestScenario1(WebDriver driver)
	{
		this.driver=driver;
	}

	public void ValidateURL() throws InterruptedException
    {
		
		try
		{
	    	Actions a=new Actions(driver);
			WebElement ClickPro1=driver.findElement(List2);
			a.moveToElement(ClickPro1).contextClick().build().perform();
				Thread.sleep(3000);
				WebElement ClickComp1=driver.findElement(List1);
				ClickComp1.click();
			String Actualvalue=driver.getCurrentUrl();
			//String Expectedvalue="simple-form-demo";
			//System.out.println(Actualvalue);
			Actualvalue.contains("simple-form-demo");
			//Assert.assertEquals(Expectedvalue,Actualvalue);
			
    	   
		}
		catch(Exception e)
		{
		System.out.println("cannot able to From");
			
		}
		
    }
	public void EnterMessage()
    {
		try
		{

			 WebElement Fromclick=driver.findElement(EnterMessage);
	    	   Fromclick.sendKeys("Welcome to LambdaTest");
	    	   WebElement GetValue=driver.findElement(Getvaluebutton);
	    	   GetValue.click();
		}
		catch(Exception e)
		{
			System.out.println("Message is not entered");
			
		}
		
    }
	public void GetMessage()
    {
		try
		{

			 
	    	   WebElement GetValue=driver.findElement(Getvaluebutton);
	    	   GetValue.click();
		}
		catch(Exception e)
		{
			System.out.println("Messagedetails is not entered");
			
		}
		
    }
	public void ValidateMessage()
    {
		try
		{
			WebElement Message=driver.findElement(Messagevalue);
	    	   String EnteredMessage=Message.getText();
	    	   String ExpectedMessage="Welcome to LambdaTest";
	    	   Assert.assertEquals(ExpectedMessage,EnteredMessage);
		}
		catch(Exception e)
		{
			System.out.println("Cannot able to validate Message");
			
		}
		
    }
}
