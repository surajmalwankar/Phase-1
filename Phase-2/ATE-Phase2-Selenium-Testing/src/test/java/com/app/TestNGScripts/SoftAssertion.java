package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	
	
	@Test(priority='1')
	public void GetTitle()   // Called as a Test Method
	{
		
		
		SoftAssert sf = new SoftAssert();
		
		String expectedtitle = "Your Store selenium";
		String actualtitle = driver.getTitle();
		
	// this assertion will fail, captures the assertion and it will continue to run the program
	   sf.assertEquals(actualtitle, expectedtitle, "The title donot match");
	   
	   // assertTrue();
	   
	boolean searchbox =  driver.findElement(By.name("search")).isDisplayed();
	
	// if searchbox is having true, then assert condition passes
	//if searchbox is having false, then assert condition fails
	
	searchbox = false;
	
	// this assertion will fail
	
	sf.assertTrue(searchbox); //captures the assertion and it will continue to run the program
	   
	driver.findElement(By.name("search")).sendKeys("mac");
	
	driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	
	sf.assertAll();
		
	}
}