package com.mindtree.Pageobject;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


import com.mindtree.UiStore.TestScenario2Ui;


public class TestScenario2 extends TestScenario2Ui {
public WebDriver driver;
	
	public TestScenario2(WebDriver driver)
	{
		this.driver=driver;
	}

	public void ClickDragSliders() throws InterruptedException
    {
		try
		{
			Actions a=new Actions(driver);
			Thread.sleep(3000);
			WebElement ClickPro1=driver.findElement(List2);
			a.moveToElement(ClickPro1).contextClick().build().perform();
				Thread.sleep(3000);
				WebElement ClickComp1=driver.findElement(List1);
				ClickComp1.click();
		
		}
	catch(Exception e)
		{
		System.out.println("Not clicked");
			
		}
		
    }
	public void SelectandDrag95()
    {
		try
		{

			WebElement Select=driver.findElement(Slide);
			Actions a2 =new Actions(driver);
			int xOffset;
			int yOffset;
			a2.moveToElement(Select).click().dragAndDropBy(Select, xOffset=441, yOffset=663).build().perform();
		}
		catch(Exception e)
		{
			System.out.println("Not Dragged");
			
		}
		
    }
	public void ValidateSlidevalue()
    {
		try
		{

			WebElement dragvalue=driver.findElement(Output);
			String Actual =dragvalue.getText();
			String Expected = "95";
			assertEquals(Actual, Expected);
			System.out.println(Expected);
			
			

		}
		catch(Exception e)
		{
			System.out.println("validate");
			
		}
		
    }
	
}
