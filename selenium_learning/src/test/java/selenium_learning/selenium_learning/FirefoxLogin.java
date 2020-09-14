package selenium_learning.selenium_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLogin {

	public static void main(String[] args) {
		         // Firefox Browser is necessary; 
				 WebDriverManager.firefoxdriver().setup();
			     WebDriver driver = new FirefoxDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				 driver.get("https://www.facebook.com/");

	}

}
