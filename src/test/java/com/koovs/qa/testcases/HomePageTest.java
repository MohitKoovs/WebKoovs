package com.koovs.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.koovs.qa.pages.HomePage;

import com.koovs.qa.base.TestBase;

public class HomePageTest extends TestBase {
	
	HomePage homePage;
	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		homePage = new HomePage();
	
	}
	
	@Test (priority=1)
	public void NavigateHomePageTest(){
		Assert.assertEquals("https://www.koovs.com/",driver.getCurrentUrl());
	}
	
	@Test (priority=2)
	public void HomePageTitleTest(){
		String title = homePage.validateHomePageTitle();
		Assert.assertEquals(title, "Online Shopping - Shop for Clothing, Shoes & Accessories in India at Koovs");
	}
	
	@Test(priority=3)
	public void KoovsLogoImageTest(){
		boolean flag = homePage.validateKoovsLogo();
		Assert.assertTrue(flag);
	}
	
/*	
	@Test(priority=4)
	public void loginTest(){
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	*/
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
