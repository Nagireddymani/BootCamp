package com.selenium_assignment1;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartLogin {

	WrapperMethods wrapperMethods=new WrapperMethods();
	
	@BeforeTest
	public void launchApp() {
	  wrapperMethods.insertapp("https://www.flipkart.com/");	
	}
	
	@BeforeMethod
	public void loginIn() {
		
      wrapperMethods.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input", "9505411992");
		
	  wrapperMethods.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input", "Ilovedad1");
	  
	  wrapperMethods.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
   	}
	
	@Test
	public void admin() {
		wrapperMethods.enterbyxapth("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input","Mobiles"+Keys.ENTER); 
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("LogOut");
	}
	
	@AfterMethod
	public void closeApp() {
		System.out.println(wrapperMethods.driver.getTitle());
	}
	
	@AfterTest
	public void tearDown() {
		wrapperMethods.closeapp();
	}
}
