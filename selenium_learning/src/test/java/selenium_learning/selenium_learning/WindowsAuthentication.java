package selenium_learning.selenium_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsAuthentication {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
	     WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");// admin is username and admin is password

	}

}
