package com.selenium_assignment1;



public class TestCase1 {
	public static void main(String[] args) {
	
		 WrapperMethods wrapper = new WrapperMethods();
		 
		 wrapper.insertapp("https://www.flipkart.com/");
		 
		 wrapper.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input", "9505411992");
		
		 wrapper.enterbyxapth("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input", "Ilovedad1");
		 
		 wrapper.clickbyxpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button");
		 
		
	}
}
