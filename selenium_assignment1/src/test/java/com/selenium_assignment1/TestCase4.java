package com.selenium_assignment1;

import org.openqa.selenium.Keys;

public class TestCase4 {

	public static void main(String[] args) {
	        
		    WrapperMethods wrapperMethods = new WrapperMethods();
		
			wrapperMethods.insertapp("https://www.flipkart.com/");
			
			wrapperMethods.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input", "9505411992");
			
			wrapperMethods.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input", "Ilovedad1");
			
			wrapperMethods.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
			
			wrapperMethods.enterbyxapth("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input", "Mobiles"+Keys.ENTER);

			wrapperMethods.clickbyxpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");
			
			
	}

}
