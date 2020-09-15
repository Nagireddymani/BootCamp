package com.selenium_assignment1;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Parameterized_DataProvider {

    WrapperMethods wrapperMethods;
	
	
	@Test(dataProvider = "LoginFlipKart")
	public void loginFlipKart(String username,String password)
	{
        	wrapperMethods = new WrapperMethods();
    	
			wrapperMethods.insertapp("https://www.flipkart.com/");
			
			wrapperMethods.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input", username);
			
			wrapperMethods.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input", password);
			
			wrapperMethods.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
			
			//wrapperMethods.enterbyxapth("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input", "Mobiles"+Keys.ENTER);

	}
	
	@DataProvider(name = "LoginFlipKart")
	public Object[][] passData(){
		Object[][]  data=new Object[3][2];
		//username
		data[0][0]="frank";
		//password
		data[0][1]="demo1";

		data[1][0]="joshi";
		data[1][1]="demo123";

		data[2][0]="9505411992";
		data[2][1]="Ilovedad1";
		
		return data;
	}
	
	@AfterMethod
	public void tearDown() {
	WrapperMethods.driver.quit();
	}
}
