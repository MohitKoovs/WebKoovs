package com.koovs.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.koovs.qa.base.TestBase;

public class HomePage extends TestBase{

	//Page Factory - OR:
	
		@FindBy(xpath="//div/a[@data-reactid='9']")
		WebElement koovsLogo;
		
		//Initializing the Page Objects:
		public HomePage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateHomePageTitle(){
			return driver.getTitle();
		}
		
		public boolean validateKoovsLogo(){
			return koovsLogo.isDisplayed();
		}
		
		/*public LoginPage login(String un, String pwd){
			username.sendKeys(un);
			password.sendKeys(pwd);
			//loginBtn.click();
			    	JavascriptExecutor js = (JavascriptExecutor)driver;
			    	js.executeScript("arguments[0].click();", loginBtn);
			return new LoginPage();
		}*/
		
}
