package selenium_learning.selenium_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
  	//   WebDriverManager.edgedriver().setup();
	     WebDriver driver = new HtmlUnitDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 System.out.println(driver.getTitle());

		 
	}

}
