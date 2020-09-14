package selenium_learning.selenium_learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {

				 WebDriverManager.edgedriver().setup();
			     WebDriver driver = new EdgeDriver();
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				 driver.get("https://opensource-demo.orangehrmlive.com/");
				 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				 driver.findElement(By.id("btnLogin")).click();

	}

}
