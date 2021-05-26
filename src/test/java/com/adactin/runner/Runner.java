package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.Base_Parentclass;

import cucumber.api.CucumberOptions;


import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactinfeature\\cucumberAdactinfeature",
                     glue = "src\\test\\java\\com\\adactin\\stepdefinition")
public class Runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() throws InterruptedException {
		driver = Base_Parentclass.browserLaunch("chrome");
		

	}
	@AfterClass
	public static void tearDown() {
		driver.quit();

	}
	

}
